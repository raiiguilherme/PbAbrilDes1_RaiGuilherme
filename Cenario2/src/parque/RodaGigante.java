package parque;

import usuarios.Adulto;
import usuarios.Crianca;

public class RodaGigante{
    
    

    Gondola[] cadeira = new Gondola[18];
    

    public void cadeira(int lugar, Crianca pessoa1, Crianca pessoa2){ //duas crianças maiores de 12 anos
         

        if (pessoa1.getIdade() < 12 || pessoa2.getIdade() < 12) { //se a idade de uma das crianças for menor que 12
           cadeira[lugar-1] = null;                                //a cadeira vai ficar nula, pois nao pode
        }

        
        else if (cadeira[lugar-1]!=null){ //se a cadeira desejada estiver cheia, procura uma cadeira com 2 lugares vazios 
            
            for(int i=0; i<cadeira.length; i++){
                
                if (cadeira[i]==null) { //adicionando as duas crianças na cadeira encontrada
                cadeira[i] = new Gondola();
                cadeira[i].setNumero(lugar);
                cadeira[i].setAssento1(pessoa1);
                cadeira[i].setAssento2(pessoa2);
                break;
                }
            }
            
        }
        else{ //se nao tiver ninguem no lugar escolhido, as duas crianças iram sentar
            cadeira[lugar-1] = new Gondola();
            cadeira[lugar-1].setNumero(lugar);
            cadeira[lugar-1].setAssento1(pessoa1);
            cadeira[lugar-1].setAssento2(pessoa2);
        }

    }

    public void cadeira(int lugar, Crianca pessoa1, Adulto pessoa2){ //uma criança e um responsavel

        if (pessoa1.getResponsavel().equals(pessoa2)) { //verificando se o responsavel pela criança é exatamente o mesmo responsavel cadastrado
            
            if (cadeira[lugar-1]!=null){ //verificando se tem alguem na cadeira desejada
            
                for(int i=0; i<cadeira.length; i++){
                    
                    if (cadeira[i]==null) { //achando uma cadeira com 2 lugares vazios e adicionando
                    cadeira[i] = new Gondola();
                    cadeira[i].setNumero(lugar);
                    cadeira[i].setAssento1(pessoa1);
                    cadeira[i].setAssento2(pessoa2);
                    break;
                    }
                }
                
            }
            else{ //se a cadeira desejada estiver vazia, ja adiciona

                cadeira[lugar-1] = new Gondola();
                cadeira[lugar-1].setNumero(lugar);
                cadeira[lugar-1].setAssento1(pessoa1);
                cadeira[lugar-1].setAssento2(pessoa2);
            }
            
            
            
        }

        else{ //se o responsavel nao for o mesmo cadastrado, entao o lugar fica nulo

            cadeira[lugar-1] = null;
        }

    }


    public void cadeira(int lugar, Crianca pessoa1){ //criança sozinha

        if (pessoa1.getIdade() < 12) { //se a criança tiver menos de 12 anos
           cadeira[lugar-1] = null;
        }
        
        else if(cadeira[lugar-1]!=null){ //se a cadeira escolhida estiver com alguem

            if (cadeira[lugar - 1].getAssento2() == null) { // Se apenas o assento 2 estiver vazio
                cadeira[lugar - 1].setAssento2(pessoa1); // Adiciona a pessoa no assento 2
            } 
            else { // Se ambos os assentos estiverem ocupados, encontra uma cadeira vazia e adiciona a pessoa no assento 1
                for (int i = 0; i < cadeira.length; i++) {
                    if (cadeira[i] == null) {
                        cadeira[i] = new Gondola();
                        cadeira[i].setNumero(lugar);
                        cadeira[i].setAssento1(pessoa1);
                        break;
                    }
                    else if(cadeira[i].getAssento2()==null){ //se ela nao estiver nula, entao adiciona a pessoa na cadeira 2
                        cadeira[i].setNumero(lugar);
                        cadeira[i].setAssento2(pessoa1);
                        break;
                    }
                }
            }
            
        }
        
        
        
        
        else { //se a cadeira escolhida nao tiver ninguem, adiciona a pessoa no assento 1
            cadeira[lugar-1] = new Gondola();
            cadeira[lugar-1].setNumero(lugar);
            cadeira[lugar-1].setAssento1(pessoa1);
            
        }

    }

    public void cadeira(int lugar, Adulto pessoa1){ //adulto sozinho

        
         
         if(cadeira[lugar-1]!=null){ //se a cadeira escolhida estiver com alguem
 
            if (cadeira[lugar - 1].getAssento2() == null) { // Se apenas o assento 2 estiver vazio
                cadeira[lugar - 1].setAssento2(pessoa1); // Adiciona a pessoa no assento 2
            } 
            else { // Se ambos os assentos estiverem ocupados, encontra uma cadeira vazia e adiciona a pessoa no assento 1
                for (int i = 0; i < cadeira.length; i++) {
                    if (cadeira[i] == null) {
                        cadeira[i] = new Gondola();
                        cadeira[i].setNumero(lugar);
                        cadeira[i].setAssento1(pessoa1);
                        break;
                    }
                    else if (cadeira[i].getAssento2()==null){ //se ela nao estiver nula, entao adiciona a pessoa na cadeira 2 
                        cadeira[i].setNumero(lugar);
                        cadeira[i].setAssento2(pessoa1);
                        break;
                    }
                }
            }
             
         }
         
         
         
         
         else { //se a cadeira escolhida nao tiver ninguem, adiciona a pessoa no assento 1
             cadeira[lugar-1] = new Gondola();
             cadeira[lugar-1].setNumero(lugar);
             cadeira[lugar-1].setAssento1(pessoa1);
             
         }
            
        

    }









    public void status(){
        
      System.out.println("Status atual da Roda Gigante");
       System.out.println("----------------------------");

       for(int i=0; i<cadeira.length; i++){
        if (cadeira[i]==null) { //se a cadeira estiver vazia

        System.out.println((i+1)+" (vazio)");
        }

        else if(cadeira[i].getAssento2()==null){ //se a cadeira estiver com gente no assento 1
            System.out.println((i+1) +" Apenas " +cadeira[i].getAssento1().getNome());
        }
        

     else{ //se a cadeira estiver com 2 pessoas
            System.out.println((i+1) +" " +cadeira[i].getAssento1().getNome() +" e " + cadeira[i].getAssento2().getNome());
        }


     }
       
       
        
        
    }

    

}
