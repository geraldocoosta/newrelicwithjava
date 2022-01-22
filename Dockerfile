FROM openjdk:17-jdk-slim
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} app.jar
# COPY newrelic.jar /usr/local/newrelic/newrelic.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Dserver.port=$PORT -jar /app.jar"]
