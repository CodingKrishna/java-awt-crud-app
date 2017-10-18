package com.jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class Loginform extends JFrame implements ActionListener
{
 JButton SUBMIT;
 JPanel panel;
 JLabel label1,label2;
 final JTextField  text1,text2;
  Loginform()
  {
  label1 = new JLabel();
  label1.setText("Username:");
  text1 = new JTextField(20);

  label2 = new JLabel();
  label2.setText("Password:");
  text2 = new JPasswordField(20);
 
  SUBMIT=new JButton("SUBMIT");
  
  panel=new JPanel(new GridLayout(3,1));
  panel.add(label1);
  panel.add(text1);
  panel.add(label2);
  panel.add(text2);
  panel.add(SUBMIT);
  add(panel,BorderLayout.CENTER);
  SUBMIT.addActionListener(this);
  setTitle("LOGIN FORM");
  }
 public void actionPerformed(ActionEvent ae)
  {
  String value1=text1.getText();
  String value2=text2.getText();
  if (value1.equals("user") && value2.equals("12345")) {
  NextPage page=new NextPage();
  page.setVisible(true);
  JLabel label = new JLabel("Welcome:"+value1);
  page.getContentPane().add(label);
  }
  else{
  System.out.println("enter the valid username and password");
  JOptionPane.showMessageDialog(this,"Incorrect login or password",
  "Error",JOptionPane.ERROR_MESSAGE);
  }
}
}
 class Login
{
  public static void main(String arg[])
  {
  try
  {
  Loginform frame=new Loginform();
  frame.setSize(250,150);
  frame.setVisible(true);
  }
  catch(Exception e)
  {JOptionPane.showMessageDialog(null, e.getMessage());}
  }
}