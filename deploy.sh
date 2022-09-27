cd eureka-service
sh make.sh
cd ..

cd config-server
sh make.sh
cd ..

cd api-gateway
sh make.sh
cd ..
cd catalog-service
sh make.sh
cd ..

cd movie-service
sh make.sh
cd ..

cd serie-service
sh make.sh
cd ..

cd docker-compose-multistage
docker-compose -f docker-compose.first_stage.yml up
docker-compose -f docker-compose.second_stage.yml up
docker-compose -f docker-compose.third_stage.yml up