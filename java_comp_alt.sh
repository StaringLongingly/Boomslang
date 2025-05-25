export CLASSPATH=".:/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH"

#echo compilation time:
javac transpiler/Boomslang_TS.java
#echo ------------
#java transpiler/Boomslang_TS.java ~/Documents/code/ANTLR/Boomslang/tabloid\ sc/factorial.tbd

java transpiler/Boomslang_TS.java ~/Documents/code/ANTLR/Boomslang/tabloid_source/fibonacci.tbd
