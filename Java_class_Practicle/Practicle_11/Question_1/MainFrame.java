import java.awt.*;

class MainFrame extends Frame
{
	MainFrame()
	{
		setSize(600,600);
		setTitle("Perpendicular Lines");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.setFont(new Font("Arial",Font.BOLD,30));
		g.drawLine(150,300,450,300);
		g.drawLine(150,0,150,300);
	}
}
