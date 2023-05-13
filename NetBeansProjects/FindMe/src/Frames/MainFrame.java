/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frames;

import Events.WindowEvents;
import GameInfo.MainGame;
import Labels.MainLabels;
import Panels.MainPanels;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lenovo
 */
public class MainFrame extends Frame
{

    MainGame gam;
    
    Panel pnlTitle;
    Panel pnlInput;
    Panel pnlButton;

    Label lblTitle;
    Label lblChance;
    Label lblTxtChance;
    Label Number;
    Label startG;

    TextField txtInput;

    Button btnStart;
    Button btnCheck;

    int width;
    String notice="Start the game";
    public MainFrame()
    {
       
        gam = null;
        width = -20;
        this.setSize(800, 800);
        this.setTitle("FindMe");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        this.addPanels();
        this.addLabels();
        this.addInputs();
        this.addBtn();

        // adding window closing event 
        this.addWindowListener(new WindowEvents());

        this.setVisible(true);

    }

    private void addPanels()
    {
        pnlTitle = new MainPanels(0, 0, this.getWidth(), 200, Color.black);
        this.add(pnlTitle);

        pnlInput = new MainPanels(0, 200, this.getWidth() / 2, 400, new Color(200, 0, 0));
        this.add(pnlInput);

        pnlButton = new MainPanels(this.getWidth() / 2, 200, this.getWidth() / 2, 400, new Color(255, 50, 50));
        this.add(pnlButton);

        //pnlLevel = new MainPanels(0, 600,this.getWidth() ,200,new Color(0,0,0));
        //this.add(pnlLevel);
    }

    private void addLabels()
    {
        width = 0;

        lblTitle = new MainLabels("Find Me", 300, 80, 400, 50);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 50));
        lblTitle.setForeground(Color.WHITE);
        pnlTitle.add(lblTitle);

        lblChance = new MainLabels("0", 160, 250, 100, 50);
        lblChance.setFont(new Font("Arial", Font.BOLD, 30));
        lblChance.setForeground(Color.BLACK);
        pnlInput.add(lblChance);

        lblTxtChance = new MainLabels("Your Chances", 80, 300, 250, 50);
        lblTxtChance.setFont(new Font("Arial", Font.BOLD, 30));
        lblTxtChance.setForeground(Color.BLACK);
        pnlInput.add(lblTxtChance);

        Number = new MainLabels("Enter Number", 80, 150, 240, 50);
        Number.setFont(new Font("Arial", Font.BOLD, 30));
        Number.setForeground(Color.BLACK);
        pnlInput.add(Number);
        
        
        startG  = new MainLabels(notice,50,630,500,50);
        startG.setForeground(Color.WHITE);
        startG.setFont(new Font("Arial", Font.BOLD, 30));
        this.add(startG);
    }

    private void addInputs()
    {
        txtInput = new TextField();
        txtInput.setBounds(150, 80, 100, 50);
        txtInput.setFont(new Font("Arial", Font.BOLD, 30));
        txtInput.setEnabled(false);
        pnlInput.add(txtInput);
    }

    private void addBtn()
    {
        btnStart = new Button("Start");
        btnStart.setBounds(140, 100, 150, 80);
        btnStart.setForeground(Color.WHITE);
        btnStart.setFont(new Font("Arial", Font.BOLD, 30));
        btnStart.setBackground(Color.BLACK);
        pnlButton.add(btnStart);

        btnStart.addActionListener(new MyActionListener(this));

        btnCheck = new Button("Check");
        btnCheck.setBounds(140, 200, 150, 80);
        btnCheck.setForeground(Color.WHITE);
        btnCheck.setFont(new Font("Arial", Font.BOLD, 30));
        btnCheck.setBackground(Color.BLACK);
        pnlButton.add(btnCheck);
        btnCheck.addActionListener(new MyActionListener(this));
    }

    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        
        for(int i =0;i<20;i++)
        {
             g.drawLine(400, 690+i, 400 + width * 3, 690);
        }
    }

}

class MyActionListener implements ActionListener
{

    MainFrame fr;
    
    public MyActionListener(MainFrame f)
    {
        fr = f;
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        Button btn = (Button) ae.getSource();
        if (btn.getActionCommand().equals("Check"))
        {
            int diff =0;
            try
            {
                   diff = fr.gam.getDiff(Integer.parseInt(fr.txtInput.getText()));
            }
            catch(NumberFormatException e)
            {
                if(fr.gam==null)
                {
                    
                 fr.startG.setText("Please start");
                }
                else
                {
                     fr.startG.setText("Please enter number");
                }
                 return;
            }
         

            if (diff == 0)
            {
                fr.width = diff;
                fr.repaint();
                fr.lblTitle.setText("Congrats");
                fr.lblTxtChance.setText("Number is " + fr.gam.getFindNum());
                fr.txtInput.setEnabled(false);
               boolean resp= Dialogs.getNotify(fr,true);
                if(resp)
                {
                    fr.gam = new MainGame();
                   fr.startG.setText("Game started");
                    fr.lblTitle.setText("Find Me");
                    fr.lblTxtChance.setText("Your Chances");
                    fr.lblChance.setText("" + fr.gam.chance);
                    fr.txtInput.setEnabled(true);
                    fr.txtInput.setText("");
                }
                else
                {
                    fr.dispose();
                }
            }

            else
            {

                if (fr.gam.chance <= 0)
                {
                    
                    fr.lblChance.setText("Over");

                     boolean res = Dialogs.getNotify(fr, false);
                     if(res)
                     {
                            fr.gam = new MainGame();
                            fr.startG.setText("Game started");
                            fr.lblTitle.setText("Find Me");
                            fr.lblTxtChance.setText("Your Chances");
                            fr.lblChance.setText("" + fr.gam.chance);
                            fr.txtInput.setEnabled(true);
                            fr.txtInput.setText("");
                            fr.width=0;
                            fr.repaint();
                     }
                     else
                     {
                         fr.dispose();
                     }
                }
                else
                {
                    fr.gam.chance--;
                    fr.lblChance.setText(" " + fr.gam.chance);
                    if (diff < 0)
                    {
                        diff -= 10;
                    }
                    else
                    {
                        diff += 10;
                    }
                    fr.width = diff;
                    fr.repaint();
                }

            }
        }
        else
        {
            fr.gam = new MainGame();
            fr.startG.setText("Game started");
            fr.lblTitle.setText("Find Me");
            fr.lblTxtChance.setText("Your Chances");
            fr.lblChance.setText("" + fr.gam.chance);
            fr.txtInput.setEnabled(true);
            fr.txtInput.setText("");
            fr.width=0;
            fr.repaint();
        }
    }
}
