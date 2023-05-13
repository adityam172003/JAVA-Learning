/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_5;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */

public class MainFrame extends Frame
{
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
                System.out.println("Do you Want to Shut Down ??");
                Scanner sc = new Scanner(System.in);
                
                String s = sc.next();
                if(s.equals("Yes"))
                {
                     fr.dispose();
                }
                else
                {
                   
                }
                   
            }
                    
        });
        
        this.setVisible(true);
    }
}
