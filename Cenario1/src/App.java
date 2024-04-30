import Pessoa.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       

        Pessoa lily = new Pessoa("lily");
        lily.addMarido(new Pessoa("oliver"));
        lily.addFilho(new Pessoa("pedro"));
        System.out.println(lily);
    }
}
