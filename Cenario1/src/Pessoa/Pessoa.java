package Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
   private String nome;
  private  Pessoa conjuge;
    private List<Pessoa> filho; //lista de filhos

   
    public Pessoa(String nome) {
        this.nome = nome;
        this.filho = new ArrayList<>(); //iniciando a lista de filhos
        
    }

    @Override       //to string para imprimir os objetos
    public String toString() {
        
            return nome;
        }

     //Getters e Setters
    public String getNome() {
        return nome; 
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Pessoa getConjuge() {
        return conjuge;
    }
    public void setMarido(Pessoa conjuge) {
        this.conjuge = conjuge;
    }
    
    
    public List<Pessoa> getFilho() {
        return filho;
    }

    public void setFilho(List<Pessoa> filho) {
        this.filho = filho;
    }



    //Metodos

    public void addFilho(Pessoa pessoa){
        this.filho.add(pessoa);
    }

    public void addConjuge(Pessoa conjuge){
        this.conjuge = conjuge;
    }

    public void printFamilyTree(int nivel) {

        // Colocando os espaços 
        for (int i = 0; i < nivel; i++) {
            System.out.print("  "); 
        }
    
        // Imprime o nome desta pessoa
        if(this.conjuge != null){
            System.out.println(this.nome + " -- Casado com: "+ this.conjuge + " -- Filhos: ");
        }
        else{
            System.out.println(this.nome + " -- Solteiro");
        }
    
        // Se esta pessoa tem filhos, imprime os filhos recursivamente enquanto aumenta o nivel pra aumentar o espaço
        for (Pessoa filho : this.filho) {
            filho.printFamilyTree(nivel + 1);
        }
    }


    

    
    
    


    
}
