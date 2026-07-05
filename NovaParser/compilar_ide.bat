@echo off
:: Archivo: compilar_ide.bat
echo ========================================
echo    🚀 COMPILANDO MINI IDE DE NOVA
echo ========================================
echo.

:: 1. Generar analizadores
echo [1/3] Generando analizadores con ANTLR...
java -jar antlr-4.13.1-complete.jar -Dlanguage=Java -visitor Nova.g4
if %errorlevel% neq 0 (
    echo [ERROR] Fallo al generar los analizadores
    pause
    exit /b 1
)
echo [OK] Analizadores generados
echo.

:: 2. Compilar el IDE
echo [2/3] Compilando NovaIDE...
javac -cp ".;antlr-4.13.1-complete.jar" NovaIDE.java
if %errorlevel% neq 0 (
    echo [ERROR] Fallo al compilar el IDE
    pause
    exit /b 1
)
echo [OK] IDE compilado
echo.

:: 3. Ejecutar el IDE
echo [3/3] Ejecutando Nova IDE...
echo.
java -cp ".;antlr-4.13.1-complete.jar" NovaIDE
pau