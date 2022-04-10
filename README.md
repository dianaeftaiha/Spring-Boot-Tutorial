# Spring Boot Tutorial
### Amigoscode
https://youtu.be/9SGDpanrc8U

**Table of Contents**

00:00 Intro

01:00 Quick Word

02:12 Spring Boot Overview

03:44 Project Overview

04:28 Spring Initializr

08:05 IntelliJ

10:29 Starting The Server

14:03 Simple API with Spring Boot

18:06 Student Class

23:19 API Layer

26:38 Business Layer

29:08 Dependency Injection

32:47 Properties file

36:15 Creating and Connecting to Database

39:48 JPA and @Entity

42:35 JPA in Action

45:52 Amigoscode Database Courses

47:35 JPA Repository

52:20 Saving Students

58:49 @Transient

01:03:01 Post Mapping

01:08:00 Writing Business Logic

01:12:43 Testing Post Request

01:15:35 Deleting Students

01:21:33 Exercise

01:22:53 Solution

01:26:54 Testing

01:29:41 Packaging and Running Application

01:34:52 Next steps


**Endpoints**


###
GET http://localhost:8080/api/v1/student

###
POST http://localhost:8080/api/v1/student
Content-Type: application/json

{
"name": "Helen Hunt",
"email": "helenhunt@gmail.com",
"dob": "1982-12-17"
}
