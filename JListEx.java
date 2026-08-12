import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListEx { 
    private JFrame f;
    private JList<String> colorList;
    private JLabel label; 

    public JListEx() {
        f = new JFrame("JList Example"); 
        label = new JLabel(); 
        
        DefaultListModel<String> listModel = new DefaultListModel<>();  
        listModel.addElement("Red");
        listModel.addElement("Green");
        listModel.addElement("Blue");

        colorList = new JList<>(listModel);
        colorList.setSelectedIndex(0); 

        label.setHorizontalAlignment(JLabel.CENTER); 
        label.setSize(400, 100); 
    }

    public void startApp() {
        f.setLayout(new FlowLayout());

        f.add(label); 
        f.add(colorList); 
        f.setSize(400, 400);
        f.setVisible(true);

        colorList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                label.setText("Selected Color: " + colorList.getSelectedValue());
            }
        });
    }

    public static void main (String[] args) {
        JListEx sj = new JListEx();
        sj.startApp();
    }
}