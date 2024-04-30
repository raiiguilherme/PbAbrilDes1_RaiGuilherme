import Pessoa.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       
        //construção da arvore

        Pessoa lily = new Pessoa("Lily");
        lily.addConjuge(new Pessoa("Oliver")); //adicionando conjuge para lily
        Pessoa pedro = new Pessoa("Pedro");
        Pessoa lane = new Pessoa("Lane");
        Pessoa joao = new Pessoa("João");
        Pessoa cloves = new Pessoa("Cloves");
        joao.addConjuge(new Pessoa("Gisele"));
        joao.addFilho(cloves);
        cloves.addConjuge(new Pessoa("Ana Clara"));
        cloves.addFilho(new Pessoa("Junior"));
        lane.addConjuge(new Pessoa("Carlos"));
        lane.addFilho(new Pessoa("Ingrid")); //adicioando filhos para a pessoa lane
        lane.addFilho(new Pessoa("Henrique"));
        lily.addFilho(pedro); //adicionando filhos para lily
        lily.addFilho(lane);
        lily.addFilho(joao);
        pedro.addConjuge(new Pessoa("Clara"));
        Pessoa ana = new Pessoa("Ana");
        pedro.addFilho(ana);
        
        //imprimindo 

        lily.printFamilyTree(0);
    }
}
