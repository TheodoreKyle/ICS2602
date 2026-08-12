import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;   
public class JRadiobtn {
    private JFrame f;
    private JButton b;
    private JRadioButton red, green, blue;
    private JLabel label;

    public JRadiobtn() {
        f = new JFrame("JRadioButton Example"); 
        b = new JButton("Show Color!"); 
        
        // Initialize radio buttons with color labels
        red = new JRadioButton("Red");
        green = new JRadioButton("Green");
        blue = new JRadioButton("Blue");

        // Group radio buttons
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(red);
        colorGroup.add(green);
        colorGroup.add(blue); 
        red.setSelected(true);
        green.setSelected(false); 
        blue.setSelected(false);

        label = new JLabel("Selected Color: ");
        label.setHorizontalAlignment(JLabel.CENTER);
    }

    public void startApp() {
        f.setBounds(100, 100, 300, 250); 
        f.setLayout(new GridLayout(5, 1));

        f.add(red);
        f.add(green);
        f.add(blue);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (red.isSelected())
                    label.setText("Selected Color: Red"); 
                else if (green.isSelected())
                    label.setText("Selected Color: Green");
                else
                    label.setText("Selected Color: Blue");
            }
        });
        f.add(label); 
        f.setVisible(true);
    }

    public static void main (String[] args) {
        JRadiobtn sj = new JRadiobtn(); 
        sj.startApp();
    }
}