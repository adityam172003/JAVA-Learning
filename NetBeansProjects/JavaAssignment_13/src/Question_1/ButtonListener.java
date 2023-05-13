/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_1;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lenovo
 */
public class ButtonListener implements ActionListener
{   MainFrame frame;
    public ButtonListener(MainFrame ref)
    {
        frame = ref;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        Button btn = (Button)ae.getSource();
        
        if(btn.getActionCommand().equals("RED"))
        {
            frame.pnl.setBackground(Color.red);
        }
        else if(btn.getActionCommand().equals("GREEN"))
        {
            frame.pnl.setBackground(Color.GREEN);
        }
    }
    
}

 class ButtonListener2 implements ActionListener
{   MainFrame frame;
    public ButtonListener2(MainFrame ref)
    {
        frame = ref;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        Button btn = (Button)ae.getSource();
        
        if(frame.btnyellow==btn)
        {
            frame.pnl.setBackground(Color.yellow);
        }
        else if(frame.btnblue == btn)
        {
            frame.pnl.setBackground(Color.BLUE);
        }
    }
    
}
