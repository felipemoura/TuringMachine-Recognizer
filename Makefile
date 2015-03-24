build:
	@javac *.java

run:
	@java Main
	
clean:
	@rm *.class

zip:
	@zip -r fmoreira-Project02 *
