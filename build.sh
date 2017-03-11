main=Hello
javac -d ./class -sourcepath src ./src/*.java

cd class

java $main

cd ../