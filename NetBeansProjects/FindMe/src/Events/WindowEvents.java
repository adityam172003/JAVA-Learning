/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Events;

import Frames.MainFrame;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author lenovo
 */
public class WindowEvents  extends WindowAdapter
{
    public void windowClosing(WindowEvent  we)
    {
        try
        {
             Frame  fr = (Frame)we.getSource();
             fr.dispose();
        }
        catch(Exception e)
        {
            Dialog g = (Dialog)we.getSource();
            g.dispose();
        }
        
    }
    
}
