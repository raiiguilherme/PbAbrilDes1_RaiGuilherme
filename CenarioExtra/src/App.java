import java.util.Scanner;

import verificador.Verificador;


public class App {
    public static void main(String[] args) throws Exception {
        String frase;

        Scanner s = new Scanner(System.in); //scanner para ler as entradas via terminal
        Verificador verificador = new Verificador(); //instanciando um novo verificador

        System.out.println("Verificador de Sentimentos");
        System.out.println("-------------------------");
        System.out.print("Digite aqui a sua mensagem utilizando emojis:");
        frase = s.nextLine(); //aguardando a entrada via terminal
        verificador.verificarEmocao(frase); //chamando o metodo do verificador



      
        
       
       
        


       

        s.close();
    }
}
