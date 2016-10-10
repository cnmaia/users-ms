# Users Microservice Demo Project

## Postgres running in docker

```
docker pull postgres
docker run --name users-postgres \
-p 5433:5432 -e POSTGRES_USER=postgres \ 
-e POSTGRES_PASSWORD=postgres \ 
-e POSTGRES_DB=usersdb \
-d postgres
```
