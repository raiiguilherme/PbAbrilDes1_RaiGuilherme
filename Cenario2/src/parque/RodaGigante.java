package parque;

import usuarios.Adulto;
import usuarios.Crianca;
import usuarios.Pessoa;

public class RodaGigante{
    
    

    Gondola[] board = new Gondola[18];

    public void assento(int lugar, Crianca pessoa1, Crianca pessoa2){

        if (pessoa1.getIdade() < 12 || pessoa2.getIdade() < 12) {
           board[lugar] = null;
        }
        
        else{
            board[lugar] = new Gondola();
            board[lugar].setNumero(lugar);
            board[lugar].setAssento1(pessoa1);
            board[lugar].setAssento2(pessoa2);
        }

    }

    public void assento(int lugar, Crianca pessoa1, Adulto pessoa2){

        if (pessoa1.getResponsavel().equals(pessoa2)) { //verificando se o responsavel pela criança é exatamente o mesmo responsavel cadastrado
            board[lugar] = new Gondola();
            board[lugar].setNumero(lugar);
            board[lugar].setAssento1(pessoa1);
            board[lugar].setAssento2(pessoa2);
        }
        else{

            board[lugar] = null;
        }

    }


    public void status(){
        for(int i=0; i<board.length; i++){
            
           if (board[i]==null) {

             System.out.println(i+1+" (vazio)");
           }
           else{
           System.out.println(i+1 +" " +board[i].getAssento1().getNome() +" e " + board[i].getAssento2().getNome() );
           }


        }
    }

    

}
