## Particularidades do código
* O path para a estrutura de Controllers/Services/Model é o: CalculadoraApplication/src/main/java/com/example/CalculadoraApplication
* O script em anexo não possui a interface com swagger de forma que a forma optada de operação foi por meio do POSTMAN;
    * Para tanto escolha a operação POST com o seguinte link:  http://localhost:8090/calcular-parcelas
    * Logo abaixo selecione a opção Body, optando pela inserção de dados 'raw' e em formato 'JSON'
    * Segue o escopo da entrada de dados:
{ "produto": { "codigo": 123, "nome": "Airfry", "valor": 10000 }, "condicaoPagamento": { "valorEntrada": 500, "qtdeParcelas": 7 } }
    * Tenha a certeza de pressionar o "Send" do POSTMAN após pressioanar a opção 'run' na IDE utilizada
      
--> Desde já agradeço a oportunidade, estou sempre apto a receber sugestões de melhoria :)
          
