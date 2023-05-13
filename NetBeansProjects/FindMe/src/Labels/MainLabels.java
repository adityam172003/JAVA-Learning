/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labels;

import java.awt.*;

/**
 *
 * @author lenovo
 */
public class MainLabels extends Label
{
    String title;
    public MainLabels(String s,int x,int y,int w,int h)
    {
        super(s);
        this.title=s;
      
       this.setBounds(x,y,w,h);
       
        // this.setAlignment(Label.CENTER);
        
        
    }
    public void labelsTitleChange()
    {
        this.setText(this.title);
    }
    
}
