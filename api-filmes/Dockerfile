FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD ./target/api-filmes-0.0.1-SNAPSHOT.jar api-filmes.jar
ENTRYPOINT ["java","-jar","/api-filmes.jar"]