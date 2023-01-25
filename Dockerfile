FROM amazoncorretto:17-alpine
# ENV TEST_ENV="default_value123123"
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar","--spring.config.location=file:/config/application.yml"]