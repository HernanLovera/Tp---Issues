@echo off
echo ========================================
echo    COMPILADOR DE NOVA - BUILD SCRIPT
echo ========================================
echo.

:: Verificar que existe Nova.g4
if not exist Nova.g4 (
    echo [ERROR] No se encuentra Nova.g4
    pause
    exit /b 1
)

:: 1. Generar analizadores con ANTLR 4
echo [1/4] Generando analizadores con ANTLR 4...
java -jar antlr-4.13.1-complete.jar -Dlanguage=Java -visitor Nova.g4
if %errorlevel% neq 0 (
    echo [ERROR] Fallo al generar los analizadores
    pause
    exit /b 1
)
echo [OK] Analizadores generados exitosamente
echo.

:: 2. Compilar todos los archivos Java
echo [2/4] Compilando archivos Java...

:: Primero compilar los generados por ANTLR
javac -cp ".;antlr-4.13.1-complete.jar" NovaBase*.java NovaLexer.java NovaParser.java NovaVisitor.java NovaListener.java

:: Luego compilar TestSimple
javac -cp ".;antlr-4.13.1-complete.jar" TestSimple.java

:: Si quieres usar TestNovaParser (comentado por ahora)
:: javac -cp ".;antlr-4.13.1-complete.jar" TestNovaParser.java

if %errorlevel% neq 0 (
    echo [ERROR] Fallo al compilar
    pause
    exit /b 1
)
echo [OK] Compilacion exitosa
echo.

:: 3. Ejecutar el parser
echo [3/4] Ejecutando el parser...
echo.
java -cp ".;antlr-4.13.1-complete.jar" TestSimple
echo.
echo [OK] Ejecucion finalizada

echo.
echo ========================================
echo    PROCESO COMPLETADO
echo ========================================
pause