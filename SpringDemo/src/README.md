# Build
mvnw spring-boot:run

# User Service
## Add a user
curl localhost:8080/user/add -d name=Jack -d password=passwordForJack

## Check user table results
curl 'localhost:8080/user/all'