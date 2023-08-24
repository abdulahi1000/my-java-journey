/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.applet.*;
import java.awt.*;

/**
 *
 * @author TECH-U LIB 014
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
      
        // TODO start asynchronous download of heavy resources
    }
  

    public void paint(Graphics g){
    g.drawString("Hello Java",50,100);
  }


    // TODO overwrite start(), stop() and destroy() methods
}
