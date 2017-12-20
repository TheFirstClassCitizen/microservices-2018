# microservices-2018
A set of challenges to build modern Microservices

http://127.0.0.1:2001
http://127.0.0.1:2002
http://127.0.0.1:4001/hystrix
http://127.0.0.1:8080/demo

sudo ./bin/zkServer.sh start ./conf/zoo_sample.cfg
bin/kafka-server-start.sh config/server.properties
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic DEMO_TOPIC
bin/kafka-topics.sh --list --zookeeper localhost:2181

