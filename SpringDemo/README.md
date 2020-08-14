# Build
```bash
mvnw spring-boot:run
```

# User Service
## Sigup
```bash
curl localhost:8080/user/signup \
-d username=user1 \
-d password=password1
```

## Check user table results
```bash
curl 'localhost:8080/user/all'
```

## Login
```bash
curl localhost:8080/user/login \
-d username=user1 \
-d password=password1
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