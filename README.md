# SpringbootRESTCRUD
Springboot Project, REST API, CRUD Implementation

## How to Run 

This application is packaged as a jar which has Tomcat 8 embedded. No Tomcat or JBoss installation is necessary. You run it using the ```java -jar``` command.

* Clone this repository 
* Make sure you are using JDK 1.8 and Maven 3.x
* You can build the project and run the tests by running ```mvn clean package```
* Once successfully built, you can run the service by one of these two methods:
```
        java -jar target/SpringbootRESTCRUDDemo0.0.1-SNAPSHOT.jar
```
* Check the stdout or boot_example.log file to make sure no exceptions are thrown

Once the application runs you should see something like this

```
2022-04-25 16:03:20.012  INFO 6756 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8082 (http) with context path ''
2022-04-25 16:03:20.034  INFO 6756 --- [           main] c.s.c.SpringbootRestcrudDemoApplication  : Started SpringbootRestcrudDemoApplication in 11.362 seconds (JVM running for 13.576)
```

## About the Service

The service is just a simple User REST service. It uses an mysql database to store the data. You can edit application.properties file according to your Database Configuration

More interestingly, you can start calling some of the operational endpoints (see full list below) like (```/api/user/```)
Here are some endpoints you can call:

### Create a User Data

```
POST /api/user
Accept: application/json
Content-Type: application/json
 {
        "name": "sonam",
        "email": "sonam@gmail.com",
        "country": "India"
 }
 
RESPONSE: HTTP 201 (Created)
```

### Retrieve a list of users

```
http://localhost:8082/api/user/


Response: HTTP 200
Content: Users list 
```

### Retrieve a list of users

```
http://localhost:8082/api/user/4


Response: HTTP 302 (Found)
Content: User object (JSON) 
```

### Update a User Data

```
PUT: http://localhost:8082/api/user/4

Accept: application/json
Content-Type: application/json
{
    "name":"Sonam",
    "email":"sonam@gmail.com",
    "country":"US"
}

RESPONSE: HTTP 200 (OK)
```

### Delete a User Data

```
Delete: http://localhost:8082/api/user/4

RESPONSE: HTTP 200 (OK)
```
