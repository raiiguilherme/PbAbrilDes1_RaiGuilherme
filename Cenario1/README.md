# Arvore Genealógica 

## Instalação
Para utilizar o projeto, só é preciso abrir ele em sua IDE de preferencia e ter também o java instalado.

 ## Construção
   * Projeto construido com uma Classe Pessoa, com os atributos nome, conjuge e uma lista de filhos.

## Utilização
Para começar a criar a arvore de alguem, primeiro deve criar uma nova pessoa.
### Exemplo:
``` java
Pessoa lily = new Pessoa("Lily");
```
Após isso, deve se adicionar um marido ou um filho para a pessoa criada, e assim então ir adicionando novos maridos e filhos para os filhos dessa pessoa.

``` java
lily.addConjuge(new Pessoa("Oliver")); //adicionando conjuge para lily
        Pessoa pedro = new Pessoa("Pedro");
        Pessoa lane = new Pessoa("Lane");
        Pessoa joao = new Pessoa("João");
        Pessoa cloves = new Pessoa("Cloves");
        joao.addConjuge(new Pessoa("Gisele"));
        joao.addFilho(cloves);
```








     
   
