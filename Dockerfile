# termporary switched from alpine to default image due a vulnerability in alpine image
FROM eclipse-temurin:17-jre

# set maintainer
LABEL maintainer="Oeguetveren"

# Create WORKDIR
RUN mkdir -p /home/monitoring

# copy jar to created homedir
COPY target/monitoring-*.jar /home/monitoring/application.jar

# Start Jar
WORKDIR /home/monitoring

CMD java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=5000,suspend=n -jar application.jar
