import java.awt.*; 
public class LayoutManagersDemo1 {
    public static void main (String[] args) {
        Frame mainFrame = new Frame("Layout Managers Demo"); 
        mainFrame.setSize(600, 400); 
        mainFrame.setLayout(new BorderLayout(10, 10));

        mainFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0); 
            }
        });
        

        Panel top_panel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10)); 
        top_panel.setBackground(Color.CYAN);
        top_panel.add(new Button("Button 1"));
        top_panel.add(new Button("Button 2"));
        top_panel.add(new Button("Button 3"));
        
        Panel center_panel = new Panel(new GridLayout(2, 2, 5, 5));
        center_panel.setBackground(Color.LIGHT_GRAY);
        center_panel.add(new Button("Grid 1"));
        center_panel.add(new Button("Grid 2"));
        center_panel.add(new Button("Grid 3"));
        center_panel.add(new Button("Grid 4"));

        Panel bottom_panel = new Panel(new FlowLayout(FlowLayout.RIGHT, 10, 10)); 
        bottom_panel.setBackground(Color.PINK); 
        bottom_panel.add(new Button("OK"));
        bottom_panel.add(new Button("Cancel"));

        mainFrame.add(top_panel, BorderLayout.NORTH); 
        mainFrame.add(center_panel, BorderLayout.CENTER);
        mainFrame.add(bottom_panel, BorderLayout.SOUTH);
        mainFrame.setVisible(true); 
    }
}