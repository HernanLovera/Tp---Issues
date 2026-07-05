// Archivo: TestArchivo.java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;
import java.io.*;

public class TestArchivo {
    public static void main(String[] args) {
        try {
            // Verificar si se pasó un archivo como argumento
            String archivo = "ejemplo.nova"; // Por defecto
            if (args.length > 0) {
                archivo = args[0];
            }
            
            System.out.println("📂 Leyendo archivo: " + archivo);
            System.out.println("========================================");
            
            // Leer el archivo
            String codigo = new String(Files.readAllBytes(Paths.get(archivo)));
            System.out.println(codigo);
            System.out.println("========================================");
            
            // Analizar
            CharStream input = CharStreams.fromString(codigo);
            NovaLexer lexer = new NovaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            NovaParser parser = new NovaParser(tokens);
            
            // Agregar manejador de errores
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                      int line, int charPositionInLine, String msg,
                                      RecognitionException e) {
                    System.err.println("❌ ERROR SINTÁCTICO - Línea " + line + ":" + charPositionInLine);
                    System.err.println("   " + msg);
                }
            });
            
            // Parsear
            ParseTree tree = parser.programa();
            
            System.out.println("\n✅ ¡ANÁLISIS EXITOSO!");
            System.out.println("El código es sintácticamente correcto");
            System.out.println("\n📊 ÁRBOL SINTÁCTICO:");
            System.out.println(tree.toStringTree(parser));
            
            // Mostrar tokens
            System.out.println("\n📝 TOKENS ENCONTRADOS:");
            for (Token token : tokens.getTokens()) {
                String tokenName = NovaLexer.VOCABULARY.getSymbolicName(token.getType());
                if (tokenName != null) {
                    System.out.println("   " + tokenName + " : '" + token.getText() + "'");
                }
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("❌ Error: No se encontró el archivo 'ejemplo.nova'");
            System.err.println("   Asegúrate de que el archivo existe en la carpeta actual");
            System.err.println("   Carpeta actual: " + System.getProperty("user.dir"));
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}