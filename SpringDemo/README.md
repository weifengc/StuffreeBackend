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
## List 20 blogs
```bash
curl localhost:8080/blog/list?num=20
```

## Add a new blog
```bash
curl localhost:8080/blog/create \
-d userId=1 \
-d title='Title 1' \
-d description='This is the first blog'
```

## Update a blog
```bash
curl localhost:8080/blog/update \
-d messageId=1 \
-d title='updated blog 1' \
-d description='This is the first blog I posted'
```

## Check all blogs
```bash
curl 'localhost:8080/blog/all'
```