/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_3;

/**
 *
 * @author lenovo
 */



import Design_4.MainFrameRectangle;
import java.awt.Dialog;

import java.awt.Label;

import java.awt.*;



public class MainDailog extends Dialog implements Runnable
{
    Label lbl;
    Panel pnl;
    public MainDailog(MainFrameRectangle f)
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
                this.setSize(500,300);
                this.setLocationRelativeTo(null);
                this.setTitle("Error message");
               
                pnl = new Panel();
                pnl.setBounds(0,0,this.getWidth(),this.getHeight());
                 pnl.setBackground(Color.black);
                 this.setLayout(null);
                 this.add(pnl);
                 
                 lbl = new Label("Please enter the Valid number");
                 lbl.setForeground(Color.red);
                 this.setFont(new Font("Arial",Font.BOLD,20));
                 lbl.setBounds(50,140,400,50);
                 pnl.setLayout(null);
                 pnl.add(lbl);
                
                this.setVisible(true);
    }
        
    
}
