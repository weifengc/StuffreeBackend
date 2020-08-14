# Build
```bash
mvnw spring-boot:run
```

# User Service
## Add a user
```bash
curl localhost:8080/user/add -d name=Jack -d password=passwordForJack
```

## Check user table results
```bash
curl 'localhost:8080/user/all'
```

# Blog Service
## Add a new blog
```bash
curl localhost:8080/blog/add \
-d userId=2 \
-d title='A great title' \
-d description='This is the first blog I posted'
```

## Check all blogs
```bash
curl 'localhost:8080/blog/all'
```