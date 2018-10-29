set projectpath=%cd%
set classpath=%projectpath%\target\dependency-jars\*;%projectpath%\target\classes;

java -jar target\CSVReadWrite-0.0.1-SNAPSHOT.jar
pause