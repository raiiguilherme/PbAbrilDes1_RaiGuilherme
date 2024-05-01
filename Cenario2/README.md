# Projeto da Roda Gigante

## Instalação
Para utilizar o projeto, só é preciso abrir ele em sua IDE de preferencia e ter também o java instalado.

 ## Construção
   * Projeto construido com uma classe Pessoa (Classe pai), e duas classes filhas (Classe Crianca e Classe Adulto) estas que herdam da classe Pessoa.
   * Foi feita também uma classe Gondola e uma Classe RodaGigante, esta que por sua vez contem toda a logica de negocio.

## Logica de Negocio

 * Na adição de pessoas aos lugares, só é possivel adicionar uma criança menor de 12 anos com o seu respectivo responsavel que foi cadastrado no construtor da criança.
 * Adultos e Crianças maiores de 12 anos podem ir sozinhas e também acompanhadas em uma cadeira
 * Ao adicionar uma unica pessoa na roda gigante, esta ocupa o assento de numero 1 
 * Ao tentar adicionar um pessoa a uma cadeira que ja tem alguem, antes de procurar uma nova cadeira vazia, primeiro o programa identifica se o assento 2 também está ocupodo. Não estando, a pessoa é alocada para o assento 2 desse lugar escolhido.
 * Caso o lugar escolhido esteja totalmente lotado, o programa busca então a proxima cadeira vazia (também podendo ser um lugar com apenas uma pessoa) para acomodar a pessoa que deseja, começando a buscar pela cadeira de numero 1.
 * Ao tentar adicionar alguem em uma cadeira que nao existe, o programa ira adicionar as pessoas posicionadas corretamente e entao ira lançar um exceção e monstrar o status da Roda Gigante.


## Utilização
 ### Criando novas pessoas:
 ``` java
        Adulto paulo = new Adulto("Paulo", 42); 
       
        Crianca joao = new Crianca("Joao", 5, paulo); 
        Crianca maria = new Crianca("Maria", 12, paulo); 
```
### Adicionando aos lugares
``` java
            rodaGigante.cadeira(2, joao, maria);
            rodaGigante.cadeira(2, joao, paulo);
            rodaGigante.cadeira(3, maria); 
```

