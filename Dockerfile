FROM openjdk:8-jre-slim
WORKDIR /integracao
COPY target/*.jar /integracao/integracao.jar
CMD java -XX:+UseContainerSupport -jar integracao.jar Main
