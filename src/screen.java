import javax.swing.JFrame;

public class screen {
	public static void main(String args[])
	{
		moveScreen s = new moveScreen();
		JFrame f = new JFrame();
		f.add(s);
		f.setVisible(true);
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
