export CLASSPATH=".:/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH"

#echo compilation time:
javac transpiler/Boomslang_TS.java
#echo ------------
java transpiler/Boomslang_TS.java ~/Documents/code/ANTLR/Boomslang/tabloid_source/factorial.tbd ~/Desktop/test_out.py

#java transpiler/Boomslang_TS.java ~/Documents/code/ANTLR/Boomslang/tabloidc/fibonacci.tbd
