export CLASSPATH=".:/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH"

#echo compilation time:
javac transpiler/Tabloid2Python.java
#echo ------------
java transpiler/Tabloid2Python.java ~/Documents/code/ANTLR/Boomslang/tabloid_source/sample6.tbd -cd

#java transpiler/Boomslang_TS.java ~/Documents/code/ANTLR/Boomslang/tabloidc/fibonacci.tbd
