# Desafio#3 bootcamp spring 3.0

![Untitled](assets/Untitled.png)

Este é um desafio **backend** proposto pela DevSuperior referente ao capítulo **03.Validação e Segurança,** no qual foi implementado um sistema de login usando JWT bem como configurações de acesso a endpoints para determinados tipos de perfis (Admin & Client)

Este é um sistema de eventos e cidades com uma relação N-1 entre eles:

![Untitled](assets/Untitled%201.png)

Neste sistema, somente as rotas de leitura (GET) de eventos e cidades são públicas (não
precisa de login). Usuários CLIENT podem também inserir (POST) novos eventos. Os demais
acessos são permitidos apenas a usuários ADMIN.

## Validações de City:

● Nome não pode ser vazio

## Validações de Event:

- Nome não pode ser vazio
- Data não pode ser passada
- Cidade não pode ser nula

## **Técnologias empregadas**

- Spring Boot
- Spring Data
- Spring Web
- H2 Database
- Spring Validation
- Spring Security

## Configutação de ambiente **postman**

![Untitled](assets/Untitled%202.png)

## Endpoint postman

### Login

Configurando credênciais da aplicação:

![Untitled](assets/Untitled%203.png)

Código para o postman pegar token automático com base na variável de ambiente configurada:

![Untitled](assets/Untitled%204.png)

Efetuando login na aplicação após as configurações 

![Untitled](assets/Untitled%205.png)

Cada endpoint do tipo **POST** precisa receber a configuração de **BearerToken** para buscar o token gerado após o envio da requisição do Login, exemplo: 

![Untitled](assets/Untitled%206.png)

![Untitled](assets/Untitled%207.png)

### All cities

Os enpoints correspondentes ao método GET, estão definidos como público, ou seja, todos podem acessar.

![Untitled](assets/Untitled%208.png)

### Events paged

![Untitled](assets/Untitled%209.png)

### New city [POST]

Somente usuários com perfil ADMIN poderão cadastrar uma nova cidade

![Untitled](assets/Untitled%2010.png)

### New event [POST]

Tanto usuários com perfil de ADMIN & CLIENTE poderão cadastrar um novo evento

![Untitled](assets/Untitled%2011.png)

O sistema já está preparado para tratamento de exceções:

![Untitled](assets/Untitled%2012.png)

Neste exemplo acima, o sistema está barrando o cadastro de novas cidades caso o usuário passe o nome em branco.