rm *.java *.class *.interp *.tokens

export CLASSPATH=".:/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'

antlr4 Boomslang.g4
javac Boomslang*.java

grun Boomslang init ./tabloid_source/sample1.tbd
grun Boomslang init ./tabloid_source/sample2.tbd
grun Boomslang init ./tabloid_source/sample3.tbd
grun Boomslang init ./tabloid_source/sample4.tbd
grun Boomslang init ./tabloid_source/sample5.tbd
grun Boomslang init ./tabloid_source/sample6.tbd
