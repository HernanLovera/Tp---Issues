// Archivo: TestSimple.java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestSimple {
    public static void main(String[] args) throws Exception {
        // Código de ejemplo simple
        String codigo = """
            class Persona {
                var nombre : String;
            }
            main {
                print("Hola");
            }
            """;
        
        // Analizar
        CharStream input = CharStreams.fromString(codigo);
        NovaLexer lexer = new NovaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NovaParser parser = new NovaParser(tokens);
        
        ParseTree tree = parser.programa();
        System.out.println("✅ ¡ANÁLISIS EXITOSO!");
        System.out.println("Árbol: " + tree.toStringTree(parser));
    }
}