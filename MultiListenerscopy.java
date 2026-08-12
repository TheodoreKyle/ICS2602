import java.awt.*;
import java.awt.event.*;

public class MultiListenerscopy implements MouseListener, MouseMotionListener { 
	private Frame f;
 	private TextField tf;
	private Label label;

	public MultiListenerscopy () {
        f = new Frame("I have Two listeners example");
    	tf = new TextField(30);
    	label = new Label("Click and drag the mouse");
    }
    
    public void startApp() {
    	f.add(label, BorderLayout.NORTH);
    	f.add(tf, BorderLayout.SOUTH);

		f.setSize(300, 200);
		f.setVisible(true);

		// event handler registration
        f.addMouseMotionListener(this); 
        f.addMouseListener(this);
		f.addWindowListener(new MyCloseButton()); 

 	}

  	// The event handlers
    public void mouseDragged(MouseEvent e) {
        String s = "Mouse Dragging: X = " + e.getX() + " Y = " + e.getY(); 
        tf.setText(s); 
  	}

  	public void mouseEntered(MouseEvent e) {
        String s = "Mouse Entered the Frame"; 
        tf.setText(s); 
  	}

  	public void mouseExited(MouseEvent e) {
        String s = "Mouse Exited the Frame"; 
        tf.setText(s); 
  	}

	public void mouseMoved(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}  

	private class MyCloseButton extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0); 
		}
	}

	public static void main(String args[]) {
    	MultiListenerscopy  ml = new MultiListenerscopy ();
    	ml.startApp();
  	}
}