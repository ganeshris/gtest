FROM java:8-jdk-alpine
COPY ./gtest/HelloWorld/target/HelloWorld-0.0.1-SNAPSHOT.jar /usr/app/gtest.jar
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/gtest.jar"]