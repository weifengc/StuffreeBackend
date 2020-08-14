# Build and Run
```bash
mvnw spring-boot:run
```
check `localhost:5000/hello` for health

## Or you can build the jar file
```bash
mvnw clean package
```
jar file should be in target/ directory.

# User Service
## Sigup
```bash
curl localhost:5000/user/signup \
-d username=user1 \
-d password=password1
```

## Check user table results
```bash
curl 'localhost:5000/user/all'
```

## Login
```bash
curl localhost:5000/user/login \
-d username=user1 \
-d password=password1
```

# Blog Service
## List 20 blogs
```bash
curl localhost:5000/blog/list?num=20
```

## Add a new blog
```bash
curl localhost:5000/blog/create \
-d userId=1 \
-d title='Title 1' \
-d description='This is the first blog'
```

## Update a blog
```bash
curl localhost:5000/blog/update \
-d messageId=1 \
-d title='updated blog 1' \
-d description='This is the first blog I posted'
```

## Check all blogs
```bash
curl 'localhost:5000/blog/all'
```