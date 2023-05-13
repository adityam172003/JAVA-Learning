/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frames;

import Events.WindowEvents;
import GameInfo.MainGame;
import Panels.MainPanels;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lenovo
 */
public final class Dialogs extends Dialog
{
    Panel pnlResult;
    Button btnres,btnexit;
    MainFrame fr;
    boolean resp =true;
    Label lblres;
    
        public Dialogs(MainFrame f,boolean res)
        {
            super(f,true);
            fr= f;
            setSize(400,400);
            setTitle("Result");
            setLocationRelativeTo(null);
            this.setLayout(null);
            
            this.addWindowListener(new WindowEvents());
            this.setpanels(res);
           this.setButtons();
            
            setVisible(true);
            }
        
        
        public void setpanels(boolean res)
        {
            pnlResult  = new MainPanels(0,0,this.getWidth(),this.getHeight(),Color.BLACK);
            this.add(pnlResult);
            //adding labels
            String str = (res)?"Congrats":"Game Over";
            str+="  Number is  "+fr.gam.getFindNum();
            lblres= new Labels.MainLabels(str, 40  , 100, 300, 100);
            lblres.setFont(new Font("Arial",Font.BOLD,20));
            lblres.setForeground(Color.white);
            pnlResult.add(lblres);
        }
        public void setButtons()
        {
            btnres= new Button("Exit");
            btnres.setForeground(Color.white);
            btnres.setBounds(220,280,150,80);
            pnlResult.add(btnres);
            btnexit= new Button("Restart");
            btnexit.setForeground(Color.white);
            btnexit.setBounds(25,280,150,80);
            
            pnlResult.add(btnexit);
            
            btnres.setFont(new Font("Arial",Font.BOLD,30));
            btnexit.setFont(new Font("Arial",Font.BOLD,30));
            
            
            btnres.addActionListener(new DialogAction(this));
            btnexit.addActionListener(new DialogAction(this));
        }
        
       public  static boolean getNotify(MainFrame f,boolean result)
       {
           Dialogs g  = new Dialogs(f,result);
           return g.resp;
       }
           
           
}



class DialogAction implements ActionListener
{
    Dialogs fram;

    public DialogAction(Dialogs g)
    {
        fram= g;
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        Button btn = (Button)ae.getSource();
        if(btn.getActionCommand().equals("Restart"))
        {
            fram.resp=true;
            fram.dispose();
            
            
        }
        else
        {
            fram.resp=false;
            fram.dispose();
        }
    }
    
    
    
}


