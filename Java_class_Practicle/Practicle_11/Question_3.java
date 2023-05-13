
import java.awt.*;

class MainFrame extends Frame
{
	MainFrame()
	{
		setSize(600,600);
		setTitle("Question 3");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void  paint(Graphics g)
	{
		g.drawRect(50,50,400,400);
		g.drawRect(150,150,200,200);
	}
}

public class Question_3
{
	public static void main(String [] args)
	{
		MainFrame f = new MainFrame();
	}
}	
