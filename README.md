# microGateway

This is the API Gateway for the microservices architecture, built with **Spring Cloud Gateway**. It acts as the single entry point for client requests, routing them to the appropriate backend services discovered via **Eureka**.

## 🚀 Technologies

- **Java**: 21
- **Spring Boot**: 3.4.1
- **Spring Cloud**: 2024.0.2
- **Discovery Client**: Netflix Eureka

## ⚙️ Configuration

The application is configured to register itself with a Eureka Registry.

- **Registry URL**: `http://localhost:8761/eureka/`
- **Server Port**: `0` (Random Port) - _Configured for dynamic scaling_
- **Application Name**: `micro-gateway`

## 📦 Getting Started

### Prerequisites

- JDK 21
- Maven 3.9+
- A running **Eureka Server** on port `8761`.

### Installation & Run

1.  **Clone the repository**:

    ```bash
    git clone <repository-url>
    cd microGateway
    ```

2.  **Build the project**:

    ```bash
    mvn clean package
    ```

3.  **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

## 🐳 Docker

The project includes a multi-stage `Dockerfile`.

### Build Image

```bash
docker build -t micro-gateway .
```

### Run Container

```bash
docker run -p 8080:8080 --network host micro-gateway
```

_Note: `--network host` is often used to facilitate easy communication with a local Eureka server._
