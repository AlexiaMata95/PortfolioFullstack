# 1. Usamos una imagen base de Java 17
FROM eclipse-temurin:17-jdk-jammy

# 2. Definimos un directorio de trabajo
WORKDIR /app

# 3. Copiamos el JAR generado al contenedor
#    (asumimos que el JAR se llama skill-service-0.0.1-SNAPSHOT.jar en target/)
COPY target/skill_service-0.0.1-SNAPSHOT.jar app.jar

# 4. Exponemos el puerto que configuremos en application.properties
EXPOSE 8082


# 5. Comando por defecto para arrancar el microservicio
ENTRYPOINT ["java", "-jar", "app.jar"]