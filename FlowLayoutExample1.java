import java.awt.*;
public class FlowLayoutExample1 {
    private Frame f;
    private Button Add, Minus, Multiply, Divide; 

    public FlowLayoutExample1() {
        f = new Frame("Flow Layout Example"); 
        Add = new Button("+");
        Minus = new Button("-");
        Multiply = new Button("x");
        Divide = new Button("÷");
    }

    public void startApp() {
        f.setLayout(new FlowLayout());
        f.add(Add); 
        f.add(Minus);
        f.add(Multiply);
        f.add(Divide); 
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main (String[] args) {
        FlowLayoutExample1 fe = new FlowLayoutExample1(); 
        fe.startApp(); 
    }
}