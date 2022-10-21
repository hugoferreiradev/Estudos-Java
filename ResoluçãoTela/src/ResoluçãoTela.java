
import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçãoTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("largura do monitor = " + d.width);
        System.out.println("altura do monitor = " + d.height);
    }
}

// Pegar a resolução do seu monitor.