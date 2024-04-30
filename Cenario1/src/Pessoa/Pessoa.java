package Pessoa;

public class Pessoa {
   private String nome;
  private  Pessoa marido;
    private Pessoa filho;

   
    public Pessoa(String nome) {
        this.nome = nome;
        
    }

    @Override
    public String toString() {
        if (marido==null) {
            return nome + " -- Solteiro";
        }
        return nome + " -- Casado com: "+ marido.nome +" -- filhos: \n"+ filho ;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Pessoa getMarido() {
        return marido;
    }
    public void setMarido(Pessoa marido) {
        this.marido = marido;
    }
    public Pessoa getFilho() {
        return filho;
    }
    public void setFilho(Pessoa filho) {
        this.filho = filho;
    }

    public void addFilho(Pessoa pessoa){
        this.filho = pessoa;
    }

    public void addMarido(Pessoa pessoa){
        this.marido = pessoa;
    }

    

    
    
    


    
}
