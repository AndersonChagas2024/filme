Cinema Project 🎬
Este é um projeto de sistema de gerenciamento de filmes desenvolvido com Spring Boot e Java 17. A aplicação permite a criação, consulta, atualização e exclusão (CRUD) de informações sobre filmes. Utiliza o banco de dados em memória H2 para armazenamento temporário dos dados durante o desenvolvimento e para testes.

Tecnologias Utilizadas
Java 17: Linguagem principal do projeto.
Spring Boot: Framework que simplifica a configuração e execução do projeto.
Spring Data JPA: Ferramenta para mapeamento objeto-relacional, usada para persistência de dados.
H2 Database: Banco de dados em memória para testes e desenvolvimento rápido.
Maven: Gerenciador de dependências e automação de build.
Estrutura do Projeto
O projeto segue a arquitetura MVC e está dividido nas seguintes camadas:

Model: Representa as entidades do domínio. A classe Filme define os atributos e comportamentos dos filmes que serão gerenciados.
Repository: Interface que herda de JpaRepository, fornecendo métodos prontos para realizar operações de CRUD no banco de dados.
Service: Contém a lógica de negócios da aplicação. A classe FilmeService organiza as operações com Filme e garante que a lógica esteja centralizada.
Controller: Define os endpoints da API REST. A classe FilmeController mapeia as rotas HTTP para as operações do serviço.
Entidade Filme
A entidade Filme possui os seguintes atributos:

id: Identificador único do filme.
titulo: Nome do filme.
descricao: Breve descrição do filme.
duracao: Duração do filme em minutos.
classificacao: Classificação indicativa (faixa etária).
lancamento: Data de lançamento do filme.
Endpoints da API
A API disponibiliza os seguintes endpoints:

GET /filmes: Retorna uma lista de todos os filmes cadastrados.
GET /filmes/{id}: Retorna os detalhes de um filme específico com base no id.
POST /filmes: Cria um novo filme a partir das informações fornecidas no corpo da requisição.
PUT /filmes/{id}: Atualiza as informações de um filme existente com base no id.
DELETE /filmes/{id}: Exclui o filme correspondente ao id.
Como Executar o Projeto
Para rodar o projeto localmente, siga os passos abaixo:

Certifique-se de que você possui o JDK 17 instalado.
Clone o repositório do projeto:
bash
Copiar código
git clone https://github.com/seu-usuario/cinema-project.git
Acesse o diretório do projeto:
bash
Copiar código
cd cinema-project
Execute o projeto com Maven:
bash
Copiar código
mvn clean install spring-boot:run
Acesse a aplicação em http://localhost:8080.
Nota: O banco de dados H2 é iniciado automaticamente junto com o projeto e pode ser acessado pela interface de console em http://localhost:8080/h2-console.

Demonstração em Vídeo
Para uma demonstração completa do projeto e explicação das funcionalidades, confira o vídeo no link abaixo:

📹 Demonstração do Projeto no YouTube
https://www.youtube.com/watch?v=exemplo123
