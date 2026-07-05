// Archivo: NovaIDE.java - VERSIÓN CORREGIDA
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class NovaIDE extends JFrame {
    
    // Componentes principales
    private JTextPane editorCodigo;
    private JTextArea areaResultados;
    private JTabbedPane panelTabs;
    private JFileChooser fileChooser;
    private JLabel statusBar;
    
    // Palabras reservadas de Nova
    private Set<String> palabrasReservadas = new HashSet<>(Arrays.asList(
        "class", "var", "func", "return", "if", "else", "while",
        "main", "true", "false", "print", "extends", "new",
        "Int", "Float", "Bool", "String", "Void"
    ));
    
    public NovaIDE() {
        setTitle("🚀 Mini IDE para Nova - Analizador Léxico y Sintáctico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        initComponents();
        cargarEjemploInicial();
    }
    
    private void initComponents() {
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(600);
        
        // ==========================================
        // PANEL IZQUIERDO: Editor
        // ==========================================
        JPanel panelEditor = new JPanel(new BorderLayout());
        panelEditor.setBorder(BorderFactory.createTitledBorder("📝 Editor de Código Nova"));
        
        JToolBar toolbarEditor = new JToolBar();
        toolbarEditor.setFloatable(false);
        
        JButton btnAbrir = new JButton("📂 Abrir");
        btnAbrir.addActionListener(e -> abrirArchivo());
        
        JButton btnGuardar = new JButton("💾 Guardar");
        btnGuardar.addActionListener(e -> guardarArchivo());
        
        JButton btnEjecutar = new JButton("▶️ Analizar");
        btnEjecutar.setBackground(new Color(0, 180, 0));
        btnEjecutar.setForeground(Color.WHITE);
        btnEjecutar.addActionListener(e -> analizarCodigo());
        
        JButton btnLimpiar = new JButton("🧹 Limpiar");
        btnLimpiar.addActionListener(e -> limpiarEditor());
        
        JButton btnEjemplo = new JButton("📄 Cargar Ejemplo");
        btnEjemplo.addActionListener(e -> cargarEjemploCompleto());
        
        toolbarEditor.add(btnAbrir);
        toolbarEditor.add(btnGuardar);
        toolbarEditor.addSeparator();
        toolbarEditor.add(btnEjecutar);
        toolbarEditor.add(btnLimpiar);
        toolbarEditor.addSeparator();
        toolbarEditor.add(btnEjemplo);
        
        editorCodigo = new JTextPane();
        editorCodigo.setFont(new Font("Consolas", Font.PLAIN, 14));
        editorCodigo.setBackground(new Color(250, 250, 250));
        
        JScrollPane scrollEditor = new JScrollPane(editorCodigo);
        scrollEditor.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        
        panelEditor.add(toolbarEditor, BorderLayout.NORTH);
        panelEditor.add(scrollEditor, BorderLayout.CENTER);
        
        // ==========================================
        // PANEL DERECHO: Resultados
        // ==========================================
        JPanel panelResultados = new JPanel(new BorderLayout());
        panelResultados.setBorder(BorderFactory.createTitledBorder("📊 Resultados del Análisis"));
        
        panelTabs = new JTabbedPane();
        
        // Tab: Tokens
        JTextArea areaTokens = new JTextArea();
        areaTokens.setFont(new Font("Consolas", Font.PLAIN, 12));
        areaTokens.setEditable(false);
        JScrollPane scrollTokens = new JScrollPane(areaTokens);
        panelTabs.addTab("📋 Tokens", scrollTokens);
        
        // Tab: Árbol Sintáctico
        areaResultados = new JTextArea();
        areaResultados.setFont(new Font("Consolas", Font.PLAIN, 12));
        areaResultados.setEditable(false);
        JScrollPane scrollArbol = new JScrollPane(areaResultados);
        panelTabs.addTab("🌳 Árbol Sintáctico", scrollArbol);
        
        // Tab: Errores
        JTextArea areaErrores = new JTextArea();
        areaErrores.setFont(new Font("Consolas", Font.PLAIN, 12));
        areaErrores.setEditable(false);
        areaErrores.setForeground(Color.RED);
        JScrollPane scrollErrores = new JScrollPane(areaErrores);
        panelTabs.addTab("❌ Errores", scrollErrores);
        
        panelTabs.putClientProperty("areaTokens", areaTokens);
        panelTabs.putClientProperty("areaErrores", areaErrores);
        
        panelResultados.add(panelTabs, BorderLayout.CENTER);
        
        splitPane.setLeftComponent(panelEditor);
        splitPane.setRightComponent(panelResultados);
        
        // ==========================================
        // BARRA DE ESTADO
        // ==========================================
        statusBar = new JLabel("✅ Listo | Archivo: nuevo.nova | Líneas: 0 | Caracteres: 0");
        statusBar.setBorder(BorderFactory.createEtchedBorder());
        statusBar.setFont(new Font("Arial", Font.PLAIN, 11));
        
        // ==========================================
        // MENÚ
        // ==========================================
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        itemAbrir.addActionListener(e -> abrirArchivo());
        JMenuItem itemGuardar = new JMenuItem("Guardar");
        itemGuardar.addActionListener(e -> guardarArchivo());
        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(e -> System.exit(0));
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);
        
        JMenu menuEjecutar = new JMenu("Ejecutar");
        JMenuItem itemAnalizar = new JMenuItem("Analizar");
        itemAnalizar.addActionListener(e -> analizarCodigo());
        JMenuItem itemLimpiar = new JMenuItem("Limpiar resultados");
        itemLimpiar.addActionListener(e -> limpiarResultados());
        menuEjecutar.add(itemAnalizar);
        menuEjecutar.add(itemLimpiar);
        
        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemAcerca = new JMenuItem("Acerca de Nova");
        itemAcerca.addActionListener(e -> mostrarAcercaDe());
        menuAyuda.add(itemAcerca);
        
        menuBar.add(menuArchivo);
        menuBar.add(menuEjecutar);
        menuBar.add(menuAyuda);
        setJMenuBar(menuBar);
        
        setLayout(new BorderLayout());
        add(splitPane, BorderLayout.CENTER);
        add(statusBar, BorderLayout.SOUTH);
        
        fileChooser = new JFileChooser(".");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
            "Archivos Nova (*.nova)", "nova"));
        
        editorCodigo.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) { actualizarStatus(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { actualizarStatus(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { actualizarStatus(); }
        });
    }
    
    // ==========================================
    // FUNCIONES DEL IDE - CORREGIDAS
    // ==========================================
    
    private void cargarEjemploInicial() {
        // ✅ CORREGIDO: Sin inicialización en declaración
        String ejemplo = """
            class Persona {
                var nombre : String;
                var edad : Int;
                
                func saludar() : Void {
                    print("Hola, soy " + nombre);
                }
                
                func cumpleanios() : Void {
                    edad = edad + 1;
                    print("Ahora tengo " + edad + " años");
                }
            }
            
            class Empleado extends Persona {
                var sueldo : Float;
                var cargo : String;
                
                func calcularBono() : Float {
                    return sueldo * 0.10;
                }
            }
            
            main {
                Persona p;
                p.nombre = "Ana";
                p.edad = 25;
                p.saludar();
                p.cumpleanios();
                
                Empleado e;
                e.nombre = "Carlos";
                e.edad = 30;
                e.sueldo = 2000.50;
                e.cargo = "Desarrollador";
                
                // ✅ AHORA SÍ: Declaración sin inicialización
                Int x;
                x = 10;
                Int y;
                y = 20;
                
                if (x < y) {
                    print("x es menor que y");
                } else {
                    print("x es mayor o igual a y");
                }
                
                Int i;
                i = 0;
                while (i < 5) {
                    print(i);
                    i = i + 1;
                }
            }
            """;
        editorCodigo.setText(ejemplo);
        actualizarStatus();
    }
    
    private void cargarEjemploCompleto() {
        // ✅ VERSIÓN COMPLETA con herencia y estructuras
        String ejemplo = """
            // ========================================
            // EJEMPLO COMPLETO DE NOVA
            // ========================================
            
            class Animal {
                var nombre : String;
                var edad : Int;
                
                func hacerSonido() : Void {
                    print("Sonido genérico");
                }
                
                func mostrarInfo() : Void {
                    print("Nombre: " + nombre);
                    print("Edad: " + edad);
                }
            }
            
            class Perro extends Animal {
                var raza : String;
                
                func hacerSonido() : Void {
                    print("¡Guau, guau!");
                }
                
                func correr() : Void {
                    print(nombre + " está corriendo");
                }
            }
            
            class Gato extends Animal {
                var color : String;
                
                func hacerSonido() : Void {
                    print("¡Miau, miau!");
                }
                
                func dormir() : Void {
                    print(nombre + " está durmiendo");
                }
            }
            
            main {
                // Creación y uso de objetos
                Perro perro;
                perro.nombre = "Rex";
                perro.edad = 3;
                perro.raza = "Labrador";
                perro.mostrarInfo();
                perro.hacerSonido();
                perro.correr();
                
                Gato gato;
                gato.nombre = "Michi";
                gato.edad = 2;
                gato.color = "Naranja";
                gato.mostrarInfo();
                gato.hacerSonido();
                gato.dormir();
                
                // Variables y operaciones
                Int x;
                x = 10;
                Int y;
                y = 20;
                Int resultado;
                resultado = x + y;
                
                print("Suma: " + resultado);
                
                // Estructuras de control
                if (x < y) {
                    print("x es menor que y");
                } else {
                    print("x es mayor o igual a y");
                }
                
                // Bucle while
                Int i;
                i = 0;
                while (i < 3) {
                    print("Iteración: " + i);
                    i = i + 1;
                }
            }
            """;
        editorCodigo.setText(ejemplo);
        actualizarStatus();
    }
    
    private void abrirArchivo() {
        int resultado = fileChooser.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {
                File archivo = fileChooser.getSelectedFile();
                String contenido = new String(Files.readAllBytes(archivo.toPath()));
                editorCodigo.setText(contenido);
                actualizarStatus();
                statusBar.setText("📂 Archivo cargado: " + archivo.getName());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, 
                    "Error al abrir el archivo: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void guardarArchivo() {
        int resultado = fileChooser.showSaveDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {
                File archivo = fileChooser.getSelectedFile();
                if (!archivo.getName().endsWith(".nova")) {
                    archivo = new File(archivo.getAbsolutePath() + ".nova");
                }
                Files.write(archivo.toPath(), editorCodigo.getText().getBytes());
                statusBar.setText("💾 Archivo guardado: " + archivo.getName());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, 
                    "Error al guardar el archivo: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void analizarCodigo() {
        String codigo = editorCodigo.getText();
        if (codigo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "No hay código para analizar", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        limpiarResultados();
        
        try {
            JTextArea areaTokens = (JTextArea) panelTabs.getClientProperty("areaTokens");
            JTextArea areaErrores = (JTextArea) panelTabs.getClientProperty("areaErrores");
            
            CharStream input = CharStreams.fromString(codigo);
            NovaLexer lexer = new NovaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            NovaParser parser = new NovaParser(tokens);
            
            // Manejador de errores mejorado
            StringBuilder errores = new StringBuilder();
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                      int line, int charPositionInLine, String msg,
                                      RecognitionException e) {
                    errores.append("❌ Línea ").append(line)
                           .append(":").append(charPositionInLine)
                           .append(" - ").append(msg).append("\n");
                }
            });
            
            ParseTree tree = parser.programa();
            
            // Mostrar tokens
            StringBuilder sbTokens = new StringBuilder();
            sbTokens.append("📝 TOKENS ENCONTRADOS:\n");
            sbTokens.append("=".repeat(50)).append("\n\n");
            sbTokens.append(String.format("%-20s | %-30s | %s\n", 
                "TIPO", "LEXEMA", "POSICIÓN"));
            sbTokens.append("-".repeat(60)).append("\n");
            
            for (Token token : tokens.getTokens()) {
                String tokenName = NovaLexer.VOCABULARY.getSymbolicName(token.getType());
                if (tokenName != null && !tokenName.equals("EOF")) {
                    sbTokens.append(String.format("%-20s | %-30s | Línea %d, Col %d\n",
                        tokenName,
                        "'" + token.getText().replace("\n", "\\n") + "'",
                        token.getLine(),
                        token.getCharPositionInLine()));
                }
            }
            sbTokens.append("\n✅ Total de tokens: ").append(tokens.size());
            areaTokens.setText(sbTokens.toString());
            
            // Mostrar errores o éxito
            if (errores.length() > 0) {
                areaErrores.setText("❌ ERRORES SINTÁCTICOS:\n\n" + errores.toString());
                panelTabs.setSelectedIndex(2);
                statusBar.setText("❌ Análisis completado con " + errores.toString().split("\n").length + " errores");
                editorCodigo.setBackground(new Color(255, 240, 240));
                
                // Mostrar sugerencias
                String sugerencias = generarSugerencias(errores.toString());
                if (!sugerencias.isEmpty()) {
                    areaErrores.append("\n\n💡 SUGERENCIAS:\n" + sugerencias);
                }
            } else {
                areaErrores.setText("✅ No se encontraron errores sintácticos");
                areaResultados.setText("🌳 ÁRBOL SINTÁCTICO:\n\n" + tree.toStringTree(parser));
                panelTabs.setSelectedIndex(1);
                statusBar.setText("✅ Análisis exitoso | " + tokens.size() + " tokens encontrados");
                editorCodigo.setBackground(new Color(240, 255, 240));
            }
            
        } catch (Exception e) {
            JTextArea areaErrores = (JTextArea) panelTabs.getClientProperty("areaErrores");
            areaErrores.setText("❌ ERROR CRÍTICO:\n\n" + e.getMessage() + 
                "\n\nStack trace:\n" + getStackTrace(e));
            panelTabs.setSelectedIndex(2);
            statusBar.setText("❌ Error crítico al analizar");
            e.printStackTrace();
        }
    }
    
    private String generarSugerencias(String errores) {
        StringBuilder sugerencias = new StringBuilder();
        if (errores.contains("=' expecting ';'")) {
            sugerencias.append("• Las declaraciones NO soportan inicialización (ej: 'Int x = 10;')\n");
            sugerencias.append("  → Use: 'Int x;' y luego 'x = 10;'\n");
        }
        if (errores.contains("no viable alternative")) {
            sugerencias.append("• Verifique que la sintaxis sea correcta\n");
            sugerencias.append("  → Revise que los puntos y coma ';' estén al final de cada sentencia\n");
        }
        return sugerencias.toString();
    }
    
    private String getStackTrace(Exception e) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement element : e.getStackTrace()) {
            sb.append("  ").append(element.toString()).append("\n");
        }
        return sb.toString();
    }
    
    private void limpiarEditor() {
        editorCodigo.setText("");
        actualizarStatus();
        editorCodigo.setBackground(new Color(250, 250, 250));
    }
    
    private void limpiarResultados() {
        JTextArea areaTokens = (JTextArea) panelTabs.getClientProperty("areaTokens");
        JTextArea areaErrores = (JTextArea) panelTabs.getClientProperty("areaErrores");
        if (areaTokens != null) areaTokens.setText("");
        if (areaResultados != null) areaResultados.setText("");
        if (areaErrores != null) areaErrores.setText("");
        editorCodigo.setBackground(new Color(250, 250, 250));
    }
    
    private void actualizarStatus() {
        String texto = editorCodigo.getText();
        int lineas = texto.isEmpty() ? 0 : texto.split("\n").length;
        int caracteres = texto.length();
        statusBar.setText(String.format(
            "📊 Líneas: %d | Caracteres: %d | Palabras: %d",
            lineas, caracteres, texto.isEmpty() ? 0 : texto.split("\\s+").length
        ));
    }
    
    private void mostrarAcercaDe() {
        String mensaje = """
            🚀 Mini IDE para Nova
            ==============================
            
            Lenguaje: Nova
            Versión: 1.1
            Creado para: Teoría de la Computación
            
            Características:
            • Analizador Léxico y Sintáctico
            • Resaltado de sintaxis básico
            • Detección de errores
            • Sugerencias de corrección
            • Visualización de tokens y árbol sintáctico
            
            Sintaxis soportada:
            • Declaración de clases con herencia
            • Atributos y métodos
            • Variables locales (sin inicialización)
            • Asignaciones a variables y atributos
            • Estructuras if/else y while
            • Operaciones aritméticas y relacionales
            
            © 2026 - Facultad de Ciencias Exactas, Químicas y Naturales
            """;
        JOptionPane.showMessageDialog(this, mensaje, "Acerca de Nova IDE", 
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    // ==========================================
    // MAIN
    // ==========================================
    public static void main(String[] args) {
        try {
            Class.forName("NovaLexer");
            Class.forName("NovaParser");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                "❌ Error: No se encontraron los analizadores de Nova.\n\n" +
                "Ejecute los siguientes comandos:\n" +
                "1. java -jar antlr-4.13.1-complete.jar -Dlanguage=Java -visitor Nova.g4\n" +
                "2. javac -cp \".;antlr-4.13.1-complete.jar\" Nova*.java\n" +
                "3. java -cp \".;antlr-4.13.1-complete.jar\" NovaIDE",
                "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new NovaIDE().setVisible(true);
        });
    }
}