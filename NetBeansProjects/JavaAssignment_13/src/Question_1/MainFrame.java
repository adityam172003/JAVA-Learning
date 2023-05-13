/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author lenovo
 */
public class MainFrame extends Frame
{
    Panel pnl;
    Button btnred,btngreen,btnblue,btnyellow;
    
    public MainFrame()
    {
        this.setSize(600,600);
        this.setTitle("Question_1");
        this.setLocationRelativeTo(null);
        
        
        // adding panels 
        pnl = new Panel();
        pnl.setBounds(0,0,this.getWidth(),this.getHeight());
        pnl.setBackground(Color.red);
        pnl.setLayout(null);
        this.add(pnl);
        MainFrame frame = this;
        this.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent we)
            {
                frame.dispose();
            }
        });
        
        this.addButtons();
        
        this.setVisible(true);
    }
    
    
    private void addButtons()
    {
       btnred = new Button("RED");
       btnred.setBounds(200,100,200,50);
       btnred.setFont(new Font("Arial",Font.BOLD,30));
       btnred.setBackground(Color.red);
       pnl.add(btnred);
       btnred.addActionListener(new ButtonListener(this));
       
       btngreen = new Button("GREEN");
       btngreen.setBounds(200,200,200,50);
       btngreen.setFont(new Font("Arial",Font.BOLD,30));
       btngreen.setBackground(Color.green);
       pnl.add(btngreen);
       btngreen.addActionListener(new ButtonListener(this));
       
       btnblue = new Button("BLUE");
       btnblue.setBounds(200,300,200,50);
       btnblue.setFont(new Font("Arial",Font.BOLD,30));
       btnblue.setBackground(Color.blue);
       pnl.add(btnblue);
       btnblue.addActionListener(new ButtonListener2(this));
       
       
       btnyellow= new Button("YELLOW");
       btnyellow.setBounds(200,400,200,50);
       btnyellow.setFont(new Font("Arial",Font.BOLD,30));
       btnyellow.setBackground(Color.yellow);
       pnl.add(btnyellow);
       btnyellow.addActionListener(new ButtonListener2(this));
       
       
       
    }
       
}



