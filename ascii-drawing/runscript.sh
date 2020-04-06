echo "------- Welcome: Starting the build --------------"
echo "------- running the gradle clean --------------"
gradle clean
echo "------- running the gradle build --------------"
gradle build
echo "------- running the application now --------------"
java -jar build/libs/ascii-drawing-1.0.jar