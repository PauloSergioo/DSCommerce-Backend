# PROJETO: Microsserviços Java com Spring Boot e Spring Cloud

# Sobre o projeto

### Premissas

- É um sistema que possui um modelo de domínio relativamente simples,
porém abrangente, ou seja, que explore vários tipos de relacionamentos entre as
entidades de negócio (muitos-para-um, muitos-para-muitos, etc.).
- O sistema possibilita a aplicação de vários conhecimentos importantes das
disciplinas de fundamentos.
- O sistema contem as principais funcionalidades que se espera de um
profissional iniciante deve saber construir.


## 

### Visão geral do sistema

Foi aplicado um sistema de microsserviços usando as ferramentas Spring Boot e Spring Cloud. Os microsserviços são registrados em um "Discovery Server" (Eureka) e as requisições são feitas em um API Gateway (Zuul) que também lida com a autenticação e autorização usando OAuth e tokens JWT. Realizei o uso de Feign para chamadas de API entre microsserviços, Ribbon para balanceamento de carga, Hystrix para tolerância a falhas e geração de containers Docker para implantação. O sistema é de nível iniciante para microsserviços e Spring Cloud, mas requer conhecimento prévio de construção de API's REST com Spring Boot e Java.

![image](https://user-images.githubusercontent.com/88008441/231507621-3b115e84-65e9-4f61-9403-f764204fe4f3.png)

##

### Respeitando o seguinte Modelo Conceitual:

![image](https://user-images.githubusercontent.com/88008441/231504698-ee6742d6-1b6a-4ab3-a6b2-3b2dd0498145.png)

# Obtive os seguintes conhecimentos através do curso:

- Uma introdução a algumas das principais ferramentas do Spring Cloud para estruturação de um sistema em microsserviços
- Chamadas de API entre microsserviços por meio de clientes Feign
- Criar microsserviços escaláveis, com resolução de nomes e balanceamento de carga de forma transparente, usando servidor Eureka
- Roteamento transparente de microsserviços com Zuul API Gateway
- Configuração centralizada por meio de um servidor de configuração
- Autenticação e autorização compartilhada por meio do API Gateway, usando Oauth e JWT

# Educador

[DevSuperior - Escola de programação](https://devsuperior.com.br/)

[![DevSuperior no Instagram](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/ig-icon.png)](https://instagram.com/devsuperior.ig) ![DevSuperior no Youtube](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/yt-icon.png)
