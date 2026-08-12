import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Counter implements ActionListener {
    private JFrame f;
    private Panel p; 
    private JLabel l1, l2, l3;
    private JButton b; 
    private static int counter = 0;

    public Counter() {
        f = new JFrame("Counter");

        p = new Panel(); 
        p.setBackground(Color.BLACK);  

        l1 = new JLabel("0");
        l1.setFont(new Font("Serif",  Font.BOLD, 40)); 
        l1.setForeground(Color.WHITE);

        l2 = new JLabel("0");
        l2.setFont(new Font("Serif",  Font.BOLD, 40));
        l2.setForeground(Color.WHITE);

        l3 = new JLabel("0");
        l3.setFont(new Font("Serif",  Font.BOLD, 40)); 
        l3.setForeground(Color.BLACK);
        l3.setOpaque(true); 

        b = new JButton("Click Me!");  
    }

    public void startApp() {
        p.setLayout(new GridLayout(1, 3)); 
        p.add(l1);
        p.add(l2);
        p.add(l3);

        f.add(p, BorderLayout.CENTER); 
        f.add(b, BorderLayout.SOUTH); 
        f.setSize(500, 500); 
        f.setVisible(true);

        b.addActionListener(this);

    }

    public void actionPerformed (ActionEvent ae) {
        counter = Integer.parseInt(l1.getText() + l2.getText() + l3.getText());
        counter++; 
        int hund = counter / 100; 
        int temp = counter % 100;
        int tens = temp / 10; 
        int ones = temp % 10; 
        l1.setText("" + hund);
        l2.setText("" + tens);
        l3.setText("" + ones); 
    }
    public static void main (String[] args) {
        Counter ctr = new Counter();
        ctr.startApp();
    }
}