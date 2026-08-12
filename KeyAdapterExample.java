import java.awt.*;
import java.awt.event.*;

public class KeyAdapterExample {
    public static void main(String[] args) {
        Frame frame = new Frame("KeyAdapter Example");
        TextField tf = new TextField();
        tf.setBounds(50, 50, 200, 30);

        tf.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                tf.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        frame.add(tf);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        // Exit on close
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
