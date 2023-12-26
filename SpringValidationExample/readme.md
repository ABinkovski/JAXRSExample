`mvn spring-boot:run`

* <a href="http://localhost:8080/javax/">root</a>
* <a href="http://localhost:8080/javax/getJaxValidation?reqParam=TEST_VALUE_1">reqParam</a>
* <a href="http://localhost:8080/javax/getJaxValidation/TEST_VALUE_1">pathVar</a>

test exceptions:

* <a href="http://localhost:8080/javax/getJaxValidation?reqParam=ex1">reqParam</a>
* <a href="http://localhost:8080/javax/getJaxValidation/ex2">pathVar</a>
