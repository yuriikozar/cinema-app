# **_Cinema Service_**

### **_About_**

This application provides a service of buying tickets to the movies. It uses popular frameworks such as Hibernate and Spring. It implements such principles as SOLID, REST, Dependency Injection, etc.

### **_Technologies_**

- Java 11
- Apache Tomcat
- Hibernate
- Spring
- MySQL

### **_Overview_**

This project has several endpoints with user and administrator roles:

- POST: /register - all
- GET: /cinema-halls - user/admin
- POST: /cinema-halls - admin
- GET: /movies - user/admin
- POST: /movies - admin
- GET: /movie-sessions/available - user/admin
- POST: /movie-sessions - admin
- PUT: /movie-sessions/{id} - admin
- DELETE: /movie-sessions/{id} - admin
- GET: /orders - user
- POST: /orders/complete - user
- PUT: /shopping-carts/movie-sessions - user
- GET: /shopping-carts/by-user - user
- GET: /users/by-email - admin

POST request example using Postman:

`http://localhost:8080/movies - URL
{"title":"testMovie", "description":"test description"} - body;`

### **_How to Run_**
- Install [MySQL](https://dev.mysql.com/downloads/) and [Apache Tomcat](https://tomcat.apache.org/download-90.cgi).
- Create empty database.
- Clone this project.
- Edit database connection information(URL, username, password) in db.properties in resources folder:

`MySQL properties: db.driver=com.mysql.cj.jdbc.Driver
db.url=jdbc:YOUR DATABASE URL
db.user=YOUR USERNAME
db.password=YOUR PASSWORD`
- Add Tomcat to running configuration of your project and use / as your Tomcat application context.
- Run project using previously configured Tomcat running configuration and login as admin(admin@i.ua|admin123).
- To test some features you can use [Postman](https://www.postman.com/)
    
    Example POST request:
  `http://localhost:8080/movies - URL,
  {"title":"testMovie", "description":"test description"} - body;`