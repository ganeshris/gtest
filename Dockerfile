FROM java:8-jdk-alpine
RUN mkdir /usr/app
COPY ./gtest.jar /usr/app
WORKDIR /usr/app
EXPOSE 8087
ENTRYPOINT ["java", "-jar", "gtest.jar"]