This is a demo of HAProxy load balancer

To run the load balancer, run

```
haproxy -f haproxy.cfg 
```

To run the backend services

```
mvn clean verify
cd target 

# run the first server at port 9090
java -jar -Dserver.port=9091 haproxy-demo-xxx.jar

# run the first server at port 9191 (in a separate console)
java -jar -Dserver.port=9090 haproxy-demo-xxx.jar
```
