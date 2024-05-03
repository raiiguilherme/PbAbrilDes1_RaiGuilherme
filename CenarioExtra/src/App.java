import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String frase, feliz, triste;
        feliz = ":-)";
        triste = ":-(";
        Scanner s = new Scanner(System.in);

        frase = s.nextLine();
        String caracteresTristes = Pattern.quote(triste); //aceitando caracteres especiais 
        String caracteresFeliz = Pattern.quote(feliz);
    
        System.out.println(frase.split(caracteresTristes, -1).length-1);
        System.out.println(frase.split(caracteresFeliz, -1).length-1);
        


       

        s.close();
    }
}
