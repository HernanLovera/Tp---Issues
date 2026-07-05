// Generated from Nova.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NovaParser}.
 */
public interface NovaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NovaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(NovaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(NovaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#clase}.
	 * @param ctx the parse tree
	 */
	void enterClase(NovaParser.ClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#clase}.
	 * @param ctx the parse tree
	 */
	void exitClase(NovaParser.ClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#miembro}.
	 * @param ctx the parse tree
	 */
	void enterMiembro(NovaParser.MiembroContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#miembro}.
	 * @param ctx the parse tree
	 */
	void exitMiembro(NovaParser.MiembroContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#declaracionAtributo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionAtributo(NovaParser.DeclaracionAtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#declaracionAtributo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionAtributo(NovaParser.DeclaracionAtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#declaracionMetodo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionMetodo(NovaParser.DeclaracionMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#declaracionMetodo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionMetodo(NovaParser.DeclaracionMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(NovaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(NovaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(NovaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(NovaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#bloqueMain}.
	 * @param ctx the parse tree
	 */
	void enterBloqueMain(NovaParser.BloqueMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#bloqueMain}.
	 * @param ctx the parse tree
	 */
	void exitBloqueMain(NovaParser.BloqueMainContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 */
	void enterBloqueCodigo(NovaParser.BloqueCodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 */
	void exitBloqueCodigo(NovaParser.BloqueCodigoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaDeclVar}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaDeclVar(NovaParser.SentenciaDeclVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaDeclVar}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaDeclVar(NovaParser.SentenciaDeclVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaAsignacion}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaAsignacion(NovaParser.SentenciaAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaAsignacion}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaAsignacion(NovaParser.SentenciaAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaAsignacionVar}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaAsignacionVar(NovaParser.SentenciaAsignacionVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaAsignacionVar}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaAsignacionVar(NovaParser.SentenciaAsignacionVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaInvocacion}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaInvocacion(NovaParser.SentenciaInvocacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaInvocacion}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaInvocacion(NovaParser.SentenciaInvocacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaPrint}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaPrint(NovaParser.SentenciaPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaPrint}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaPrint(NovaParser.SentenciaPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaReturn}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaReturn(NovaParser.SentenciaReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaReturn}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaReturn(NovaParser.SentenciaReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaIf}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaIf(NovaParser.SentenciaIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaIf}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaIf(NovaParser.SentenciaIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaWhile}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaWhile(NovaParser.SentenciaWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaWhile}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaWhile(NovaParser.SentenciaWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaBloque}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaBloque(NovaParser.SentenciaBloqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaBloque}
	 * labeled alternative in {@link NovaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaBloque(NovaParser.SentenciaBloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#declaracionVariableLocal}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariableLocal(NovaParser.DeclaracionVariableLocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#declaracionVariableLocal}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariableLocal(NovaParser.DeclaracionVariableLocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(NovaParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(NovaParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#asignacionVariable}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionVariable(NovaParser.AsignacionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#asignacionVariable}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionVariable(NovaParser.AsignacionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#invocacionMetodo}.
	 * @param ctx the parse tree
	 */
	void enterInvocacionMetodo(NovaParser.InvocacionMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#invocacionMetodo}.
	 * @param ctx the parse tree
	 */
	void exitInvocacionMetodo(NovaParser.InvocacionMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(NovaParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(NovaParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#instruccionPrint}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionPrint(NovaParser.InstruccionPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#instruccionPrint}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionPrint(NovaParser.InstruccionPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#ifSentencia}.
	 * @param ctx the parse tree
	 */
	void enterIfSentencia(NovaParser.IfSentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#ifSentencia}.
	 * @param ctx the parse tree
	 */
	void exitIfSentencia(NovaParser.IfSentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#whileSentencia}.
	 * @param ctx the parse tree
	 */
	void enterWhileSentencia(NovaParser.WhileSentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#whileSentencia}.
	 * @param ctx the parse tree
	 */
	void exitWhileSentencia(NovaParser.WhileSentenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpMenorIgual}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpMenorIgual(NovaParser.ExpMenorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpMenorIgual}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpMenorIgual(NovaParser.ExpMenorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpLiteral}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpLiteral(NovaParser.ExpLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpLiteral}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpLiteral(NovaParser.ExpLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpIgualdad}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpIgualdad(NovaParser.ExpIgualdadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpIgualdad}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpIgualdad(NovaParser.ExpIgualdadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpMayor}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpMayor(NovaParser.ExpMayorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpMayor}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpMayor(NovaParser.ExpMayorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpNew}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpNew(NovaParser.ExpNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpNew}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpNew(NovaParser.ExpNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpMultiplicacion}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpMultiplicacion(NovaParser.ExpMultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpMultiplicacion}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpMultiplicacion(NovaParser.ExpMultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpDiferencia}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpDiferencia(NovaParser.ExpDiferenciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpDiferencia}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpDiferencia(NovaParser.ExpDiferenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpDivision}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpDivision(NovaParser.ExpDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpDivision}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpDivision(NovaParser.ExpDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpMenor}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpMenor(NovaParser.ExpMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpMenor}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpMenor(NovaParser.ExpMenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpSuma}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpSuma(NovaParser.ExpSumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpSuma}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpSuma(NovaParser.ExpSumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpParentesis}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpParentesis(NovaParser.ExpParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpParentesis}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpParentesis(NovaParser.ExpParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpAnd}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpAnd(NovaParser.ExpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpAnd}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpAnd(NovaParser.ExpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpModulo}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpModulo(NovaParser.ExpModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpModulo}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpModulo(NovaParser.ExpModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpNot}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpNot(NovaParser.ExpNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpNot}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpNot(NovaParser.ExpNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpID}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpID(NovaParser.ExpIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpID}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpID(NovaParser.ExpIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpMayorIgual}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpMayorIgual(NovaParser.ExpMayorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpMayorIgual}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpMayorIgual(NovaParser.ExpMayorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpResta}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpResta(NovaParser.ExpRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpResta}
	 * labeled alternative in {@link NovaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpResta(NovaParser.ExpRestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(NovaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(NovaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NovaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(NovaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NovaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(NovaParser.TipoContext ctx);
}