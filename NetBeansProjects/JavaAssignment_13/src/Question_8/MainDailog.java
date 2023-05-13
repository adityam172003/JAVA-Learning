/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author lenovo
 */
public class MainDailog  extends Dialog
{
    Panel pnl ;
    Button btnexit,btnResume;
    boolean status;
           public MainDailog(MainFrame f)
           {
                super(f,true);
                status =true;
                this.setSize(300,300);
                this.setTitle("Question_8");
                this.setLocationRelativeTo(null);
                this.setLayout(null);
                
                pnl  = new Panel();
                pnl.setBackground(Color.black);
                pnl.setBounds(0,0,this.getWidth(),this.getHeight());
               pnl.setLayout(null);
                this.add(pnl);
                
                btnexit = new Button("Exit");
                btnexit.setBounds(25,125,100,50);
                btnexit.setFont(new Font("Arial",Font.PLAIN,20));
                btnexit.setForeground(Color.white);
                pnl.add(btnexit);
                btnexit.addActionListener(new MyActionListener(this));
                        
                        
                btnResume = new Button("Resume");
                btnResume.setBounds(175,125,100,50);
                btnResume.setFont(new Font("Arial",Font.PLAIN,20));
                btnResume.setForeground(Color.white);
                pnl.add(btnResume);
                btnResume.addActionListener(new MyActionListener(this));
                
                
             this.setVisible(true);
           }
    
           
         public static  boolean SendDailog(MainFrame f)
           {
               MainDailog m = new MainDailog(f);
               return m.status;
           }
}



class MyActionListener implements ActionListener
{
        MainDailog d;
        
        public MyActionListener(MainDailog d)
        {
            this.d = d;
        }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getActionCommand().equals("Exit"))
        {   
            d.status=true;
            d.dispose();
        }
        else
        {
            d.status=false;
            d.dispose();
        }
    }
    
}