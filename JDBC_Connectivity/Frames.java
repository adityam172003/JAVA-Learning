
import javax.swing.*;


class MainFrame extends JFrame
{

	public MainFrame()
	{
			setTitle("Main frame");
			setSize(400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//  button // label 
			
			 JPanel panel = new JPanel();
			// Create a JButton
			JButton button = new JButton("Click Me");
			JButton button1 = new JButton("Click Me");
			// Add an action listener to the button
			button.addActionListener(e -> {
			    // Handle button click event here
			    System.out.println("Button clicked!");
			});
			
			// Add the button to the panel
			panel.add(button);
			panel.add(button1);
		
			// Add the panel to the frame
			getContentPane().add(panel);

			this.setVisible(true);
			
	
	}
	
	
	public static void main(String [] args)
	{
	
	 MainFrame f  = new MainFrame();
	
	}

}
