/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author lenovo
 */
public class MainFrame extends Frame
{
    
    Checkbox chkwin ;
    Checkbox chkmac;
    Checkbox chklin;
    
    Panel pnl;
    String str="";
   Label lbl;
   
    
    public MainFrame()
    {
        
        this.setSize(600,600);
        this.setTitle("Question_2");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        // windowClosing event 
        MainFrame fr = this;
        this.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent we)
            {
                    fr.dispose();
            }
                    
        });
        
        
        pnl  = new Panel();
        pnl.setLayout(null);
        pnl.setBounds(0,0,this.getWidth(),this.getHeight());
        pnl.setBackground(Color.CYAN);
        this.add(pnl);
        
        // adding label 
        lbl = new Label();
        lbl.setText(str);
        lbl.setBounds(50,100,400,50);
        lbl.setFont(new Font("Arial",Font.BOLD,30));
        pnl.add(lbl);
        
        this.addCheckboxes();
        this.setVisible(true);
    }
    
    
    private void addCheckboxes()
    {
        chklin     = new Checkbox("Linux");
        chklin.setFont(new Font("Arial",Font.BOLD,20));
        chklin.setBounds(100,250,200,50);
        pnl.add(chklin);
        chklin.addItemListener(new ItemListeners(this));
        
        chkmac  = new Checkbox("Mac");
        chkmac.setFont(new Font("Arial",Font.BOLD,20));
        chkmac.setBounds(100,350,200,50);
        pnl.add(chkmac);
        chkmac.addItemListener(new ItemListeners(this));
        
        
        
       chkwin   = new Checkbox("Window");   
       chkwin.setFont(new Font("Arial",Font.BOLD,20));
       chkwin.setBounds(100,450,200,50);
       pnl.add(chkwin);
       chkwin.addItemListener(new ItemListeners(this));
       
       
    }
    
}
