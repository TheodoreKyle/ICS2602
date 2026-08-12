import java.awt.*;
import java.awt.event.*;

public class AwtAutoTextField {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Auto TextField Example");
        frame.setSize(400, 100);
        frame.setLayout(new FlowLayout());

        Label label1 = new Label("Input:");
        TextField inputField = new TextField(10);

        Label label2 = new Label("Output:");
        TextField outputField = new TextField(10);
        outputField.setEditable(false); // Make it read-only

        // Add TextListener to input field
        inputField.addTextListener(new TextListener() {
            public void textValueChanged(TextEvent e) {
                if (inputField.getText().equals("a"))
                outputField.setText("apple");
                else
                outputField.setText("");
            }
        });

        frame.add(label1);
        frame.add(inputField);
        frame.add(label2);
        frame.add(outputField);

        // Handle window closing
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
