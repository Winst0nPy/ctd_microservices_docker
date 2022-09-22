#### NETWORK NAME: asgard


##DOCKER-COMPOSE STAGES
____

### FIRST STAGE
| NAME        | PORT           |
| ------------- |:-------------:| 
| mongoDB-asgard            | 27017 | 
| mongo-Express-asgard      | 8081  | 
| Zipkin             | 9411  |
| eureka-server      | 8761  |


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