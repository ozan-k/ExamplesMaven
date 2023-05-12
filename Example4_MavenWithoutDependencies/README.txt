Reorganize our project structure such that it complies with the Maven's default 
project structure.

$ mkdir -p src/main/java
$ mv HelloWorld.java ./src/main/java/



We can now start using some maven commands. To compile your project, execute:

$ mvn compile



To clean your project's environment, execute:

$ mvn clean



To compile and create a jar file for your project, execute:

$ mvn package
