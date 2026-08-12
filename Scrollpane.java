import java.awt.*;
public class Scrollpane {
    private Frame f;
    private ScrollPane sp;
    private TextArea ta;
    private Button b;

    public Scrollpane() {
        f = new Frame("Scroll Pane");
        sp = new ScrollPane();
        ta = new TextArea("Paragraph");  
        b = new Button("Test Button");
    }

    public void start() {
        f.setLayout(new FlowLayout()); 
        f.setSize(500, 500); 

        f.add(sp);
        f.add(ta);
        f.add(b);
        f.setVisible(true); 
    }
    public static void main (String[] args) {
        Scrollpane aaa = new Scrollpane(); 
        aaa.start(); 
    }
}