# Votação do BBB
###### Em conjunto com o Tavares do ExpertoTech e a DIO

## Ferramentas Utilizadas
```
- Docker Desktop
- MongoDB
- Kafka
- Spring Boot
- Robo 3T
- Offset Explorer
- Postman
- Java 11+
- Swagger
```

## Iniciando o MongoDB e Kafka pelo Docker

- MongoDB:
  1. Abrir o terminal na pasta ./docker/mongodb/
  2. Digitar o seguinte comando: docker-compose up -d

- Kafka:
  1. Abrir o terminal na pasta ./docker/kafka/
  2. Digitar o seguinte comando: docker-compose up -d

## Acessando o MongoDB

1. Bronwser: 
    - Acessar -> localhost:8081 (porta e ip configurado no docker-composer)
3. Robo 3T:
    - Criar uma conexão através da aplicação

## Acessando o Kafka

Offset Explorer:
    - Criar uma configuração na aplicação
 
 Para acessar a aplicação: localhost:8080
 
## Acessando o swagger via bronwser (web)
localhost:8080/swagger-ui.html
 
 
## Links relacionados:
	- swagger.io/specification
	- springdoc.org #openapi
 
Adendo: Para comentar em arquivos xmls basta usar: <!-------Seu comentário----->