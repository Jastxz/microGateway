---
inclusion: manual
---

# Security — Microservices Gateway

## Security Headers
- `SecurityHeadersFilter` adds security headers to all responses
- Ensure: X-Content-Type-Options, X-Frame-Options, X-XSS-Protection, Strict-Transport-Security

## CORS
- `CorsConfig` defines allowed origins — restrict to known frontends
- Never use wildcard `*` in production
- Review allowed methods and headers

## Rate Limiting
- Gateway-level rate limiting for public endpoints
- Service-level `RequestsLimitFilter` as second line of defense

## Service Mesh
- Internal service-to-service calls via Eureka — not exposed externally
- Gateway is the ONLY public entry point
- No direct access to downstream services from outside
