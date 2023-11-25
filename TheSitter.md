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
O nosso aplicativo tem 9 tabelas:

**Tabela place:**

### pla_id
- **Definição:** Identificador único da localização.
- **Tipo de dados:** Número inteiro.
- **Restrições:** Não pode ser nulo (NOT NULL).
- **Propriedade especial:** Será automaticamente incrementado para cada novo registro (AUTO_INCREMENT).
- **Chave primária:** Utilizada para identificar exclusivamente cada registro na tabela.

### pla_address
- **Definição:** Armazena o endereço do local.
- **Tipo de dados:** String de comprimento variável, até 255 caracteres.

### pla_latitude
- **Definição:** Armazena a latitude do local.
- **Tipo de dados:** Número de ponto flutuante de precisão dupla.
- **Restrições:** Não pode ser nulo (NOT NULL).

### pla_altitude
- **Definição:** Armazena a altitude do local.
- **Tipo de dados:** Número de ponto flutuante de precisão dupla.
- **Restrições:** Não pode ser nulo (NOT NULL).

*A altitude e a latitude são utilizadas para calcular a proximidade entre diferentes locais.*


| Column        | Type          | Constraints                          |
| ------------- | ------------- | ------------------------------------ |
| pla_id        | INT           | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| pla_address   | VARCHAR(255)  |                                      |
| pla_latitude  | DOUBLE        | NOT NULL                             |
| pla_altitude  | DOUBLE        | NOT NULL                             |

**Tabela agenda**


| Column        | Type          | Constraints                          |
| ------------- | ------------- | ------------------------------------ |
| age_id        | INT           | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| age_data      | DATE          |                                      |
| age_sit_id    | INT           |                                      |
| age_clifa_id  | INT           |                                      |
| age_startTime | TIME          |                                      |
| age_endTime   | TIME          |                                      |
| age_sta_id    | INT           |                                      |
| age_pla_id    | INT           |                                      |


**Tabela sitter**

| Column         | Type         | Constraints                          |
| -------------- | ------------ | ------------------------------------ |
| sit_id         | INT          | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| sit_name       | VARCHAR(60)  | NOT NULL                             |
| sit_bdate      | DATE         | NOT NULL                             |
| sit_experience | TEXT         |                                      |
| sit_address    | VARCHAR(255) |                                      |
| sit_education  | VARCHAR(255) |                                      |
| sit_mobile     | VARCHAR(20)  |                                      |
| sit_gender     | CHAR(1)      | NOT NULL                             |
| sit_aboutMe    | TEXT         |                                      |
| sit_password   | VARCHAR(255) | NOT NULL                             |
| sit_email      | VARCHAR(255) | NOT NULL                             |


**Tabela booking**

| Column       | Type | Constraints                          |
| ------------ | ---- | ------------------------------------ |
| boo_id       | INT  | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| boo_age_id   | INT  |                                      |
| boo_sit_id   | INT  |                                      |
| boo_clifa_id | INT  |                                      |
| boo_sta_id   | INT  |                                      |


**Tabela booking_status**

| Column     | Type | Constraints                          |
| ---------- | ---- | ------------------------------------ |
| bsta_id    | INT  | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| bsta_boo_id | INT  |                                      |
| bsta_sta_id | INT  |                                      |


**Tabela status**

| Column  | Type         | Constraints                          |
| ------- | ------------ | ------------------------------------ |
| sta_id  | INT          | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| sta_name | VARCHAR(255) | NOT NULL                             |


**Tabela client**

| Column         | Type         | Constraints                          |
| -------------- | ------------ | ------------------------------------ |
| cli_id         | INT          | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| cli_clifa_id   | INT          |                                      |
| cli_name       | VARCHAR(60)  | NOT NULL                             |
| cli_bdate      | DATE         | NOT NULL                             |
| cli_address    | VARCHAR(255) |                                      |
| cli_mobile     | VARCHAR(20)  |                                      |
| cli_email      | VARCHAR(255) | NOT NULL                             |
| cli_password   | VARCHAR(255) | NOT NULL                             |
| cli_gender     | CHAR(1)      | NOT NULL                             |


**Tabela Client_family**

| Column       | Type | Constraints                          |
| ------------ | ---- | ------------------------------------ |
| clifa_id     | INT  | NOT NULL, AUTO_INCREMENT, PRIMARY KEY |
| clifa_cli_id | INT  |                                      |


**Tabela family_member**

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




