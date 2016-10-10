# Users Microservice Demo Project

## Postgres running in docker

```
docker pull postgres
docker run --name checkin-postgres \
-p 5433:5433 -e POSTGRES_USER=postgres \ 
-e POSTGRES_PASSWORD=postgres \ 
-e POSTGRES_DB=usersdb \
-d postgres
```
