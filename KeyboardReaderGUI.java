import javax.swing.JOptionPane; 
public class KeyboardReaderGUI {
    public static void main (String[] args) {
    String name = JOptionPane.showInputDialog("What is your name?"); 
    String msg = "Hello " + name + "! How are you doing?";
    JOptionPane.showMessageDialog(null, msg);
    }
}