# "The Sitter" - Aplicativo Inovador de Babysitting

**"The Sitter"** é um aplicativo revolucionário de babysitting, atendendo a todas as faixas etárias, inclusive pessoas com necessidades especiais, e oferecendo cuidados para cães e gatos. O projeto visa preencher a lacuna para indivíduos ocupados sem uma rede de apoio para cuidar de familiares, animais de estimação ou ambos simultaneamente.

## Pesquisa de Concorrentes
- Komae
- Zum
- Sittercity

## Recursos do Backend
- Perfis universais de cuidadores
- Agendamento flexível
- Avaliações
- Verificações de antecedentes
- Serviços personalizados

## Recursos do Frontend
1. Tela de Login
2. Criação de Perfil
3. Verificação

### Passos de Uso
1. Registro
2. Edição de Perfil
3. Acesso às Principais Funcionalidades

## Plano de Trabalho
- Frontend
- Base de Dados
- Backend
- Matemática Discreta

## Cenários de Uso
- Donos de animais de estimação
- Pais
- Usuários com familiares com necessidades especiais

## Unidades Curriculares
- Matemática discreta
- Base de dados
- Programação orientada a objetos
- Competências comunicacionais
- Programação de dispositivos móveis

## Organização do Backend
- Perfil de Babysitter Universal
- Agendamento Flexível
- Avaliações e Comentários
- Verificação de Antecedentes
- Serviços Personalizados
- Notificações em Tempo Real
- Programa de Fidelidade

## Organização do Frontend
1. Tela Inicial
2. Tela de Login ou Registro
3. Tela de Perfil
4. Tela de Verificação do Perfil
5. Home Screen
6. Tela de Pedidos
7. Tela de Mensagens
8. Tela de Configurações do Perfil

## Utilização do Aplicativo
### Colaboradores e Solicitadores Utilizando pela Primeira Vez:
1. Abrir o aplicativo.
2. Tela inicial com o logótipo.
3. Fazer login ou registrar uma nova conta.
4. Editar o perfil com informações pessoais.
5. Concluir a verificação do perfil.
6. Acesso às telas principais: home page, pedidos, mensagens e perfil...

### Colaboradores Utilizando pela Segunda Vez:
1. Tela de login.
2. Marcar disponibilidade e localização.
3. Aguardar solicitações de ajuda.
4. Entrar em contato com solicitadores para combinar detalhes.

## Base de Dados
O nosso aplicativo tem 12 tabelas:

## Tabela `place`

| Column        | Type          | Constraints                          |
| ------------- | ------------- | ------------------------------------ |
| pla_id        | INT           | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| pla_address   | VARCHAR(255)  | NOT NULL                             |
| pla_latitude  | DOUBLE        | NOT NULL                             |
| pla_altitude  | DOUBLE        | NOT NULL                             |

- **pla_id:**
   - Definição: Identificador único da localização.
   - Tipo de dados: Número inteiro.
   - Restrições: Não pode ser nulo (NOT NULL).
   - Propriedade especial: Será automaticamente incrementado para cada novo registro (AUTO_INCREMENT).
   - Chave primária: Utilizada para identificar exclusivamente cada registro na tabela.

- **pla_address:**
   - Definição: Armazena o endereço do local.
   - Tipo de dados: String de comprimento variável, até 255 caracteres.

- **pla_longititude:**
   - Definição: Armazena a latitude do local.
   - Tipo de dados: Número de ponto flutuante de precisão dupla.
   - Restrições: Não pode ser nulo (NOT NULL).

- **pla_altitude:**
   - Definição: Armazena a altitude do local.
   - Tipo de dados: Número de ponto flutuante de precisão dupla.
   - Restrições: Não pode ser nulo (NOT NULL).

*A altitude e a longititude são utilizadas para calcular a proximidade entre diferentes locais.*


## Tabela `access`

| Column        | Type          | Constraints                          |
| ------------- | ------------- | ------------------------------------ |
| ac_id         | INT           | NOT NULL, AUTO_INCREMENT, PRIMARY KEY|
| ac_name       | DATE          |  NOT NULL ,CHECK (ac_name IN ('sitter', 'client', 'admin'))|


