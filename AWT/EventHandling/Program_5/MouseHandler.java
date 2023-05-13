
import java.awt.event.*;


class MouseHandler extends MouseAdapter
{
	MainFrame fr;
	MouseHandler(MainFrame f)
	{	
		fr =f;
	}
	
	public void mouseClicked(MouseEvent t)
	{
		int dec = t.getButton();
		
		if(dec ==1)
		{
			
			if(fr.val)
			{
				fr.tEnd();
			}
			else
			{
				fr.tStart();
			}
		}
		else
		{
		
			fr.clear();	
		}
		
		
		
	}
}
