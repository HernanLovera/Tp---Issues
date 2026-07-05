#!/bin/bash
# Archivo: build.sh - Script para compilar y ejecutar el parser de Nova

echo "=== COMPILADOR DE NOVA ==="

# 1. Generar lexer y parser
echo "1. Generando analizadores con ANTLR 4..."
java -jar antlr-4.13.1-complete.jar -Dlanguage=Java -visitor Nova.g4

if [ $? -ne 0 ]; then
    echo "❌ Error al generar los analizadores"
    exit 1
fi
echo "✅ Analizadores generados exitosamente"

# 2. Compilar archivos Java
echo "2. Compilando archivos Java..."
javac -cp ".:antlr-4.13.1-complete.jar" Nova*.java TestNovaParser.java

if [ $? -ne 0 ]; then
    echo "❌ Error al compilar los archivos"
    exit 1
fi
echo "✅ Compilación exitosa"

# 3. Ejecutar el parser
echo "3. Ejecutando el parser..."
echo ""
java -cp ".:antlr-4.13.1-complete.jar" TestNovaParser

echo ""
echo "=== FIN DEL PROCESO ==="