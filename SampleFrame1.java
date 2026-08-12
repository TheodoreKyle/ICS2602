import java.awt.*;
public class SampleFrame1 {
    private Frame f; 

    public SampleFrame1() {
        f = new Frame("My First GUI App"); 
    }

    public void startApp() {
        f.setBackground(new Color(0xffffff));    
        f.setBackground(new Color(255, 51, 204)); 
        f.setSize(500, 200);
        f.setVisible(true); 
    }

    public static void main (String[] args) {
        SampleFrame1 sf = new SampleFrame1(); 
        sf.startApp(); 
    }
}