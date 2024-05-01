package parque;

import usuarios.Adulto;
import usuarios.Crianca;

public class RodaGigante{
    
    

    Gondola[] cadeira = new Gondola[18];

    public void cadeira(int lugar, Crianca pessoa1, Crianca pessoa2){ //duas crianças maiores de 12 anos

        if (pessoa1.getIdade() < 12 || pessoa2.getIdade() < 12) {
           cadeira[lugar-1] = null;
        }
        
        else{
            cadeira[lugar-1] = new Gondola();
            cadeira[lugar-1].setNumero(lugar);
            cadeira[lugar-1].setAssento1(pessoa1);
            cadeira[lugar-1].setAssento2(pessoa2);
        }

    }

    public void cadeira(int lugar, Crianca pessoa1, Adulto pessoa2){ //uma criança e um responsavel

        if (pessoa1.getResponsavel().equals(pessoa2)) { //verificando se o responsavel pela criança é exatamente o mesmo responsavel cadastrado
            cadeira[lugar-1] = new Gondola();
            cadeira[lugar-1].setNumero(lugar);
            cadeira[lugar-1].setAssento1(pessoa1);
            cadeira[lugar-1].setAssento2(pessoa2);
        }
        else{

            cadeira[lugar-1] = null;
        }

    }


    public void cadeira(int lugar, Crianca pessoa1){ //criança sozinha

        if (pessoa1.getIdade() < 12) {
           cadeira[lugar-1] = null;
        }
        
        else{
            cadeira[lugar-1] = new Gondola();
            cadeira[lugar-1].setNumero(lugar);
            cadeira[lugar-1].setAssento1(pessoa1);
            
        }

    }

    public void cadeira(int lugar, Adulto pessoa1){ //adulto sozinho

       
            cadeira[lugar-1] = new Gondola();
            cadeira[lugar-1].setNumero(lugar);
            cadeira[lugar-1].setAssento1(pessoa1);
            
        

    }









    public void status(){
        
      System.out.println("Status atual da Roda Gigante");
       System.out.println("----------------------------");

       for(int i=0; i<cadeira.length; i++){
        if (cadeira[i]==null) {

        System.out.println((i+1)+" (vazio)");
        }

        else if(cadeira[i].getAssento2()==null){
            System.out.println((i+1) +" Apenas " +cadeira[i].getAssento1().getNome());
        }


        else{
            System.out.println((i+1) +" " +cadeira[i].getAssento1().getNome() +" e " + cadeira[i].getAssento2().getNome());
        }


     }
       
       
        
        
    }

    

}
