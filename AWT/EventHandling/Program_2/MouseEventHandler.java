import java.awt.event.*;

class MouseEventHandler extends MouseAdapter
{

	MainFrame frame ;
	
	MouseEventHandler(MainFrame f)
	{
		frame = f;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		
		frame.heading = (frame.heading.equals("Hello Java"))?"Bye Java":"Hello Java";
		
		frame.repaint();
	}
}
