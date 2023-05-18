# Projeto Apirest


## Criação de executável e utilização da API

- Inicialmente importe o projeto apirest para uma IDE

- Agora vá ate o arquivo application.properties e configure as informações do banco de dados

- Para criar o arquivo .jar é necessário ir atráves do terminal até a pasta raiz do projeto e digitar: mvn clean package

- Ao finalizar o processo será criado um arquivo chamado: apirest-0.0.1-SNAPSHOT.jar, é possivel trocar esse nome através de configurações feitas no pom.xml

- Agora que temos o executável da aplicação, basta clicar sobre ele ou ir até a pasta do arquivo no terminal e digitar: java -jar apirest-0.0.1-SNAPSHOT.jar

- Por padrão o projeto será executado na porta 8080, mas caso queira trocar a porta de execução será necessário fazer uma configuração no arquivo pom.xml

- Outro fator importante é que o protocolo a ser utilizado na transferência dos dados será o HTTP e a tecnologia mais utilizada para a organização dos dados é o JSON 

- Ao executar o projeto, o spring boot cria todas as tabelas necessárias, mas caso queira criá-las manualmente, basta executar os scripts de criação de tabela disponiveis nesse repositorio.

- Agora faça a execução dos scripts de inserção de dados na tabela supplier

- Depois disso a API está totalmente pronta para ser utilizada

- Para utilizar a API importe o arquivo postman_collection_apirest.postman_collection.json no Postman e faça as devidas requisições

### O que é possível fazer na API através da importação do postman_collection_apirest.postman_collection.json?

- listProduct: lista todos os produtos cadastrados

- listProductById: lista um produto de acordo com o id passado na url

- createProduct: cria um novo produto a partir de um JSON passado no corpo da requisição

- updateProduct: edita um produto já cadastrado no banco de dados

- updateStockIncrease: incrementa um valor no estoque de um produto determinado, passando os valores através da seguinte URL: localhost:8080/product/1/increase/102. Onde o 1 reresenta o id do produto, increase indica que o estoque será incrementado, e 102 representa a quantidade a ser incrementada no estoque  

- updateStockIncrease: decrementa um valor no estoque de um produto determinado, passando os valores através da seguinte URL: localhost:8080/product/1/decrease/100. Onde o 1 reresenta o id do produto, decrease indica que o estoque será decrementado, e 102 representa a quantidade a ser decrementada no estoque

- deleteProduct: exclui um produto através de um id passado na URL



## Documentação da API:

- Além das funções pedidas, eu também realizei a documentação da API, para acessá-la é necessário que a API esteje em execução e ir em um navegador e digitar: http://localhost:8080/swagger-ui.html



