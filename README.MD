# Checkpoint 1

Checkpoint 1 da disciplicna Microservice and Web Engineering

## Pré-requisitos

- Java 17+
- Docker
- Acesso a internet
- Acesso ao Docker Hub

## Instalação

#### Clone

```
git clone https://github.com/viniciussilva337/fiap-checkpoint1.git
```

## Execução

#### Docker Hub

Repositório: vinidodocker/fiap-checkpoint1


https://hub.docker.com/r/vinidodocker/fiap-checkpoint1

#### Docker

* Executar container

spring.profiles.active=dev

```
docker run -d -p 8080:8080 -e PROFILE=dev vinidodocker/fiap-checkpoint1
```

spring.profiles.active=stg

```
docker run -d -p 8080:8080 -e PROFILE=stg vinidodocker/fiap-checkpoint1
```

spring.profiles.active=prd

```
docker run -d -p 8080:8080 -e PROFILE=prd vinidodocker/fiap-checkpoint1
```

#### Navegação

- Base

http://localhost:8080

- Endpoint que retorna string "Pong"

http://localhost:8080/ping


## Features (Funcionalidades)

- Múltiplos profiles

## Contatos

- Gustavo Fernandez - rm94382
- Vinicius da silva pires - rm96187
