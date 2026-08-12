import java.awt.*;
import javax.swing.*;   
public class SampleJCheckbox {
    private JFrame f;
    private JButton b;
    private JCheckBox red, green, blue;

    public SampleJCheckbox() {
        f = new JFrame("Sample JCheckBox"); 
        b = new JButton("Click me"); 
        red = new JCheckBox("Red");
        green = new JCheckBox("Green");
        blue = new JCheckBox("Blue");
    }

    public void startApp() {
        f.setBounds(100, 100, 200, 200); 
        f.setLayout(new GridLayout(4, 1));

        red.setSelected(true);
        blue.setSelected(true); 
        f.add(red);
        f.add(green);
        f.add(blue);
        f.add(b);
        f.setVisible(true);
    }

    public static void main (String[] args) {
        SampleJCheckbox sj = new SampleJCheckbox();
        sj.startApp();
    }
}