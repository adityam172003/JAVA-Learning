/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lenovo
 */
public class SubmitHandler implements ActionListener,Runnable
{
    MainFrame f;
    Thread t ;
    SubmitHandler ref;
    public SubmitHandler( MainFrame f)
    {
        this.f = f;
        ref  = this;
        t= new Thread(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
      if(t.getState() ==Thread.State.NEW)
      {
          t.start();
      }
      else
      {
          t = new Thread(ref);
          t.start();
          
      }
    }

    @Override
    public void run()
    {
       try
       {
           Handle();
       }
       catch(InterruptedException ae)
       {
           System.out.println("Exception Generated");
       }
    }
    
    public void Handle() throws InterruptedException
    {
        
        if(f.txtFirstName.getText().length()==0)
        {
            f.txtFirstName.requestFocus();
            f.lblTitle.setText("Please Enter First Neme");
            t.sleep(5000);
            f.lblTitle.setText("Name and Phone number");
        }
        else if(f.txtLaseName.getText().length()==0)
        {
            f.txtLaseName.requestFocus();
            f.lblTitle.setText("Please Enter Last Neme");
            t.sleep(5000);
            f.lblTitle.setText("Name and Phone number");
        }
        else if(f.txtPhoneNumber.getText().length()==0)
        {
           f.txtPhoneNumber.requestFocus();
           f.lblTitle.setText("Please Enter Phone Number");
           t.sleep(5000);
            f.lblTitle.setText("Name and Phone number");
        }
        else
        {
            f.lblTitle.setText(f.txtFirstName.getText()+ " "+f.txtLaseName.getText()+ " "+f.txtPhoneNumber.getText());
        }
    }
}
