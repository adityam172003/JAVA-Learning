/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_6;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author lenovo
 */
public class MainFrame extends Frame
{
        Panel pnl;
        TextField txtalfa;
        TextField txtNum;
        Label lblDigit;
        Label lblAlpha;
        
        public MainFrame()
        {
            this.setSize(600,600);
            this.setTitle("Question_6");
            this.setLocationRelativeTo(null);
            this.setLayout(null);
            
            
            pnl =new Panel();
            pnl.setBounds(0,0,this.getWidth(),this.getHeight());
            pnl.setBackground(Color.black);
            pnl.setLayout(null);
            this.add(pnl);
            
            
            MainFrame f = this;
            // window closing event  
            
            this.addWindowListener(new WindowAdapter()
            {
                    public void windowClosing(WindowEvent we)
                    {
                        f.dispose();
                    }
                            
            });
            lblAlpha = new Label("Enter Alphabate");
            lblAlpha.setFont(new Font("Arial",Font.BOLD,20));
            lblAlpha.setBounds(350,200,200,50);
            lblAlpha.setForeground(Color.WHITE);
            pnl.add(lblAlpha);
            
             lblDigit = new Label("Enter Dight");
            lblDigit.setFont(new Font("Arial",Font.BOLD,20));
            lblDigit.setBounds(50,200,200,50);
            lblDigit.setForeground(Color.WHITE);
            pnl.add(lblDigit);
            
            // adding text fields 
            
            txtNum= new TextField();
      
            txtNum.setBounds(50,275,200,50);
            txtNum.setFont(new Font("Arial",Font.BOLD,20));
            txtNum.setForeground(Color.BLACK);
            pnl.add(txtNum);
            txtNum.addKeyListener(new MyKeyListener(this));
            
            
            txtalfa= new TextField();
            txtalfa.setBounds(350,275,200,50);
            txtalfa.setFont(new Font("Arial",Font.BOLD,20));
            txtalfa.setForeground(Color.BLACK);
            pnl.add(txtalfa);
               
            txtalfa.addKeyListener(new MyKeyListener(this));
             this.setVisible(true);
        }
}



class MyKeyListener implements KeyListener
{
    
    MainFrame frame;
    
    public MyKeyListener(MainFrame f)
    {
        frame = f;
    }
 
    
    @Override
    public void keyTyped(KeyEvent ke)
    {
        TextField txt = (TextField)ke.getSource();
        if(txt==frame.txtNum && Character.isAlphabetic(ke.getKeyChar()))
        {
            ke.consume();
        }
          if(txt==frame.txtalfa && Character.isDigit(ke.getKeyChar()))
        {
            ke.consume();
        }
        
        
                
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
    }
    
}