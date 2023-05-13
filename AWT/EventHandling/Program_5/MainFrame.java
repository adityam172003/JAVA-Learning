import java.awt.*;
import java.awt.event.*;


class  MainFrame extends Frame implements Runnable
{
	int sec;
	int min;
	int hr;
	Thread t;
	boolean val=false;
	public MainFrame()
	{
		
		
		sec=0;
		min=0;
		hr =0;
		
		setSize(600,600);
		setTitle("Clock");
		setLocationRelativeTo(null);
		
		// mouse Handler
		
		addMouseListener(new MouseHandler(this));
		
		
		setVisible(true);
		
	
	}
	
	public void paint(Graphics g)
	{
		String s = hr+" : "+min+" : "+sec;
		
		g.setColor(Color.RED);
		g.setFont(new Font("Arial", Font.BOLD,30));
		g.drawString(s,300,300);
	}
	
	
	public void run()
	{
	
		while(val)
		{
			sec++;
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception r)
			{
			
			}
			
			if(sec==60)
			{	
				
				min++;
				if(min==60)
				{
					hr++;
					min=0;
				}
				sec=0;
			}
			
			this.repaint();
			
		}
			
	
	}
	
	void tStart()
	{
		val=true;
		t = new Thread(this);
		t.start();
	}
	
	void tEnd()
	{
		val = (val)?false:true;
	}
	
	void clear()
	{
		min=0;
		sec=0;
		hr =0;
		this.repaint();
	}
}
