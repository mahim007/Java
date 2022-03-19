javac -d C:\Users\LEGION\Documents\Java\target .\pack1\JarDemo.java
cd C:\Users\LEGION\Documents\Java\target
jar -cvfm myDemoJar.jar .\manifest.MF .\com\java\pack1\*.class
java -jar myDemoJar.jar