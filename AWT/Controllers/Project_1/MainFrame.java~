import java.awt.*;

import java.awt.event.*;

class MainFrame extends Frame implements Runnable
{
	int c=0;
	Panel p1;
	Panel p2;
	Label l1,l2;
	int x1,y1,x2,y2;
	
	Thread t ;
	
	
	public void Tstart()
	{
		t.start();
	}
       public MainFrame()
	{
		t= new Thread(this);
		this.setSize(600,700);
		this.setTitle("ADDING CONTROLLERS");
		this.setLocationRelativeTo(null);
		Frame close  = this;
		p2 = new Panel();
		p1 = new Panel();
		this.setLayout(null);
		// window closing event handling
		x1 = 10;
		y1 = 50;
		
		x2 = 10;
		y2 = 460;
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				MainFrame.this.dispose();
			}	
		});
		
		// mouse click event listener
		
		this.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
			   MainFrame f=(MainFrame)e.getSource();
			  if(f.t.getState()==Thread.State.NEW)
			  {
			  	 f.Tstart();
			  }
			  
			}	
		});
		
		
		
		
		this.setVisible(true);
		
		
		
		
	}
	
	public void addPanels()
	{
		// adding panel p1 
		 	
		
		
		
		// to remove default design
		
		
		p1.setBounds(x1,y1,this.getWidth()-20,300);
		p1.setBackground(Color.RED);
		this.add(p1);
		
		// addding panel p2;
		
		
		p2.setBounds(x2,y2,this.getWidth()-20,300);
		p2.setBackground(Color.blue);
		this.add(p2);
		
		// adding label 1
		l1  = new Label("First panel");
		p1.setLayout(null);
		l1.setBounds(10,10,300,50);
		l1.setFont(new Font("Arial",Font.BOLD,30));
		p1.add(l1);
		
		
		// adding label 2
		
		l2 = new Label("Second panel");
		p2.setLayout(null);
		l2.setBounds(10,10,300,50);
		l2.setFont(new Font("Arial",Font.BOLD,30));
		p2.add(l2);
		
	}
	
	public void run()
	{
		while(true)
		{
			if(x1>1000)
			{
				x1=-310;
				
			}
			if(x2>1000)
			{
		         	x2 = -310;
			}
			try
			{
				Thread.sleep(50);
			}
			catch(Exception w)
			{

			}
			x1++;
			x2++;
			System.out.println("--");
			this.addPanels();
			
		}
	}
	
	
	
	
}
