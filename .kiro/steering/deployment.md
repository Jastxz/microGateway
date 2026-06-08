---
inclusion: fileMatch
fileMatchPattern: "Dockerfile*,docker-compose*,.woodpecker*,application.yml,application.properties"
---

# Deployment — Spring Microservices Cluster

## Startup Order
1. eurekaServer (port 8761) — must be first
2. microGateway — routes traffic
3. Other services: microNeural, microPrimeNumbers, microTracking, micro-adversarial-search

## Local Development
- Each service: `./mvnw spring-boot:run`
- Or use workspace scripts: `start-local.sh`, `start-gateway.sh`, etc.

## Configuration
- Service name in `application.yml` → `spring.application.name`
- Eureka URL: `eureka.client.service-url.defaultZone=http://localhost:8761/eureka`
