package verificador;

import java.util.regex.Pattern;

public class Verificador {
    
  
  private final String feliz = ":-)";
  private final String triste = ":-(";

public void verificarEmocao(String frase){

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
}

  

        
}
