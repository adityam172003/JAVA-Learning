/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listeners;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author lenovo
 */
public class MyWindowListener extends WindowAdapter
{
    @Override
    public void  windowClosing(WindowEvent e)
    {
       Frame fr =  (Frame)e.getSource();
       fr.dispose();
    }
}
