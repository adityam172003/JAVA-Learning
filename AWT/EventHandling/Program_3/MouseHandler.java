import java.awt.event.*;


class MouseHandler extends MouseAdapter
{

	MainFrame frame;
	
	MouseHandler(MainFrame f)
	{
		frame =f;
		
	}
	
	public void mouseClicked(MouseEvent e)
	{
		
		frame.p=e.getPoint();
		frame.repaint();
	}
}
