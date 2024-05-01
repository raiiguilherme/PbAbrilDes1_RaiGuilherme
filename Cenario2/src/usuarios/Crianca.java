package usuarios;

public class Crianca extends Pessoa{
    private Adulto responsavel;

    public Adulto getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Adulto responsavel) {
        this.responsavel = responsavel;
    }

    public Crianca(String nome, int idade, Adulto responsavel) {
        super(nome,idade);
        this.responsavel = responsavel;
    }
    public Crianca(String nome, int idade) {
        super(nome,idade);
        
    }




    
}
