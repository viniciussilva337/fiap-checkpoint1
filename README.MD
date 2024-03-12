# Ping

Aplicação Java com container para exemplo

## Pré-requisitos

- Java 17+
- Docker
- Acesso a internet
- Acesso ao Docker Hub

## Instalação

#### Clone

```
git clone https://github.com/FrnndzFiap/fiap-checkpoint1.git
```

## Execução


#### Docker

* Criar imagem

```
docker build -t fiap-checkpoint1 .
```

* Executar container

spring.profiles.active=dev

```
docker run -d -p 8080:8080 -e PROFILE=<prd|dev|stg> fiap-checkpoint1
```

#### Navegação

- Base

http://localhost:8080

- Endpoint que retorna string "Pong"

http://localhost:8080/ping


## Features (Funcionalidades)

- Múltiplos profiles

## Contatos

- Gustavo Fernandez - gustavoffiap@gmail.com
- Desenvolvedor 2 - desenvolvedor2@email.com
