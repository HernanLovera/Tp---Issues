// Archivo: TestNovaParser.java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;

public class TestNovaParser {
    
    public static void main(String[] args) {
        try {
            // Leer código fuente desde archivo o usar ejemplo
            String codigo = getExampleCode();
            
            System.out.println("=== CÓDIGO NOVA ===");
            System.out.println(codigo);
            System.out.println();
            
            // Analizar léxicamente
            CharStream input = CharStreams.fromString(codigo);
            NovaLexer lexer = new NovaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Analizar sintácticamente
            NovaParser parser = new NovaParser(tokens);
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                      int line, int charPositionInLine, String msg,
                                      RecognitionException e) {
                    System.err.println("❌ ERROR SINTÁCTICO - Línea " + line + ":" + charPositionInLine);
                    System.err.println("   " + msg);
                }
            });
            
            ParseTree tree = parser.programa();
            
            System.out.println("=== ANÁLISIS SINTÁCTICO EXITOSO ✅ ===");
            System.out.println("El código es sintácticamente correcto");
            System.out.println();
            
            // Análisis semántico
            NovaSemanticAnalyzer semanticAnalyzer = new NovaSemanticAnalyzer();
            semanticAnalyzer.visit(tree);
            
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static String getExampleCode() {
        return """
            // Definición de clases
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
                
                func mostrarInfo() : Void {
                    print("Cargo: " + cargo);
                    print("Sueldo: " + sueldo);
                }
            }
            
            // Programa principal
            main {
                // Creación de objetos
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
                e.mostrarInfo();
                e.calcularBono();
                
                // Estructuras de control
                Int x = 10;
                Int y = 20;
                
                if (x < y) {
                    print("x es menor que y");
                } else {
                    print("x es mayor o igual a y");
                }
                
                Int i = 0;
                while (i < 5) {
                    print(i);
                    i = i + 1;
                }
                
                // Expresiones aritméticas
                Int resultado = (x + y) * 2 - 5;
                print(resultado);
                
                // Operadores lógicos
                Bool esMayor = x > y;
                Bool condicion = (x > 5) && (y < 30);
                
                if (condicion) {
                    print("Condición verdadera");
                }
            }
            """;
    }
}