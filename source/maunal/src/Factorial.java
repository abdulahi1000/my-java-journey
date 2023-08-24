/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*; 
import java.lang.String; 
import java.awt.event.*; 

/**
 *
 * @author TECH-U LIB 014
 */
public class Factorial extends Applet implements ActionListener  {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
   
    String str; Button b0;
    TextField t1,t2; Label l1;
    @Override
    public void init(){ 
        Panel p=new Panel(); 
        p.setLayout(new GridLayout());
        add(new Label("Enter any Integer value"));
        add(t1=new TextField(20));
        add(new Label("Factorial value is:       "));
        add(t2=new TextField(20)); 
        add(b0=new Button("compute")); 
        b0.addActionListener((ActionListener) this); 
          }
    public void actionPerformed(ActionEvent e){
    int i,n,f=1;
    n=Integer.parseInt(t1.getText());
    for(i=1;i<=n;i++) f=f*i; 
    t2.setText(String.valueOf(f));
    repaint();
    }


    // TODO overwrite start(), stop() and destroy() methods
}
