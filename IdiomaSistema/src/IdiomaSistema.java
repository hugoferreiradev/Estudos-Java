
import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é: ");
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
    }
}

// Pegar o idioma do sistema operacional.
