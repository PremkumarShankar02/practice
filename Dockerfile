FROM eclipse-temurin:17
COPY target/practice.jar practice.jar
CMD ["java","-jar","practice.jar"]