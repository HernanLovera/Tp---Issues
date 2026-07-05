// Archivo: NovaSemanticAnalyzer.java
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class NovaSemanticAnalyzer extends NovaBaseVisitor<Void> {
    
    // Tabla de símbolos
    private Map<String, ClassInfo> classes = new HashMap<>();
    private Stack<Scope> scopes = new Stack<>();
    private String currentClass = null;
    private String currentMethod = null;
    
    @Override
    public Void visitPrograma(NovaParser.ProgramaContext ctx) {
        System.out.println("\n=== ANÁLISIS SEMÁNTICO ===");
        
        // Primera pasada: recolectar todas las clases
        for (NovaParser.ClaseContext claseCtx : ctx.clase()) {
            String className = claseCtx.ID(0).getText();
            if (classes.containsKey(className)) {
                System.err.println("❌ Error: Clase duplicada '" + className + "'");
            } else {
                classes.put(className, new ClassInfo(className));
                System.out.println("✅ Clase registrada: " + className);
            }
        }
        
        // Segunda pasada: analizar cada clase
        for (NovaParser.ClaseContext claseCtx : ctx.clase()) {
            visitClase(claseCtx);
        }
        
        // Tercera pasada: verificar herencia
        for (ClassInfo cls : classes.values()) {
            if (cls.parent != null && !classes.containsKey(cls.parent)) {
                System.err.println("❌ Error: Clase base '" + cls.parent + "' no existe para '" + cls.name + "'");
            }
        }
        
        return null;
    }
    
    @Override
    public Void visitClase(NovaParser.ClaseContext ctx) {
        String className = ctx.ID(0).getText();
        currentClass = className;
        
        ClassInfo classInfo = classes.get(className);
        
        // Verificar herencia
        if (ctx.EXTENDS() != null) {
            String parentName = ctx.ID(1).getText();
            classInfo.parent = parentName;
            System.out.println("  Clase '" + className + "' extiende '" + parentName + "'");
        }
        
        // Analizar miembros
        for (NovaParser.MiembroContext miembroCtx : ctx.miembro()) {
            visitMiembro(miembroCtx);
        }
        
        currentClass = null;
        return null;
    }
    
    @Override
    public Void visitMiembro(NovaParser.MiembroContext ctx) {
        if (ctx.declaracionAtributo() != null) {
            visitDeclaracionAtributo(ctx.declaracionAtributo());
        } else if (ctx.declaracionMetodo() != null) {
            visitDeclaracionMetodo(ctx.declaracionMetodo());
        }
        return null;
    }
    
    @Override
    public Void visitDeclaracionAtributo(NovaParser.DeclaracionAtributoContext ctx) {
        String attrName = ctx.ID().getText();
        String attrType = ctx.tipo().getText();
        
        if (currentClass != null) {
            ClassInfo classInfo = classes.get(currentClass);
            if (classInfo.attributes.containsKey(attrName)) {
                System.err.println("❌ Error: Atributo duplicado '" + attrName + "' en clase '" + currentClass + "'");
            } else {
                classInfo.attributes.put(attrName, attrType);
                System.out.println("    Atributo: " + attrName + " : " + attrType);
            }
        }
        return null;
    }
    
    @Override
    public Void visitDeclaracionMetodo(NovaParser.DeclaracionMetodoContext ctx) {
        String methodName = ctx.ID().getText();
        String returnType = ctx.tipo().getText();
        currentMethod = methodName;
        
        if (currentClass != null) {
            ClassInfo classInfo = classes.get(currentClass);
            MethodInfo methodInfo = new MethodInfo(methodName, returnType);
            
            // Recolectar parámetros
            if (ctx.parametros() != null) {
                for (NovaParser.ParametroContext paramCtx : ctx.parametros().parametro()) {
                    String paramName = paramCtx.ID().getText();
                    String paramType = paramCtx.tipo().getText();
                    methodInfo.parameters.put(paramName, paramType);
                    System.out.println("      Parámetro: " + paramName + " : " + paramType);
                }
            }
            
            classInfo.methods.put(methodName, methodInfo);
            System.out.println("    Método: " + methodName + "() : " + returnType);
        }
        
        currentMethod = null;
        return null;
    }
    
    @Override
    public Void visitSentencia(NovaParser.SentenciaContext ctx) {
        // Verificar declaraciones de variables locales
        if (ctx.declaracionVariableLocal() != null) {
            NovaParser.DeclaracionVariableLocalContext varCtx = ctx.declaracionVariableLocal();
            String varType = varCtx.tipo().getText();
            String varName = varCtx.ID().getText();
            System.out.println("      Variable local: " + varName + " : " + varType);
            
            // Verificar que el tipo existe (si es una clase)
            if (!isPrimitiveType(varType) && !classes.containsKey(varType)) {
                System.err.println("❌ Error: Tipo desconocido '" + varType + "' en variable '" + varName + "'");
            }
        }
        return null;
    }
    
    private boolean isPrimitiveType(String type) {
        return type.equals("Int") || type.equals("Float") || 
               type.equals("Bool") || type.equals("String") || type.equals("Void");
    }
    
    // Clases auxiliares para la tabla de símbolos
    private static class ClassInfo {
        String name;
        String parent;
        Map<String, String> attributes = new HashMap<>();
        Map<String, MethodInfo> methods = new HashMap<>();
        
        ClassInfo(String name) {
            this.name = name;
        }
    }
    
    private static class MethodInfo {
        String name;
        String returnType;
        Map<String, String> parameters = new HashMap<>();
        
        MethodInfo(String name, String returnType) {
            this.name = name;
            this.returnType = returnType;
        }
    }
    
    private static class Scope {
        Map<String, String> variables = new HashMap<>();
    }
}