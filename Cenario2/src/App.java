import parque.RodaGigante;
import usuarios.Crianca;

public class App {
    public static void main(String[] args) throws Exception {
        RodaGigante rodaGigante = new RodaGigante();

       Crianca ana = new Crianca("ana", 14);
       Crianca clara = new Crianca("clara", 13);

        rodaGigante.assento(5, ana, clara);
        rodaGigante.status();




    }
}
