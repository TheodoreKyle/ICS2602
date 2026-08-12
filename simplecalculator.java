import java.awt.*;
import java.awt.event.*;
public class simplecalculator implements ActionListener {
    private Frame f;
    private Panel p1, p2, p3, p4; 
    private Label l1, l2, l3;
    private TextField tf1, tf2, tf3; 
    private Button bAdd, bSub, bMul, bDiv, bClear;

    public simplecalculator() {
        f = new Frame("My First GUI App"); 
        f.setLayout((new GridLayout(4, 1)));

        p1 = new Panel(new FlowLayout()); 
        p2 = new Panel(new FlowLayout());
        p3 = new Panel(new FlowLayout());
        p4 = new Panel(new FlowLayout());

        l1 = new Label("First: ");
        l2 = new Label("Second: ");
        l3 = new Label("Result: "); 

        tf1 = new TextField("0.0", 20);
        tf2 = new TextField("0.0", 20);
        tf3 = new TextField("0.0", 20);

        bAdd = new Button("+"); 
        bSub = new Button("-"); 
        bMul = new Button("x"); 
        bDiv = new Button("÷");
        bClear = new Button("C"); 
    }

    public void startApp() {
        f.setSize(400, 200); 

        p1.add(l1); 
        p1.add(tf1);
        p2.add(l2);
        p2.add(tf2);
        p3.add(l3); 
        p3.add(tf3); 
        p4.add(bAdd);
        p4.add(bSub);
        p4.add(bMul);
        p4.add(bDiv);
        p4.add(bClear);

        f.add(p1);  
        f.add(p2);
        f.add(p3);
        f.add(p4); 
        f.addWindowListener(new MyCloseButton()); 
        f.setVisible(true);

        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bClear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        double num1 = 0.0, num2 = 0.0, num3 = 0.0; 
        if (tf1.getText() != null && tf2.getText() != null) {
            num1 = Double.parseDouble(tf1.getText());
            num2 = Double.parseDouble(tf2.getText());  

            if (source == bAdd) 
                num3 = num1 + num2;
            if (source == bSub) 
                num3 = num1 - num2;
            if (source == bMul) 
                num3 = num1 * num2;
            if (source == bDiv) 
                num3 = num1 / num2;
            if (source == bClear) {
                tf1.setText("0.0"); 
                tf2.setText("0.0");
                tf3.setText("0.0"); 
            }
        }
        else {} 
        tf3.setText("" + num3); 
    }

    private class MyCloseButton extends WindowAdapter {
        public void windowClosing (WindowEvent a) {
            System.exit(0); 
        }
    }
    public static void main (String[] args) {
        simplecalculator gui = new simplecalculator(); 
        gui.startApp();
    }
}