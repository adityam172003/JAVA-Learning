/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_1;
import Listeners.MyWindowListener;
import java.awt.*;
import java.awt.event.WindowAdapter;

/**
 *
 * @author lenovo
 */
public class MainFrame extends Frame
{
    Panels pnl1,pnl2,pnl3;
    Labels lbl1,lbl2,lbl3;
    Buttons btn2,btn3;
    
    public MainFrame()
    {
        setSize(800,500);
        setTitle("MainFrame");
        setLocationRelativeTo(null);
       
        this.addWindowListener(new MyWindowListener());
        this.setLayout(null);
        setVisible(true);
        
        // adding panels
        
        // adding panel 1
        pnl1 = new Panels(10,50,780,200,Color.black);
       
        this.add(pnl1);
       
        // adding labels in panel 1 
        lbl1 = new Labels("Mathematics",300,25,220,100);
        lbl1.setAlignment(Label.CENTER);
        lbl1.setFonts(new Font("Arial",Font.BOLD,30),Color.WHITE);
        pnl1.add(lbl1);
        
       // adding panel  2  
       
        pnl2 = new Panels(10,270,380,250,Color.BLACK);
        this.add(pnl2);
        
        btn2 = new Buttons("Addition",110,90,150,50);
        btn2.setFont(new Font("Arial",Font.BOLD,20));
        btn2.setForeground(Color.white);
        pnl2.add(btn2);
        
        // adding panel 3 
        pnl3 = new Panels(410,270,380,250,Color.black);
        this.add(pnl3);
        
        // adding label
         btn3 = new Buttons("Subtraction",110,90,150,50);
        btn3.setFont(new Font("Arial",Font.BOLD,20));
        btn3.setForeground(Color.white);
        pnl3.add(btn3);
       
        
         
         
    }
}
