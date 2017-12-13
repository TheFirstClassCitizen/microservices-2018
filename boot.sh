./mvnw -pl config    spring-boot:run -Dspring.profiles.active=area1 &
./mvnw -pl eureka    spring-boot:run -Dspring.profiles.active=area1 &
./mvnw -pl eureka    spring-boot:run -Dspring.profiles.active=area2 &
./mvnw -pl zuul      spring-boot:run -Dspring.profiles.active=area1 &
./mvnw -pl zuul      spring-boot:run -Dspring.profiles.active=area2 &
./mvnw -pl dashboard spring-boot:run -Dspring.profiles.active=area1 &