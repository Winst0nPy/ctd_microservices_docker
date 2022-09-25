#### NETWORK NAME: asgard


##DOCKER-COMPOSE STAGES
____

### FIRST STAGE
| NAME        | PORT           |
| ------------- |:-------------:| 
| mongodb_catalog            | 27018 | 
| mongodb_series             | 27019 |
| mongo-express_catalog      | 8082  | 
| mongo-express_series       | 8083  |
| mysql-movie                | 3308  |
| Zipkin                     | 9411  |
| eureka-server              | 8761  |
| RabbitMQ                   | 15672 |



### SECOND STAGE
| NAME        | PORT           |
| ------------- |:-------------:| 
| config-service     | 8888 | 
| api-gateway        | 8080  |

### THIRD STAGE
| NAME        | PORT           |
| ------------- |:-------------:| 
| series-service     | 8086  | 
| movie-service      | 8082  | 
| catalog            | 9411  |