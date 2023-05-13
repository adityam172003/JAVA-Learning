/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author lenovo
 */
public class MainFrame extends Frame
{

    Choice chmonths;
    List lstWeek;

    Label lbl;

    Panel pnltitle;
    Panel pnlweeks;
    Panel pnlMonths;
   String stra[];
    String str="";
    
    Label title;
    public MainFrame()
    {
        stra=null;
        this.setSize(600, 600);
        this.setTitle("Question_3");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        MainFrame f = this;

        // add window Listener
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f.dispose();
            }
        });

        // adding panels 
        pnltitle = new Panel();
        pnltitle.setBounds(0, 0, this.getWidth(), 200);
        pnltitle.setBackground(Color.DARK_GRAY);
        pnltitle.setLayout(null);
        this.add(pnltitle);
        
        lbl = new Label();
        lbl.setBounds(5,50,590,50);
        lbl.setFont(new Font("Arial",Font.BOLD,20));
        lbl.setForeground(Color.white);
        pnltitle.add(lbl);
        

        pnlweeks = new Panel();
        pnlweeks.setBounds(0, 200, this.getWidth() / 2, 400);
        pnlweeks.setBackground(Color.lightGray);
        pnlweeks.setLayout(null);
        this.add(pnlweeks);

        pnlMonths = new Panel();
        pnlMonths.setBounds(300, 200, this.getWidth() / 2, 400);
        pnlMonths.setBackground(Color.LIGHT_GRAY);
        pnlMonths.setLayout(null);
        this.add(pnlMonths);

        this.addLists();
        this.addChoice();

        this.setVisible(true);
    }

    private void addLists()
    {
        lstWeek = new List(7,true);
        lstWeek.add("Sunday");
        lstWeek.add("Monday");
        lstWeek.add("Tuesday");
        lstWeek.add("Wednesday");
        lstWeek.add("Thursday");
        lstWeek.add("Friday");
        lstWeek.add("Saturday");
        lstWeek.setFont(new Font("Arial", Font.BOLD, 20));
        lstWeek.setBounds(20, 50, 230, 210);
        pnlweeks.add(lstWeek);
        lstWeek.addItemListener(new ItemListeners(this));
    }

    private void addChoice()
    {
        chmonths = new Choice();
        chmonths.setBounds(20, 50, 200, 50);
        chmonths.setBackground(Color.gray);
        chmonths.setFont(new Font("Arial", Font.BOLD, 20));

        chmonths.add("Januray");
        chmonths.add("February");
        chmonths.add("March");
        chmonths.add("April");
        chmonths.add("May");
        chmonths.add("Jun");
        chmonths.addItemListener(new ItemListeners(this));
        pnlMonths.add(chmonths);
    }

}
