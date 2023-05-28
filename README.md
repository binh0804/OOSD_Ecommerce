# eCommerce Website

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![Bootstrap](https://img.shields.io/badge/bootstrap-%23563D7C.svg?style=for-the-badge&logo=bootstrap&logoColor=white)
![jQuery](https://img.shields.io/badge/jquery-%230769AD.svg?style=for-the-badge&logo=jquery&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![hibernate](https://img.shields.io/badge/hibernate-%20brightgreen.svg?&style=for-the-badge&logo=hibernate&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![junit](https://img.shields.io/badge/junit-%20yellowgreen.svg?&style=for-the-badge&logo=junit&logoColor=white)

![GitHub contributors](https://img.shields.io/github/contributors/phuongnt-git/ecommerce-website)
![GitHub issues](https://img.shields.io/github/issues/phuongnt-git/ecommerce-website?color=red)
![GitHub top language](https://img.shields.io/github/languages/top/phuongnt-git/ecommerce-website?color=cyan)
![GitHub repo size](https://img.shields.io/github/repo-size/phuongnt-git/ecommerce-website)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/phuongnt-git/ecommerce-website)
![Github total lines](https://sloc.xyz/github/phuongnt-git/ecommerce-website)
![GitHub commit activity](https://img.shields.io/github/commit-activity/m/phuongnt-git/ecommerce-website?color=g)
![GitHub last commit](https://img.shields.io/github/last-commit/phuongnt-git/ecommerce-website?color=yellow)
![GitHub release (latest by date)](https://img.shields.io/github/v/release/phuongnt-git/ecommerce-website)

## Overview

- Technical: **JSP** (**J**akarta **S**erver **P**ages) and **Servlet**
    - [**Java Servlet API 4.0.1**](https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api/4.0.1)
    - [**JavaServer Pages(TM) API 2.3.3**](https://mvnrepository.com/artifact/javax.servlet.jsp/javax.servlet.jsp-api)
    - [**JSTL 1.2**](https://mvnrepository.com/artifact/javax.servlet/jstl/1.2)
    - [**JavaMail API 1.6.2**](https://mvnrepository.com/artifact/com.sun.mail/javax.mail/1.6.2)
- Build: **Maven Project 4.0.0**
- [**Apache Tomcat® 9.x**](https://tomcat.apache.org/download-90.cgi)
- Relational database management system: [**MySQL Connector Java 8.0.31**](https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.31)
- Hibernate core ORM functionality: [**Hibernate 5.4.33.Final**](https://mvnrepository.com/artifact/org.hibernate/hibernate-core/6.1.5.Final)
- Integration for c3p0 Connection pooling into Hibernate ORM: [**Hibernate C3P0 Relocation 5.6.14.Final**](https://mvnrepository.com/artifact/org.hibernate/hibernate-c3p0/5.6.14.Final)

- Testing framework:
    - JUnit Jupiter is the API for writing tests using JUnit 5: [**JUnit Jupiter API 5.9.1**](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.9.1)
    - Core package for the JUnit Jupiter test engine: [**JUnit Jupiter Engine 5.9.1**](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine/5.9.1)

- PayPal SDK for integrating with the REST APIs: [**REST API SDK 1.14.0**](https://mvnrepository.com/artifact/com.paypal.sdk/rest-api-sdk/1.14.0)

- Frontend frameworks :
    - [**Bootstrap**](https://getbootstrap.com/) - Powerful, extensible, and feature-packed frontend toolkit.
    - [**jQuery**](https://jquery.com/) - jQuery is a fast, small, and feature-rich JavaScript library.
    - [**AJAX**]() (**A**synchronous **J**avaScript **a**nd **X**ML) - send and retrieve data from a server
      asynchronously without interfering with the display and behaviour of the existing page.

- Design pattern : **M**odel - **V**iew - **C**ontroller (**MVC**), **D**ata **A**ccess **O**bject (**DAO**)
- Integrated development environment (IDE) : **IntelliJ IDEA Ultimate**

## Project Structure

<pre>
<b>eCommerceWebsite</b>
├── <b>db</b>
│   ├── dump.sql                                      (Generate the logical backup of the MySQL database)
├── <b>src</b>
│   ├── <b>main</b>
│   │   ├── <b>java</b>                                       (Contains Controller & Model layer)
│   │   │   ├── <b>com.ecommerce.controller</b>
│   │   │   │   └── <b>com.ecommerce.controller.admin</b>     (Controller for admin pages)
│   │   │   │   │   └── category
│   │   │   │   │   └── customer
│   │   │   │   │   └── email
│   │   │   │   │   └── order
│   │   │   │   │   └── product
│   │   │   │   │   └── review
│   │   │   │   │   └── user
│   │   │   │   └── <b>com.ecommerce.controller.common</b>    
│   │   │   │   │   └── filter                         (Contains filters that check access from specific URLs)
│   │   │   │   │   └── error                          (Contains navigation servlets for handle errors)
│   │   │   │   └── <b>com.ecommerce.controller.shop</b>      (Controller for shop pages)
│   │   │   │   │   └── cart
│   │   │   │   │   └── customer
│   │   │   │   │   └── order
│   │   │   │   │   └── payment
│   │   │   │   │   └── product
│   │   │   │   │   └── review
│   │   │   ├── <b>com.ecommerce.model</b>
│   │   │   │   └── dao                                (Classes for connecting to database)
│   │   │   │   └── domain                             (Consists of classes using on domain)
│   │   │   │   └── entity                             (Consists of Entity access classes)
│   │   │   ├── <b>com.ecommerce.service</b>                  (Handle business logic for controller)
│   │   │   ├── <b>com.ecommerce.utility</b>                  (For common extracted method)
│   │   ├── <b>resources</b>                                  (Contains connections to model layer)
│   │   │   ├── <b>META-INF</b>
│   │   │   │   └── <a href="./src/main/resources/META-INF/persistence.xml" target="_blank">persistence.xml</a>                    (Configure a given JPA Persistence Unit)
│   │   │   └── <a href="./src/main/resources/hibernate.cfg.xml" target="_blank">hibernate.cfg.xml</a>                      (Configure a Hibernate Reverse Engineering)
│   │   ├── <b>webapp</b>                                     (Contains connections to View layer)
│   │   │   ├── <b>admin</b>                                  (Contain jsp files for admin page)
│   │   │   ├── <b>assets</b>
│   │   │   │   └── bootstrap
│   │   │   │   └── css
│   │   │   │   └── fonts
│   │   │   │   └── img
│   │   │   │   └── js
│   │   │   │   └── sass
│   │   │   │   └── scss
│   │   │   ├── <b>common</b>                                 (Contains jsp files for friendly error page)
│   │   │   ├── <b>shop</b>                                   (Contains jsp files for shop page)
│   │   │   ├── <b>WEB-INF</b>
│   │   │   │   └─── <a href="./src/main/webapp/WEB-INF/web.xml" target="_blank">web.xml</a>
│   ├── <b>test</b>
│   │   ├── <b>com.ecommerce.model</b>                    
│   │   │   └── <b>com.ecommerce.model.dao</b>                (Contains JUnit Test Case for DAO classes)
│   │   │   └── <b>com.ecommerce.model.domain</b>             (Contains JUnit Test Case for domain classes)
│   │   ├── <b>com.ecommerce.utility</b>                      (Contains test class for common utility classes)
├── <a href="./pom.xml" target="_blank">pom.xml</a>                                            (Acronym for Project Object Model)
</pre>

## Hosting on Heroku
https://ecommerce-store.herokuapp.com/

## How to run

1. Download and setup [IntelliJ IDEA Ultimate](https://www.jetbrains.com/idea/download/#section=windows).
2. Download and setup [MySQL Community Server](https://dev.mysql.com/downloads/mysql/) and [MySQL Workbench](https://dev.mysql.com/downloads/workbench/).
3. Download this repository.
4. MySQL Workbench -> Server -> Data Import -> Import from Self-Contained File -> ... -> Select Database to Import -> Choose Dump Structure and Data -> Start Import.
5. IntelliJ -> Open.
6. Wait for Maven download and setup dependencies.
7. Setup [Apache Tomcat](https://tomcat.apache.org/).
8. Enjoy ☺️.

## Note

1. Change the MySQL connection in <a href="./src/main/java/META-INF/persistence.xml" target="_blank">persistence.xml</a> to
   your localhost.
2. Password field of user and customer is encrypted by MD5. Use this for login:

    - For user: admin@gmail.com | admin
    - For customer: customer@gmail.com | customer

3. Set environment variables in <a href="./eCommerceWebsite/src/main/webapp/WEB-INF/web.xml" target="_blank">web.xml</a>
   for SMTP mail before run.

| Variables     | Require | Description                                                                                | Default        |
|---------------|---------|--------------------------------------------------------------------------------------------|----------------|
| SMTP_HOST     | ❌       | The SMTP server to connect to                                                              | smtp.gmail.com |
| SMTP_PORT     | ❌       | The SMTP server port to connect to, if the connect() method doesn't explicitly specify one | 25/587         |
| SMTP_USER     | ✔       | Username for SMTP Authenticator                                                            |                |
| SMTP_PASSWORD | ✔       | Password for SMTP Authenticator                                                            |                |
