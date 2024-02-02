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

The application will need a database to function here we are using MYSQL as described in property file, you may use
PostgreSQL, H2 or any suitable DB.

<code>Database name cvss</code>

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

To get a specific self documented endpoints including its params

<code>curl -v localhost:8080/profile/certificates</code>

<pre>
* Trying [::1]:8080...
* Connected to localhost (::1) port 8080
> GET /profile/certificates HTTP/1.1
> Host: localhost
> User-Agent: curl/8.4.0
> Accept: */*
> 
< HTTP/1.1 200 
< Vary: Origin
< Vary: Access-Control-Request-Method
< Vary: Access-Control-Request-Headers
< Content-Type: application/alps+json
< Transfer-Encoding: chunked
< Date: Fri, 02 Feb 2024 08:29:10 GMT
< 
{
  "alps" : {
    "version" : "1.0",
    "descriptor" : [ {
      "id" : "certificate-representation",
      "href" : "http://localhost/profile/certificates",
      "descriptor" : [ {
        "name" : "name",
        "type" : "SEMANTIC"
      }, {
        "name" : "certificateId",
        "type" : "SEMANTIC"
      }, {
        "name" : "date",
        "type" : "SEMANTIC"
      }, {
        "name" : "action",
        "type" : "SEMANTIC"
      }, {
        "name" : "description",
        "type" : "SEMANTIC"
      }, {
        "name" : "institute",
        "type" : "SEMANTIC"
      } ]
    }, {
      "id" : "get-certificates",
      "name" : "certificates",
      "type" : "SAFE",
      "descriptor" : [ {
        "name" : "page",
        "type" : "SEMANTIC",
        "doc" : {
          "format" : "TEXT",
          "value" : "The page to return."
        }
      }, {
        "name" : "size",
        "type" : "SEMANTIC",
        "doc" : {
          "format" : "TEXT",
          "value" : "The size of the page to return."
        }
      }, {
        "name" : "sort",
        "type" : "SEMANTIC",
        "doc" : {
          "format" : "TEXT",
          "value" : "The sorting criteria to use to calculate the content of the page."
        }
      } ],
      "rt" : "#certificate-representation"
    }, {
      "id" : "create-certificates",
      "name" : "certificates",
      "type" : "UNSAFE",
      "descriptor" : [ ],
      "rt" : "#certificate-representation"
    }, {
      "id" : "get-certificate",
      "name" : "certificate",
      "type" : "SAFE",
      "descriptor" : [ ],
      "rt" : "#certificate-representation"
    }, {
      "id" : "update-certificate",
      "name" : "certificate",
      "type" : "IDEMPOTENT",
      "descriptor" : [ ],
      "rt" : "#certificate-representation"
    }, {
      "id" : "patch-certificate",
      "name" : "certificate",
      "type" : "UNSAFE",
      "descriptor" : [ ],
      "rt" : "#certificate-representation"
    }, {
      "id" : "delete-certificate",
      "name" : "certificate",
      "type" : "IDEMPOTENT",
      "descriptor" : [ ],
      "rt" : "#certificate-representation"
    } ]
  }
* Connection #0 to host localhost left intact
</pre>

## Property list

https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html

Example <code>server.port=80</code>