#fraud service 
un microservice qui marche avec l'autre projet car rental 

instance docker rabbitmq, un bus de message


docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management