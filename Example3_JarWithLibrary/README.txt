javac -classpath ./lib/* HelloWorld.java

jar cfm runnable-hello.jar Manifest.txt HelloWorld.class

java -jar runnable-hello.jar 
