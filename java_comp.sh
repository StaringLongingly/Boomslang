export CLASSPATH=".:/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH"

#echo compilation time:
javac transpiler/Tabloid2Python.java
#echo ------------

java transpiler/Tabloid2Python.java ~/Documents/code/ANTLR/Boomslang/tabloid_source/sample1.tbd 
java transpiler/Tabloid2Python.java ~/Documents/code/ANTLR/Boomslang/tabloid_source/sample2.tbd 
java transpiler/Tabloid2Python.java ~/Documents/code/ANTLR/Boomslang/tabloid_source/sample3.tbd 
java transpiler/Tabloid2Python.java ~/Documents/code/ANTLR/Boomslang/tabloid_source/sample4.tbd 
java transpiler/Tabloid2Python.java ~/Documents/code/ANTLR/Boomslang/tabloid_source/sample5.tbd 
java transpiler/Tabloid2Python.java ~/Documents/code/ANTLR/Boomslang/tabloid_source/sample6.tbd 