- **ac_id:**
-Definição: Identificador único para cada acesso na tabela de access.
-Tipo de dados: Número inteiro.
-Restrições: Não pode ser nulo (NOT NULL).
-Propriedade especial: Será automaticamente incrementado para cada nova entrada (AUTO_INCREMENT).
-Chave primária:Utilizada para identificar exclusivamente cada registro na tabela.

-**ac_name:**
-Definição: Armazena o nome do acesso
-Tipo de dados: String de até 60 caracteres.
-Restrições: Não pode ser nulo(NOT NULL).


## Tabela `sitter`

| Column         | Type         | Constraints                          |
| -------------- | ------------ | ------------------------------------ |
| sit_id         | INT          | NOT NULL, AUTO_INCREMENT, PRIMARY KEY|
| sit_user_id    | INT          | NOT NULL                             |
| sit_experience | TEXT         |                                      |
| sit_education  | VARCHAR(255) |                                      |
| sit_reability  | INT          |                                      |
| sit_responseTime| INT         |                                      |
| sit_responserate| INT         |                                      |
| sit_boo_id      | INT         | NOT NULL                             |
| sit_aboutMe     | VARCHAR(255)|                                      |

- **sit_id:**
    - Definição: Identificador único para cada sitter na tabela.
    - Tipo de dados: Número inteiro.
    - Restrições: Não pode ser nulo (NOT NULL).
    - Propriedade especial: Será automaticamente incrementado para cada novo registro (AUTO_INCREMENT).
    - Chave primária:Utilizada para identificar exclusivamente cada registro na tabela.


- **sit_experience:**
    - Definição: Armazena informações sobre a experiência da sitter(babá).
    - Tipo de dados: Texto longo (TEXT).
 
  - **sit_user_id:**
   -Definição: Identificador relacionado ao user.
   -Tipo de dados: Número inteiro.
   -Restrições: Chave estrangeira. Não pode ser nulo (NOT NULL).


- **sit_education:**
    - Definição: Armazena informações sobre a educação da sitter(babá).
    - Tipo de dados: String de até 255 caracteres.


- **sit_aboutMe:**
    - Definição: Armazena informações adicionais sobre a sitter(babá).
    - Tipo de dados: Texto longo (TEXT).
 

  - **sit_reability:**
   -Definição: Armazena  a reability da sitter( babá).
   -Tipo de dados:INT. 
   -Restrições: CHECK (sit_reability >= 0 AND sit_reability <= 100)

 - **sit_reaponseTime:**
   -Definição: Armazena  o Response time da sitter( babá).
   -Tipo de dados:INT. 
   -Restrições: CHECK (sit_responseTime >= 0 AND sit_responseTime <= 100).


 - **sit_responseRate:**
   -Definição: Armazena  o Response rate da sitter( babá).
   -Tipo de dados:INT. 
   -Restrições: CHECK (sit_responseRate >= 0 AND sit_responseTime <= 100).




  
## Tabela `booking`

| Column       | Type | Constraints                          |
| ------------ | ---- | ------------------------------------ |
| boo_id       | INT  | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| boo_data     | INT  | NOT NULL                              |
| boo_startTime | INT  |NOT NULL                              |
| boo_cli_id   | INT  | NOT NULL                              |
| boo_sta_id   | INT  | NOT NULL                              |
| boo_endTime  | INT  | NOT NULL                              |

- **boo_id:**
    - Definição: Identificador único para cada reserva na tabela de reservas (booking).
    - Tipo de dados: Número inteiro.
    - Restrições: Não pode ser nulo (NOT NULL).
    - Propriedade especial: Será automaticamente incrementado para cada nova entrada (AUTO_INCREMENT).
    - Chave primária: Utilizada para identificar exclusivamente cada registro na tabela.

- **boo_sta_id:**
    - Definição: Identificador relacionado ao status da reserva.
    - Tipo de dados: Número inteiro.
    - Restrições: Chave estrangeira.
 
