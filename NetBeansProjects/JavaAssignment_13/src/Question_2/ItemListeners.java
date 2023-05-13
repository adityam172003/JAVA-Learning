/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_2;

import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author lenovo
 */
public class ItemListeners implements ItemListener
{
    MainFrame frame;
    
    public ItemListeners(MainFrame fr)
    {
        frame =fr;
    }

    @Override
    public void itemStateChanged(ItemEvent ie)
    {
        Checkbox chk = (Checkbox)ie.getSource();
        
        int index = frame.str.indexOf(String.valueOf(ie.getItem()));
        System.out.println(index);
        
        if(index==-1)
        {
         frame.str +=" "+String.valueOf(ie.getItem());
        frame.lbl.setText(frame.str);
        }
        else
        {
         frame.str= frame.str.replace(String.valueOf(ie.getItem()),"");
         frame.str=  frame.str.trim();
        frame.lbl.setText(frame.str);
        }
       
    }
    
}
