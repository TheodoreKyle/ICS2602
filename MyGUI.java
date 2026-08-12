import java.awt.*;
import java.awt.event.*; 
public class MyGUI {
    private Frame f;
    private Button b;

    public MyGUI() { 
        f = new Frame("Delegation Event Model"); 
        b = new Button("Click Me!"); 
    }

    void startApp() {
        f.setSize(750, 650);
        f.add(b);  
        b.addActionListener(new MyEvent());
        b.addActionListener(new MyEvent2()); 
        f.setVisible(true);
        f.addWindowListener(new Close()); 
    }

    private class Close extends WindowAdapter {
        public void windowClosing (WindowEvent aaaa) {
            System.exit(0); 
        }
    }

    public static void main (String[] args) {
        MyGUI gui = new MyGUI(); 
        gui.startApp(); 
    }
}