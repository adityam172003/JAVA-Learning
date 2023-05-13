/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author lenovo
 */
public class MainFrame extends Frame
{
    TextField txtFirstName,txtLaseName,txtPhoneNumber;
    
    Panel pnlTitle,pnlBody;
    
    Label lblFirstName,lblLaseName,lblTitle,lblPhone;
    
    Button btnSubmit;
    
    String FirstName,LastName,PhoneNumber;
    
    public MainFrame()
    {
            FirstName = "";
            LastName = "";
            PhoneNumber="";
                    
            this.setSize(600,600);
            this.setTitle("Question_6");
            this.setLocationRelativeTo(null);
            this.setLayout(null);
           MainFrame f = this; 
            
                        
            this.addWindowListener(new WindowAdapter()
            {
                    public void windowClosing(WindowEvent we)
                    {
                        f.dispose();
                    }
                            
            });
            this.setVisible(true);
            
            
            
            // add title panel 
            
            pnlTitle = new Panel();
            pnlTitle.setLayout(null);
            pnlTitle.setBounds(0,0,this.getWidth(),200);
            pnlTitle.setBackground(Color.DARK_GRAY);
            this.add(pnlTitle);
            
            
            pnlBody = new Panel();
            pnlBody.setLayout(null);
            pnlBody.setBounds(0,200,this.getWidth(),400);
            pnlBody.setBackground(Color.LIGHT_GRAY);
            this.add(pnlBody);
                 
           lblTitle = new Label("Name and Phone number");
           lblTitle.setBounds(50,100,500,50);
           lblTitle.setFont(new Font("Arial",Font.BOLD,20));
           lblTitle.setForeground(Color.WHITE);
           pnlTitle.add(lblTitle);
            
           lblFirstName = new Label("First Name");
           lblFirstName.setFont(new Font("Arial",Font.BOLD,20));
           lblFirstName.setBounds(20,100,200,50);
           pnlBody.add(lblFirstName);
           
           
           
            txtFirstName = new TextField();
            txtFirstName.setBounds(20,150,200,50);
            txtFirstName.setFont(new Font("Arial",Font.BOLD,20));
            pnlBody.add(txtFirstName);
            txtFirstName.addKeyListener(new InputHandler(this));
            
           lblLaseName = new Label("Last Name");
           lblLaseName.setFont(new Font("Arial",Font.BOLD,20));
           lblLaseName.setBounds(300,100,200,50);
           pnlBody.add(lblLaseName);
           
           
           
            txtLaseName= new TextField();
            txtLaseName.setBounds(300,150,200,50);
            txtLaseName.setFont(new Font("Arial",Font.BOLD,20));
            pnlBody.add(txtLaseName);
              txtLaseName.addKeyListener(new InputHandler(this));
            
            lblPhone = new Label("Enter Phone Number");
           lblPhone.setFont(new Font("Arial",Font.BOLD,20));
           lblPhone.setBounds(20,250,250,50);
           pnlBody.add(lblPhone);
            
            txtPhoneNumber = new TextField();
            txtPhoneNumber.setBounds(20,300,200,50);
            txtPhoneNumber.setFont(new Font("Arial",Font.BOLD,20));
            pnlBody.add(txtPhoneNumber);
             txtPhoneNumber.addKeyListener(new InputHandler(this));
            
            btnSubmit = new Button("Submit");
            btnSubmit.setBounds(400,250,100,50);
            btnSubmit.setBackground(Color.red);
            btnSubmit.setFont(new Font("Arial",Font.BOLD,20));
                    
            pnlBody.add(btnSubmit);
            btnSubmit.addActionListener(new SubmitHandler(this));
    }
      
    
    
}



