import java.awt.*;
import java.awt.event.*; 
public class colorcalculator implements ActionListener { 
    private Frame f; 
    private Panel p1, p2, p3, p4, p5, p6; 
    private Label l1, l2, l3, l4, error;
    private TextField red, green, blue, alpha; 
    private Button compute, clear; 
    
    public colorcalculator() {
        f = new Frame("My Color Calculator");
        f.setLayout(new GridLayout(6, 1));

        p1 = new Panel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        p2 = new Panel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        p3 = new Panel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        p4 = new Panel(new FlowLayout(FlowLayout.CENTER, 5, 5));  
        p5 = new Panel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        p6 = new Panel();

        l1 = new Label("Red:"); 
        l2 = new Label("Green:"); 
        l3 = new Label("Blue:");
        l4 = new Label("Alpha:"); 
        error = new Label ("Please follow these inputs: Red: 0 - 255, Green: 0 - 255, Blue: 0 - 255, Alpha: 0 - 255"); 

        red = new TextField("0", 15); 
        green = new TextField("0", 15); 
        blue = new TextField("0", 15);
        alpha = new TextField("0", 15);

        compute = new Button("COMPUTE"); 
        clear = new Button("CLEAR"); 
    }

    public void startApp() {
        f.setSize(500, 300); 

        p1.add(l1);
        p1.add(red);
        p2.add(l2); 
        p2.add(green); 
        p3.add(l3);
        p3.add(blue); 
        p4.add(l4);  
        p4.add(alpha); 
        p5.add(compute);
        p5.add(clear);
        error.setForeground(Color.RED);
        error.setVisible(false);
        p6.add(error); 

        compute.addActionListener(this);
        clear.addActionListener(this); 

        f.add(p1); 
        f.add(p2); 
        f.add(p3);
        f.add(p4);
        f.add(p5);
        f.add(p6, BorderLayout.SOUTH);
        f.addWindowListener(new MyCloseButton());  
        f.setVisible(true); 
    }

    public void actionPerformed (ActionEvent event_action) {
        Object source = event_action.getSource();
        int r, g, b, a; 

        if (source == clear) {
            red.setText("0"); 
            green.setText("0"); 
            blue.setText("0"); 
            alpha.setText("0"); 
            p6.setBackground(null); 
            error.setVisible(false);
        }
        try {
            r = Integer.parseInt(red.getText());
            g = Integer.parseInt(green.getText());
            b = Integer.parseInt(blue.getText());
            a = Integer.parseInt(alpha.getText());

            if (source == compute) 
                p6.setBackground(new Color(r, g, b, a)); 
        }
        catch (Exception e) {
            p6.setBackground(null);
            error.setVisible(true);  
        }
        p6.validate();
    }

    private class MyCloseButton extends WindowAdapter {
        public void windowClosing (WindowEvent theodore_kyle_choa) {
            System.exit(0); 
        }
    }
    public static void main (String[] args) {
        colorcalculator Colors = new colorcalculator(); 
        Colors.startApp();
    } 
}