- **boo_cli_id:**
   -Definição: Identificador relacionado ao cliente  da reserva.
   -Tipo de dados: Número inteiro.
   -Restrições: Chave estrangeira. Não pode ser nulo (NOT NULL).



-**boo_data:**
   -Definição: Identificador relacionado a data da reserva.
   -Tipo de dados: DATE.
   -Restrições: Não pode ser nulo (NOT NULL).

-**boo_endTime:**
   -Definição: Identificador relacionado ao fim da reserva.
   -Tipo de dados: TIME.
   -Restrições: Não pode ser nulo (NOT NULL).

-**boo_endTime:**
   -Definição: Identificador relacionado ao ínicio da reserva.
   -Tipo de dados: TIME.
   -Restrições: Não pode ser nulo (NOT NULL).


## Tabela `status`

| Column     | Type | Constraints                          |
| ---------- | ---- | ------------------------------------ |
| sta_id     | INT  | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| sta_name   | INT  |                                      |



-**sta_id:**
   -Definição: Identificador único para cada status na tabela de status.
   -Tipo de dados: Número inteiro.
   -Restrições: Não pode ser nulo (NOT NULL).
   -Propriedade especial: Será automaticamente incrementado para cada nova entrada (AUTO_INCREMENT).
   -Chave primária:Utilizada para identificar exclusivamente cada registro na tabela.

-**sta_name:**
   -Definição: Armazena o nome do status
   -Tipo de dados: String de até 255 caracteres.
   -Restrições: Não pode ser nulo(NOT NULL).



## Tabela `sitter_rating`

| Column  | Type         | Constraints                          |
| ------- | ------------ | ------------------------------------ |
| ra_id  | INT           | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| ra_value |INT          |NOT NULL CHECK (ra_value BETWEEN 1 AND 5)|
| ra_comment| TEXT       |                                       |
| ra_sta_id| INT         |NOT NULL                               |

-**ra_id:**
   -Definição: Identificador único para cada sitter rating na tabela.
   -Tipo de dados: Número inteiro.
   -Restrições: Não pode ser nulo (NOT NULL).
   -Propriedade especial: Será automaticamente incrementado para cada nova entrada (AUTO_INCREMENT).
   Chave primária:Utilizada para identificar exclusivamente cada registro na tabela.

-**ra_value:**
   -Definição: Armazena o valor das avaliações.
   -Tipos de dados:INT.
   -Restrições: NOT NULL CHECK (ra_value BETWEEN 1 AND 5).

-**ra_comment:**
   -Definição: Armazena o comentários  das avaliações.
   -Tipos de dados:TEXT.

-**ra_sit_id:**
   -Definição: Identificador relacionado as sitters .
   -Tipo de dados: Número inteiro.
   -Restrições: Chave estrangeira.
   -Restrições: Não pode ser nulo(NOT NULL).



## Tabela `client`

| Column         | Type         | Constraints                          |
| -------------- | ------------ | ------------------------------------ |
| cli_id         | INT          | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| cli_clifa_id   | INT          | NOT NULL                              |
| cli_user_id    | INT           | NOT NULL                              |




- **cli_id:**
    - Definição: Identificador único para cada cliente na tabela.
    - Restrições: Não pode ser nulo (NOT NULL).
    - Propriedade especial: Será automaticamente incrementado para cada nova entrada (AUTO_INCREMENT).
    - Chave primária: Utilizada para identificar exclusivamente cada registro na tabela.

- **cli_clifa_id:**
    - Definição: Identificador relacionado ao cliente/fornecedor associado ao cliente.
    - Tipo de dados: Número inteiro.
    - Restrições: Chave estrangeira.

-**cli_user_id:**
   -Definição:Identificador relacionado ao user .
   -Tipo de dados: Número inteiro.
   -Restrições: Chave estrangeira. Não pode ser nulo (NOT NULL)


