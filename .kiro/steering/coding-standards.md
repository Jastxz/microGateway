---
inclusion: always
---

# Coding Standards — microGateway

## Spring Cloud Gateway
- Route definitions in `application.yml`
- Security headers via `SecurityHeadersFilter` Java class (not just config)
- CORS via `CorsConfig` bean — produces `CorsWebFilter`
- Custom filters as separate `@Component` classes
- No business logic — this is infrastructure only

## Build & Run
- `./mvnw spring-boot:run`
- Requires eurekaServer running on port 8761
