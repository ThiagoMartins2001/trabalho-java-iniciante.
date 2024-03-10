import java.util.Locale;

public class LinguaDoSistema {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String language = locale.getDisplayLanguage();
        System.out.println("Lingua do sistema operacional" + language);       
    } 
    
}