## Tabela `user`
| Column        | Type | Constraints                          |
| ------------  | ---- | ------------------------------------ |
| user_id       | INT  | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| user_name     | INT  | NOT NULL                              |
| user_bdate    | Date |NOT NULL                               |
| user_upload   | byte | NOT NULL                              |
| user_address  |  TEXT| NOT NULL                              |
| user_mobile   | TEXT | NOT NULL                              |
| user_email    |TEXT  | NOT NULL                              |
| user_password | TEXT | NOT NULL                              |
| user_pla_id   | INT  | NOT NULL                              |
| user_ac_id    | INT  | NOT NULL                              |


-**user_id:**
   -Definição: Identificador único para cada user na tabela.
   -Tipo de dados: Número inteiro.
   -Restrições: Não pode ser nulo (NOT NULL).
   -Propriedade especial: Será automaticamente incrementado para cada nova entrada (AUTO_INCREMENT).
   -Chave primária:Utilizada para identificar exclusivamente cada registro na tabela.

-**user_name:**
   -Definição: Armazena o nome do user.
   -Tipo de dados: String de até 255 caracteres.
   -Restrições: Não pode ser nulo(NOT NULL).

-**user_pla_id:**
   -Definição: Identificador relacionado ao local.
   -Tipo de dados: Número inteiro.
   -Restrições: Chave estrangeira.
   -Restrições: Não pode ser nulo(NOT NULL).


-**user_bdate:**
   -Definição: Armazena a data de nascimento do usuário.
   -Tipo de dados: Data.
   -Restrições: Não pode ser nulo (NOT NULL).


-**user_upload:**
   -Definição: Armazena informações binárias,armazenar arquivos como imagens.
   -Tipo de dados: Blob/binário.
   -Restrições: Não pode ser nulo (NOT NULL).


-**user_address:**
   -Definição: Armazena o endereço do usuário.
   -Tipo de dados: Texto, adequado para endereços mais longos.
   -Restrições: Não pode ser nulo (NOT NULL).

-**user_mobile:**
   -Definição: Armazena o número de telefone móvel do usuário.
   -Tipo de dados: Texto, permitindo flexibilidade no formato do número.
   -Restrições: Não pode ser nulo (NOT NULL).

-**user_email:**
   -Definição: Armazena o endereço de e-mail do usuário.
   -Tipo de dados: Texto.
   -Restrições: Não pode ser nulo (NOT NULL).
   
-**user_password:**
   -Definição: Armazena a senha do usuário.
   -Tipo de dados: Texto. Idealmente, deve armazenar uma hash da senha, e não a senha em texto puro, por motivos de segurança.
   -Restrições: Não pode ser nulo (NOT NULL).
   
   
-**user_ac_id:**
   -Definição: Referencia um identificador em outra tabela.
   -Tipo de dados: Número inteiro.
   -Restrições: Não pode ser nulo (NOT NULL). Deve ser uma chave estrangeira que referencia uma entrada válida em outra tabela.




   ## Tabela `creatures`
   
| Column       | Type | Constraints                          |
| ------------ | ---- | ------------------------------------ |
| cre_id       | INT  | NOT NULL, AUTO_INCREMENT, PRIMARY KEY|
| cre_type     | INT  |                                      |
| cre_info     | INT  | NOT NULL                             |



-**cre_id:**
   -Definição: Identificador único para cada criatura na tabela.
   -Tipo de dados: Número inteiro.
   -Restrições: Não pode ser nulo (NOT NULL).
   -Propriedade especial: Será automaticamente incrementado para cada nova entrada (AUTO_INCREMENT).
   -Chave primária:Utilizada para identificar exclusivamente cada registro na tabela.

-**cre_type:**
   -Definição: Armazena informações sobre o  tipo na tabela.
   -Tipo de dados: ENUM.
   -Restrições: ('person', 'animal') NOT NULL

-**cre_info:**
   -Definição: Armazena informações extras na  tabela.
   -Tipo de dados: TEXT.



## Tabela `user_chat`

| Column       | Type | Constraints                          |
| ------------ | ---- | ------------------------------------ |
| usat_id      | INT  | NOT NULL, AUTO_INCREMENT, PRIMARY KEY|
| usat_user_id | INT  |                                      |
| usat_chat_id | INT  | NOT NULL                             |



