// Generated from Nova.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NovaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NovaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NovaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(NovaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#clase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClase(NovaParser.ClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#miembro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMiembro(NovaParser.MiembroContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#declaracionAtributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionAtributo(NovaParser.DeclaracionAtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#declaracionMetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionMetodo(NovaParser.DeclaracionMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(NovaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(NovaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#bloqueMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueMain(NovaParser.BloqueMainContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueCodigo(NovaParser.BloqueCodigoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaDeclVar}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaDeclVar(NovaParser.SentenciaDeclVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaAsignacion}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaAsignacion(NovaParser.SentenciaAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaAsignacionVar}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaAsignacionVar(NovaParser.SentenciaAsignacionVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaInvocacion}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaInvocacion(NovaParser.SentenciaInvocacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaPrint}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaPrint(NovaParser.SentenciaPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaReturn}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaReturn(NovaParser.SentenciaReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaIf}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaIf(NovaParser.SentenciaIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaWhile}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaWhile(NovaParser.SentenciaWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaBloque}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaBloque(NovaParser.SentenciaBloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#declaracionVariableLocal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionVariableLocal(NovaParser.DeclaracionVariableLocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(NovaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#asignacionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionVariable(NovaParser.AsignacionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#invocacionMetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocacionMetodo(NovaParser.InvocacionMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(NovaParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#instruccionPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionPrint(NovaParser.InstruccionPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#ifSentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSentencia(NovaParser.IfSentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#whileSentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSentencia(NovaParser.WhileSentenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMenorIgual}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMenorIgual(NovaParser.ExpMenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpLiteral}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLiteral(NovaParser.ExpLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpIgualdad}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpIgualdad(NovaParser.ExpIgualdadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMayor}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMayor(NovaParser.ExpMayorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpNew}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNew(NovaParser.ExpNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMultiplicacion}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMultiplicacion(NovaParser.ExpMultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpDiferencia}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDiferencia(NovaParser.ExpDiferenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpDivision}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDivision(NovaParser.ExpDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMenor}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMenor(NovaParser.ExpMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpSuma}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpSuma(NovaParser.ExpSumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpParentesis}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParentesis(NovaParser.ExpParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpAnd}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAnd(NovaParser.ExpAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpModulo}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpModulo(NovaParser.ExpModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpNot}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNot(NovaParser.ExpNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpID}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpID(NovaParser.ExpIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMayorIgual}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMayorIgual(NovaParser.ExpMayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpResta}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpResta(NovaParser.ExpRestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(NovaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NovaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(NovaParser.TipoContext ctx);
}