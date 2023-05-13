import java.awt.*;


class MainFrame extends Frame
{
	public String  heading;
	

	MainFrame()
	{
		heading ="Change it on click";
		setSize(800,800);
		setTitle("MouseClick event");
		setLocationRelativeTo(null);
		
		// handling window event
		
		addWindowListener(new WindowEventHandler());
		
		// handling mouse event 
		
		addMouseListener(new MouseEventHandler(this));
		
		
		
		
		setVisible(true);
	}
	
	
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		
		g.setFont(new Font("Arial",Font.BOLD,30));
		
		g.drawString(heading,400,400);
		
	}
	
	
}
