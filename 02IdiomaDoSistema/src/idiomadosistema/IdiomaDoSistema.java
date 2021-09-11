package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {
    
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O idoma do sistema é: " + loc.getDisplayLanguage());//imprime o idioma do sistema
        System.out.println("O seu país é: " + loc.getDisplayCountry());//imprime o seu pais
    }  
}
