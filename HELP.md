# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

## Maven
If you use Maven, you can run the application by using

<code>./mvnw spring-boot:run</code>

## JAVA
Alternatively, you can build the JAR file with

<code>./mvnw clean package</code>

and then run the JAR file, as follows:

<code>java -jar target/api-0.0.1-SNAPSHOT.jar</code>

## USAGE
Allows function to Create, Read, Update and Delete (CRUD access) to entities such as: <code>institutes</code>,<code>certificates</code> and <code>payments</code>. With paging and sort capabilities.

<code>curl -v localhost:8080</code>

Returns self documented REST APIs
<pre>
{
  "_links" : {
    "institutes" : {
      "href" : "http://localhost:8080/institutes{?page,size,sort}",
      "templated" : true
    },
    "certificates" : {
      "href" : "http://localhost:8080/certificates{?page,size,sort}",
      "templated" : true
    },
    "payments" : {
      "href" : "http://localhost:8080/payments{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8080/profile"
    }
  }
}</pre>