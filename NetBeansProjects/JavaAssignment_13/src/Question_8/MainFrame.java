/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_8;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author lenovo
 */
public class MainFrame extends Frame
{
   public  MainFrame()
   {
            this.setSize(600,600);
            this.setTitle("Question_8");
            this.setLocationRelativeTo(null);
            this.setLayout(null);
            
            this.addWindowListener(new MyWindowListener(this));
            
            
            
            this.setVisible(true);
   }
}


class MyWindowListener extends WindowAdapter
{
    MainFrame f ;
    public MyWindowListener(MainFrame f)
    {
        this.f = f;
    }
           
    
    @Override
    public void windowClosing(WindowEvent we)
    {
        if(MainDailog.SendDailog(f))
        {
            f.dispose();
        }
        
    }
}
