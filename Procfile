release: ./mvnw flyway:migrate
scheduler: java $JAVA_OPTS -jar target/PlaceOrderAPI-1.0-SNAPSHOT.jar --spring.datasource.url=${JDBC_DATABASE_URL} --server.port=$PORT $JAR_OPTS