/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_1;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.*;
/**
 *
 * @author lenovo
 */
public class MainDialog extends Dialog      implements Runnable
{
    Label lbl;
    Panel pnl;
    public MainDialog(MainFrame f)
    {
                super(f);
                
    }
    public void run()
    {
        addComp();
        try
        {
            Thread.sleep(2000);
            this.dispose();
        }catch(Exception e)
        {
            
        }
    }
        
    
    
    
    public void addComp()
    {
                this.setSize(400,300);
                this.setLocationRelativeTo(null);
                this.setTitle("Error message");
               
                pnl = new Panel();
                pnl.setBounds(0,0,this.getWidth(),this.getHeight());
                 pnl.setBackground(Color.black);
                 this.setLayout(null);
                 this.add(pnl);
                 
                 lbl = new Label("Please enter the number");
                 lbl.setForeground(Color.red);
                 this.setFont(new Font("Arial",Font.BOLD,20));
                 lbl.setBounds(50,140,300,50);
                 pnl.setLayout(null);
                 pnl.add(lbl);
                
                this.setVisible(true);
    }
        
    
}
