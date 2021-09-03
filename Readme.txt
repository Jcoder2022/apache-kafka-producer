

To Run this Project

First, we need to start zookeeper than kafka using following statements

Open new Terminal Window (cmd) -- for Zookeeper
cd c:\kafka  (Kafka is installed here)

c:\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Open new Terminal Window (cmd) -- for Kafka

cd c:\kafka

c:\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

By Default Kafka provides String but if we wish to Pass Complex object to Topic i.e json, for this we need to create Kafkaconfig
We want this to start at the loading time of spring boot application

//Here we need to do the configuration for producer factory, producerFactory will be used to create our kafkaTemplate

