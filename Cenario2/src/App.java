

import parque.RodaGigante;
import usuarios.Adulto;
import usuarios.Crianca;

public class App {
    public static void main(String[] args) throws Exception {
        RodaGigante rodaGigante = new RodaGigante();

        Adulto paulo = new Adulto("Paulo", 42); 
       
        Crianca joao = new Crianca("Joao", 5, paulo); 
        Crianca maria = new Crianca("Maria", 12, paulo); 
        
        Crianca pedro = new Crianca("Pedro", 13); 
        Crianca henrique = new Crianca("Henrique", 10); 
        
      
        
        try{
            rodaGigante.cadeira(2, joao, maria);
            rodaGigante.cadeira(2, joao, paulo);
            rodaGigante.cadeira(3, maria); 
            rodaGigante.cadeira(13, pedro);
            rodaGigante.cadeira(16, henrique);

           
        }
        catch(ArrayIndexOutOfBoundsException exception){ //capturando uma exceção caso tente adicionar uma pessoa em uma cadeira que nao existe
           throw new RuntimeException("Nao é possivel adicionar em uma cadeira de numero maior que 18, verifique seu codigo e tente novamente");
           
        }
        finally{

            rodaGigante.status();
        }
        
        
        
        
        




    }
}
