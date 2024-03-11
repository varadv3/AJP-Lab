import java.awt.*;
import java.awt.event.*;
class MouseActivities extends WindowAdapter implements MouseListener{
	Frame frame;
	Button button;
	Label label;
	MouseActivities(){
		frame = new Frame();
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setBounds(0, 0, 600, 425);;
		frame.setTitle("Experiment 2: 32270 Varad Vanga");
		frame.addWindowListener(this);
		button = new Button("Submit");
		label = new Label("Label");
		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		button.setBounds(250, 50, 100, 25);
		frame.add(button);
		label.setBounds(195, 100, 220, 50);
		frame.add(label);
		button.addMouseListener(this);
		
	}
	public void windowClosing(WindowEvent e) {
		frame.dispose();
	}
	public void mouseClicked(MouseEvent e) {
		frame.setBackground(new Color(100, 161, 207));
		label.setText("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent e) {
		frame.setBackground(Color.white);
		label.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e) {
		frame.setBackground(Color.lightGray);
		label.setText("Mouse Exited");
	}
	public void mousePressed(MouseEvent e) {
		frame.setBackground(new Color(240, 128, 128));
		label.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e) {
		frame.setBackground(Color.orange);
		label.setText("Mouse Released");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseActivities();
	}

}
