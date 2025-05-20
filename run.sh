export CLASSPATH=".:/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH"

javac target/Boomslang.java
java target/Boomslang.java ./tabloid\ sc/fibonacci.tbd
