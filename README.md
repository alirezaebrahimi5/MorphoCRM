
# MorphoCRM

**MorphoCRM** is a cloud-based, flexible, and dynamic CRM platform built with **Java Spring Boot**. Designed for multi-industry use, it allows users to customize structures based on specific business requirements. The project integrates advanced tools like Elasticsearch, Redis, PostgreSQL, and monitoring systems such as Grafana, Zabbix, and RedisInsight.

## Features

- **Dynamic Customization**: Tailor the CRM to meet the needs of any industry.
- **Advanced Search**: Powered by Elasticsearch for fast, scalable search capabilities.
- **Real-Time Caching**: Utilizes Redis for optimized performance.
- **PostgreSQL Integration**: A robust and scalable database solution.
- **Monitoring and Analytics**:
  - **Grafana**: Monitor application and database performance.
  - **Zabbix**: Network and system monitoring.
  - **RedisInsight**: Redis database visualization.
  - **Kibana**: Elasticsearch data visualization.
- **Containerized Deployment**: Simplified deployment with Docker Compose.

---

## Tech Stack

- **Backend**: Java Spring Boot
- **Database**: PostgreSQL
- **Caching**: Redis
- **Search**: Elasticsearch
- **Monitoring**: Grafana, Zabbix, Kibana, RedisInsight
- **Containerization**: Docker, Docker Compose

---

## Prerequisites

Before running the project, ensure you have the following installed:

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

---

## Getting Started

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/alirezaebrahimi5/morphocrm.git
   cd morphocrm
   ```

2. **Build and Run the Project**:
   Use Docker Compose to build and run the application.
   ```bash
   docker compose up --build
   ```

3. **Access the Application**:
    - App: [http://localhost:8080](http://localhost:8080)
    - Kibana: [http://localhost:5601](http://localhost:5601)
    - Grafana: [http://localhost:3000](http://localhost:3000) (Default credentials: `admin` / `admin`)
    - Zabbix Web: [http://localhost:8081](http://localhost:8081)
    - PgAdmin: [http://localhost:5050](http://localhost:5050) (Default credentials: `admin@local` / `admin`)
    - RedisInsight: [http://localhost:8001](http://localhost:8001)

4. **Default Database Credentials**:
    - PostgreSQL:
        - **Username**: `crm_user`
        - **Password**: `crm_password`
    - Redis: No authentication by default.

---

## Environment Variables

To customize configurations, update the `.env` file:

```env
SPRING_DATASOURCE_URL=jdbc:postgresql://db:5432/crm
SPRING_DATASOURCE_USERNAME=crm_user
SPRING_DATASOURCE_PASSWORD=crm_password
SPRING_REDIS_HOST=redis
SPRING_ELASTICSEARCH_HOST=elasticsearch
SPRING_ELASTICSEARCH_PORT=9200
```

---

## Directory Structure

```plaintext
morphocrm/
├── src/                       # Application source code
├── Dockerfile                 # Docker image configuration
├── docker-compose.yml         # Docker Compose configuration
├── .env                       # Environment variables
├── README.md                  # Project documentation
└── sql/                       # Database initialization scripts
```

---

## Monitoring and Visualization

- **Grafana**: Visualize performance metrics.
- **Kibana**: Analyze and visualize Elasticsearch data.
- **Zabbix**: Monitor server and network health.
- **RedisInsight**: Monitor and analyze Redis data.

---

## Contribution

We welcome contributions! To get started:

1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push the branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Create a pull request.

---

## License

**MorphoCRM** is licensed under a custom license:

- **Non-Profit Use**: Free to use, but modifications require permission.
- **Commercial Use**: Permission is required for use, modifications, and redistribution.

For detailed licensing terms or to request permission, contact:  
**Email**: [ar.ebrahimi96@gmail.com](mailto:ar.ebrahimi96@gmail.com)

---

## Contact

For any questions or support, please reach out to:
- **Name**: Alireza Ebrahimi
- **Email**: [ar.ebrahimi96@gmail.com](mailto:ar.ebrahimi96@gmail.com)
- **GitHub**: [github.com/alirezaebrahimi5](https://github.com/alirezaebrahimi5)
