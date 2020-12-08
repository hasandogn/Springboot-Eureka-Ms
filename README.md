# Springboot-Eureka-Ms
 Microservice worked.
 
# How to run?
Add projects module by module to the editor. You can then run it one by one.

# First-Service project run with docker?

first-service-eureka> docker run dockerdemo

# Postgresql run with docker?

first-service-eureka> docker-compose up

# Service infos

* Postgresql connection info:
   - hostname: postgres
   - ports: 5432
   - Username: postgres
   - pw: postgres
  
* first-service:
  - application.name: application-service
  - port: 8081
  
* second-service:
  - application.name: sms-service
  - port: 8082
  
* gateway-service:
  - application.name: gateway-service
  - port: 8080
# Example url

http://localhost:8080/{application-name}/{requestmapping-name}
