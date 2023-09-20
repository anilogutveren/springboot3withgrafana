# Spring Boot 3 New Features with Monitoring

Used features:

- Records
- CustomExceptionHandler
- ProblemDetail
- Actuator
- Observability API

## Create docker image
Dockerfile is in the root of the project.

```shell
docker image build -t springappmonitoring .
```


Optional: Test the container locally
```shell
docker container run -p 8080:8080 --name monitoring springappmonitoring
```
## How to observe with actuator

![img.png](img.png)

## Start Prometheus with Grafana

