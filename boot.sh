mvn -pl eureka spring-boot:run -Dspring.profiles.active=area1 &
mvn -pl eureka spring-boot:run -Dspring.profiles.active=area2 &
mvn -pl zuul   spring-boot:run -Dspring.profiles.active=area1 &
mvn -pl zuul   spring-boot:run -Dspring.profiles.active=area2 &