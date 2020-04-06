FROM java:8-jdk-alpine
COPY ./build/libs/ascii-drawing-1.0.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "ascii-drawing-1.0.jar"]