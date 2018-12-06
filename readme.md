docker build -t ms.ichiba  .
docker run -it -p 8080:8080 ms.ichiba
docker run --name=ms.ichiba -it -p 8080:8080 ms.ichiba
 
docker stop $(docker ps -aq)
 
docker run  -e SPRING_CONFIG_NAME=default,ichiba  -it -p 8080:8080 ms.ichiba


Cd into ms.ichiba
docker build -t ms.ichiba  .


docker build -t ms.ichiba .
docker run --name=ms.ichiba -it -p 8080:8080 ms.ichiba
docker run --rm --name=ms.ichiba -it -p 8080:8080 ms.ichiba


./gradlew clean build
docker build -t spring-boot-with-prometheus  .
docker run --rm -it --name=spring-boot-with-prometheus  -p 8080:8080 -p 8081:8081 spring-boot-with-prometheus


docker run  -p 9090:9090  --link=spring-boot-with-prometheus:spring-boot-app --rm -v /Users/ts-manish.yadav/Documents/my/SpringBootWithPrometheus/src/main/resources/prometheus.yml:/etc/prometheus/prometheus.yml        prom/prometheus
docker-compose up -d --force-recreate