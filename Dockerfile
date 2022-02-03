FROM tomcat:9.0.58-jdk11-openjdk-slim

WORKDIR /usr/local/tomcat

ADD ./target/jpabuild.war ./webapps/gestion_employee.war

CMD [ "catalina.sh", "run" ]
