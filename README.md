Based on JoinFaces, but removed almost everything to get minimal running project.

```
git clone ...
mvn clean package
java -jar target/joinfaces-example-4.1.1.jar
```

there is just one xhtml file (without backing bean) - `test.xhtml` which represents test page as described on [PrimeFaces' Get Started](https://www.primefaces.org/gettingstarted/)

http://localhost:8080/test.xhtml
