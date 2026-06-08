---
inclusion: always
---

# Architecture — microGateway

## Stack
- **Framework:** Spring Boot + Spring Cloud Gateway
- **Language:** Java
- **Build:** Maven
- **Role:** API Gateway for microservices cluster

## Module Boundaries (from graphify: 21 nodes, 23 edges, 4 communities)
- God nodes: `SecurityHeadersFilter` (3 edges), `CorsConfig` (2), `MicroGatewayApplication` (2)
- Minimal codebase — Java filters + config classes + route definitions
- `SecurityHeadersFilter` — Adds security headers to all responses
- `CorsConfig` — CORS configuration (bean-based, not just YAML)
- Routes traffic to downstream services via Eureka service discovery

## Dependency Rules
- NO business logic in the gateway
- Security filters in Java (`SecurityHeadersFilter`) — not just YAML config
- CORS configured via `CorsConfig` bean — produces `CorsWebFilter`
- Routing rules in `application.yml`
- Routes reference service names registered in Eureka

## Ecosystem
API Gateway for: micro-adversarial-search, microNeural, microPrimeNumbers, microTracking
Registry: eurekaServer
