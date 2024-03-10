import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçãoDeTela {
    public static void main(String[] argt){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Screen width:" + d.width);
        System.out.println("Screen height:" + d.height);
    }
 
}
