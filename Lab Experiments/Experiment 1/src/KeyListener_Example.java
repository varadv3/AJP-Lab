import java.awt.*;
import java.awt.event.*;
public class KeyListener_Example extends WindowAdapter implements KeyListener{
	Label l;
	TextArea t;
	Frame f;
	KeyListener_Example()
	{   
		f=new Frame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.setTitle("Experiment 1 : 32269 Aditya Toshniwal");
		init();
		add_Component();
	}
	public void init()
	{
		
		l=new Label();
		t=new TextArea();
		
	}
	
	public void add_Component() {
		
		l.setBounds(20, 50, 300, 20);
		f.add(l);
		
		t.setBounds(20, 80, 300, 300);
		f.add(t);
		
		f.addWindowListener(this);// 
		t.addKeyListener(this);
	}
	
	public void windowClosing(WindowEvent e)
	
	{
		f.dispose();
	}
	
	public void keyPressed(KeyEvent k)
	{
		//abstract methods
		l.setText("Key is pressed");
	}
	
	public void keyReleased(KeyEvent k)
	{
		l.setText("Key is released");
	}
	
	public void keyTyped(KeyEvent k)
	{
		l.setText("Key is typed");
	}
	


	public static void main(String args[])
	{
		new KeyListener_Example();
	}
	
}