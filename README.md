
# Jakarta_EE_Configuration_Maven_Tomcat_Hibernates

The "Jakarta EE Starter Configuration Project" provides a pre-configured environment for developers to jumpstart their Java EE application development. It offers a ready-to-use setup with essential tools, dependencies, and configurations, simplifying the process of building Jakarta EE web applications
- for more information about Jakarta and it's architecture (officiel documentation https://jakarta.ee/specifications/platform/9/jakarta-platform-spec-9.html)


## Key Features 😁

- Maven-Based: Built on the Apache Maven build system, the project handles dependencies and simplifies project management.

- Tomcat: Configured for Apache Tomcat, a popular servlet container, to deploy and test Jakarta EE applications.

- Hibernate for ORM: Utilizes Hibernate, a powerful Object-Relational Mapping (ORM) framework, simplifying database interactions and enabling developers to work with Java Persistence API (JPA).

- JSP and Servlets: Demonstrates JSP and Servlets for dynamic web content generation and HTTP request handling.

- MySQL Database: Configured for MySQL, a reliable and widely-used relational database management system.




## Tools to use this Project 🛠️

- Intellig Editor : you can download it form here https://www.jetbrains.com/idea/
- Java JDK : You can use any java JDK but it's prefered to use the version (11.0.19) to avoid any problems : https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html

- Maven(Optional): a powerful dependency manager, is readily available within IntelliJ IDEA. However, if you prefer using it independently of IntelliJ, you can download and configure it for use in the command-line interface, where you can run commands of mvn. Additionally, you can create Jakarta EE projects only using Maven. https://phoenixnap.com/kb/install-maven-windows

- Tomcat : Tomcat serves as a servlet container, which means it provides an environment for running Java Servlets and JavaServer Pages (JSP). Servlets are Java programs that handle HTTP requests, making them an essential component of Java web applications.  ( you will need to download the Apache Tomcat: https://phoenixnap.com/kb/install-tomcat-windows)
- MySql Server: MySQL is an open-source relational database management system (RDBMS) that is widely used for managing and storing structured data. It's a popular choice for web applications and other software systems. To download and install MySQL Server on a Windows system https://dev.mysql.com/downloads/installer/








## Clone And start Configuration ⚙️

- First clone the repo using this commad in you cmd :
```bash
  git clone https://github.com/Karim-elaoumari/Jakarta_EE_Configuration_Maven_Tomcat.git
```
- open the project in the Intellig IDE :
  ![Logo](https://iili.io/J3OkSV9.md.png)

- go to the pom.xml it's the file of maven that contain the dependencies of our project  if you have a problem in you pom.xml run the mvn clean commad using the Intellig:

```bash
  <dependencies>
        <dependency>
            <groupId>jakarta.servlet</groupId>
            <artifactId>jakarta.servlet-api</artifactId>
            <version>5.0.0</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>6.0.2.Final</version>
        </dependency>
        <dependency>
            <groupId>org.glassfish.jaxb</groupId>
            <artifactId>jaxb-runtime</artifactId>
            <version>3.0.2</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>jakarta.persistence</groupId>
            <artifactId>jakarta.persistence-api</artifactId>
            <version>3.0.0</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
    </dependencies>
```

- Configure the presistence.xml :  The persistence file, typically named persistence.xml, is a critical configuration file in a Jakarta EE project that defines how your application interacts with the database. It specifies the data source, JPA (Java Persistence API) settings, and other important details. Here's a pre made configuration:
```

<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
             http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd"
             version="2.1">
<persistence-unit name="my-ana">
    <properties>
        <property name="jakarta.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
        <property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/event_app_101?createDatabaseIfNotExist=true"/>
        <property name="jakarta.persistence.jdbc.user" value="root"/>
        <property name="jakarta.persistence.jdbc.password" value=""/>
        <property name="hibernate.dialect" value="org.hibernate.dialect.MySQLDialect"/>
        <property name="hibernate.hbm2ddl.auto" value="update"/>
        <property name="hibernate.show_sql" value="true"/>
        <property name="hibernate.format_sql" value="true"/>
    </properties>
</persistence-unit>
</persistence>

```
now change the url, user and password based on your Mysql Server configuration

- Now lets add Our Project to Tomcat using Intellig: there is many ways to add you project to Tomcat, but we will use the simple way
  - 1 )  go to the edit configuration as shown in the image:
    ![image](https://iili.io/J3e5TI2.md.png)
  - 2 ) press the + button and add choose the Tomcat server :
    ![Logo](https://iili.io/J3e794e.md.png)

  - 3 ) Add the Path of you Tomcat Server to the Tomcat Home  and press Ok:
    ![Logo](https://iili.io/J3elYRs.md.png)

  - 4 ) Add War file to the Server:
    In the Edit Configuration go to the Deploiment and press + after that choose artifact choose the War that you want to deploy if there is no war run the deploiyement of the project  or use the Maven commad to create the War :
    ![Logo](https://iili.io/J3eEFlS.md.png)

- Run the Server With the Deployed Project :
  when you run the aaplication you will see in the terminal that the server is runnig and the Hibernates created the database with the Tables from Entities after that the web page will show up in the browser :
  ![Logo](https://iili.io/J3egKAb.md.png)

Web Page  :

![Logo](https://iili.io/J3eg1fI.md.png)

## 🥳 Congratulation You Have Set You Configuration Of Jakarta EE 🥳

### So you can start working on your project and learning more concepts related to Jakarta EE







## Feedback

If you have any feedback, please let in the issues Session or contact me karimelaoumari@gmail.com

# Thanks 😀

