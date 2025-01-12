JAVAC = javac
JAVA = java
MAIN_CLASS = jcc  # Replace with your actual main class name

compile:
	$(JAVAC) jcc.java

run: compile
	$(JAVA) $(MAIN_CLASS)

clean:
	rm -f *.class

all: compile run

