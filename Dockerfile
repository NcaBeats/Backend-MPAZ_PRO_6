FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY . .
RUN chmod +x gradlew && ./gradlew buildFatJar
CMD ["java", "-jar", "build/libs/Backend-MPAZ_PRO_6-all.jar"]