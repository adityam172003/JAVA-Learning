import java.awt.event.*;
import java.awt.*;


class WindowEventHandler extends WindowAdapter
{

	public void windowClosing(WindowEvent e)
	{
		Frame f = (Frame)e.getSource();
		f.dispose();
	}

}
