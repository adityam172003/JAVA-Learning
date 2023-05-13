/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_3;

import java.awt.Choice;
import java.awt.List;
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
         List lst=null;
         Choice ch;
         String st="";
         
            try
            {
                 lst = (List)ie.getSource();
                 frame.stra = lst.getSelectedItems();
                
                
               
            }
            catch(Exception e)
            {
               ch = (Choice)ie.getSource();
              frame.str= String.valueOf(ie.getItem());
            }
            for(String i :frame.stra)
                {
                    st+=" "+i;
                }
            st+=" "+frame.str;
            frame.lbl.setText(st);
    }
    
}
