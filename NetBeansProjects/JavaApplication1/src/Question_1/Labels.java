/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_1;

import java.awt.Font;
import java.awt.*;

/**
 *
 * @author lenovo
 */
public class Labels extends Label
{
    String title;
    
    public Labels(String title,int x,int y,int w,int h)
    {
        super(title);
         this.title = title;
         
         this.setBounds(x,y,w,h);
         
 
    }
    
    public void setFonts(Font f,Color r)
    {
        
        this.setFont(f);
       this.setForeground(r);
    }
    
    
        
    
}
