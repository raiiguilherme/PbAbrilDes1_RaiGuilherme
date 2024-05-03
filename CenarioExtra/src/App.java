import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String frase, feliz, triste;
        feliz = ":-)";
        triste = ":-(";
        Scanner s = new Scanner(System.in); //scanner para ler as entradas via terminal

        System.out.println("Verificador de Sentimentos");
        System.out.println("-------------------------");
        System.out.print("Digite aqui a sua mensagem utilizando emojis:");
        frase = s.nextLine(); //aguardando a entrada via terminal



        //Logica da aplicação
        String emojiTriste = Pattern.quote(triste); //aceitando caracteres especiais 
        String emojiFeliz = Pattern.quote(feliz);
    
        if(frase.split(emojiFeliz, -1).length-1 > frase.split(emojiTriste, -1).length-1){ //verificando se o numero de ocorrencias de emoji feliz é maior que o de emojis tristes
            System.out.println("Divertido");
        }
        else if (frase.split(emojiFeliz, -1).length-1 < frase.split(emojiTriste, -1).length-1){ //verificando se o numero de ocorrencias de emoji feliz é menor que o de emoji tristes
            System.out.println("Chateado");
        }
        else{ //se nao for maior nem menor, então na logica eles serão iguais (Neutro)
            System.out.println("Neutro");
        }
        
       
       
        


       

        s.close();
    }
}
