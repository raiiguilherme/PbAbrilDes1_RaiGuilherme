import Pessoa.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       

        Pessoa lily = new Pessoa("lily");
        
        lily.setMarido(new Pessoa("oliver"));
        lily.setFilho(new Pessoa("pedro"));
        System.out.println(lily);
    }
}
