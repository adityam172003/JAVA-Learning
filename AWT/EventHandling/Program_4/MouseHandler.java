import java.awt.event.*;


class MouseHandler implements MouseMotionListener
{

	MainFrame frame;
	
	MouseHandler(MainFrame f)	
	{
		frame =f;
		
	}
	
	public void mouseMoved(MouseEvent e)
	{
		frame.p=e.getPoint();
		frame.repaint();
		
	}
	
	public void mouseDragged(MouseEvent e)
	{
		//frame.p=e.getPoint();
		//frame.repaint();
	}
}
