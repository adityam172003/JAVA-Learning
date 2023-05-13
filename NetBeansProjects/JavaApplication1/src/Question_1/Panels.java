/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_1;

import java.awt.Color;
import java.awt.Panel;

/**
 *
 * @author lenovo
 */
public class Panels extends Panel
{
    public Panels()
    {
        this.setLayout(null);
    }
    
    public Panels(int x,int y,int w,int h,Color r)
    {
        this.setLayout(null);
        this.setBounds(x,y,w,h);
          this.setBackground(r);
        
    }
    
  
    
    
}