-**usat_id:**
   -Definição: Identificador único para cada user chat na tabela.
   -Tipo de dados: Número inteiro.
   -Restrições: Não pode ser nulo (NOT NULL).
   -Propriedade especial: Será automaticamente incrementado para cada nova entrada (AUTO_INCREMENT).
   -Chave primária:Utilizada para identificar exclusivamente cada registro na tabela.

-**usat_user_id:**
   -Definição: Identificador relacionado ao user.
   -Tipo de dados: Número inteiro.
   -Restrições: Chave estrangeira.
   -Restrições: Não pode ser nulo(NOT NULL).

-**usat_chat_id:**
   -Definição: Identificador relacionado ao chat .
   -Tipo de dados: Número inteiro.
   -Restrições: Chave estrangeira.
   -Restrições: Não pode ser nulo(NOT NULL).




## Tabela `chat`

| Column       | Type | Constraints                          |
| ------------ | ---- | ------------------------------------ |
| chat_id      | INT  | NOT NULL, AUTO_INCREMENT, PRIMARY KEY|
|Chat_message_content | text  |                              |
| chat_timestamp      | INT  | NOT NULL                      |


-**chat_id:**
   -Definição: Identificador único para cada chat na tabela.
   -Tipo de dados: Número inteiro.
   -Restrições: Não pode ser nulo (NOT NULL).
   -Propriedade especial: Será automaticamente incrementado para cada nova entrada (AUTO_INCREMENT).
   -Chave primária:Utilizada para identificar exclusivamente cada registro na tabela.

-**Chat_message_content:**
   -Definição: Armazena o conteúdo das mensagens.
   -Tipos de dados: TEXT.

-**Chat_message_content:**
   -Definição: Armazena o tempo exato.
   -Tipos de dados: TIMESTAMP.
   -Restrições: DEFAULT CURRENT_TIMESTAMP.




## Tabela `family_member`

| Column      | Type         | Constraints                          |
| ----------- | ------------ | ------------------------------------ |
| fa_id       | INT          | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| fa_name     | VARCHAR(60)  | NOT NULL                             |
| fa_clifa_id | INT          |                                      |
| fa_bdate    | DATE         | NOT NULL                             |
| fa_school   | VARCHAR(255) |                                      |
| fa_allergies | VARCHAR(255)|                                      |
| fa_aboutMe  | TEXT         |                                      |
| fa_gender   | CHAR(1)      | NOT NULL                             |


A tabela `family_member` foi implementada para armazenar informações sobre membros de uma família associados a uma família de clientes.

- **fa_id:**
   - Definição: Identificador único para cada membro da família na tabela.
   - Tipo de dados: Número inteiro.
   - Restrições: Não pode ser nulo (**NOT NULL**).
   - Propriedade especial: Será automaticamente incrementado para cada nova entrada (**AUTO_INCREMENT**).
   - Chave primária: Utilizada para identificar exclusivamente cada registro na tabela.

- **fa_name:**
   - Definição: Armazena o nome do membro da família.
   - Tipo de dados: String de até 60 caracteres.
   - Restrições: Não pode ser nulo (**NOT NULL**).

- **fa_clifa_id:**
   - Definição: Identificador relacionado à família de clientes associada ao membro da família.
   - Tipo de dados: Número inteiro.
   - Restrições: Chave estrangeira.

- **fa_bdate:**
   - Definição: Armazena a data de nascimento do membro da família.
   - Tipo de dados:Data (no formato DATE).
   - Restrições: Não pode ser nulo (**NOT NULL**).

- **fa_school:**
   - Definição: Armazena o nome da escola do membro da família.
   - Tipo de dados: String de até 255 caracteres.

- **fa_allergies:**
    - Definição: Armazena informações sobre alergias do membro da família.
    - Tipo de dados: String de até 255 caracteres.

- **fa_aboutMe:**
    - Definição: Armazena informações adicionais sobre o membro da família.
    - Tipo de dados: Texto longo (TEXT).

- **fa_gender:**
    - Definição: Armazena o gênero do membro da família.
    - Tipo de dados: Caractere (CHAR) de comprimento 1.
    - Restrições: Não pode ser nulo (**NOT NULL**).
 



