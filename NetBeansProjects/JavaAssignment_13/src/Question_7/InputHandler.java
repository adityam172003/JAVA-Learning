/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_7;

import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author lenovo
 */
public class InputHandler extends KeyAdapter
{
    MainFrame frame;
        
   public InputHandler(MainFrame f)
   {
       frame =f;
   }
   
    @Override
   public void keyTyped(KeyEvent ke)
   {
       TextField txt = (TextField)ke.getSource();
       
       if(txt ==frame.txtFirstName)
       {
         if(Character.isDigit(ke.getKeyChar()))
         {
             ke.consume();
         }
         else
         {
              if(!Character.isSpaceChar(ke.getKeyChar()))
              {
                  frame.FirstName+=ke.getKeyChar();
              }
         }
       }
       else if(txt ==frame.txtLaseName)
       {
            if(Character.isDigit(ke.getKeyChar()))
            {
                ke.consume();
            }
            else
            {
                if(!Character.isSpaceChar(ke.getKeyChar()))
                {
                     frame.LastName+=ke.getKeyChar();
                }
            }
       }
       else
       {
             if(Character.isAlphabetic(ke.getKeyChar()) )
            {
                ke.consume();
            }
             
            else
            {
                if(frame.PhoneNumber.length()>12)
                {
                    frame.lblTitle.setText("PhoneNumber should be less than 12");
                    frame.txtPhoneNumber.setText("");
                    frame.PhoneNumber="";
                }else
                {
                    frame.PhoneNumber+=ke.getKeyChar();
                }
                  
            }
       }
   }
}
