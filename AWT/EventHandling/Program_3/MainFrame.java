
import java.awt.*;
import java.awt.event.*;


class MainFrame extends Frame
{
	public Point p;
	
	MainFrame()
	{
		p=new Point();
		setSize(800,800);
		setTitle("Show Co-ordinates");
		setLocationRelativeTo(null);
		
		// handling window event 
		
		addWindowListener(new WindowHandler());
		
		// handling mouse Event
		
		addMouseListener(new MouseHandler(this));
		
		
		
		setVisible(true);
	}
	
	
	public void paint(Graphics g)
	{
	
		g.setColor(Color.red);
		
		g.setFont(new Font("Arial",Font.BOLD,30));
		
		//g.drawString("("+p.x+","+p.y+")",200,200);
		g.drawString("("+p.x+","+p.y+")",p.x,p.y);
	}
}
