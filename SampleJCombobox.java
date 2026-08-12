import java.awt.*;
import javax.swing.*;    
import java.awt.event.*; 
public class SampleJCombobox { 
    private JFrame f;
    private JButton b;
    private JLabel label; 
    private JComboBox<String> cb;
    private String[] colorList; 

    public SampleJCombobox() {
        f = new JFrame("Sample JComboBox"); 
        label = new JLabel(); 
        colorList = new String[] {"Red", "Green", "Blue", "Yellow", "Purple"}; 
        cb = new JComboBox<>(colorList); 
        b = new JButton("Show"); 

        cb.setBounds(50, 100, 90, 50);
        label.setHorizontalAlignment(JLabel.CENTER); 
        label.setSize(400, 100); 
        b.setBounds(200, 100, 90, 50); 
    }

    public void startApp() {
        f.setBounds(100, 100, 200, 200); 
        f.setLayout(null);

        f.add(cb);
        f.add(label); 
        f.add(b);
        f.setSize(500, 500);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String str = "My Color List " + cb.getItemAt(cb.getSelectedIndex()); 
                label.setText(str); 
            }
        });
    }

    public static void main (String[] args) {
        SampleJCombobox sj = new SampleJCombobox(); 
        sj.startApp();
    }
}