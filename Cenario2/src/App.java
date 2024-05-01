import parque.RodaGigante;
import usuarios.Adulto;
import usuarios.Crianca;

public class App {
    public static void main(String[] args) throws Exception {
        RodaGigante rodaGigante = new RodaGigante();

       Adulto ana = new Adulto("Ana", 40);
       Adulto maria = new Adulto("Ana", 40);
       Crianca clara = new Crianca("Clara", 13, ana);

        rodaGigante.cadeira(5, clara, ana);
        rodaGigante.cadeira(1, maria);
        rodaGigante.status();




    }
}
