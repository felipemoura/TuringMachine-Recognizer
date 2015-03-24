build:
	@cp ~felipemoura/Documents/workspace/Automata-Project02/src/* ~felipemoura/Desktop/Project
	@javac *.java

run:
	@java Main
	
clean:
	@rm *.class

zip:
	@zip -r fmoreira-Project02 *
