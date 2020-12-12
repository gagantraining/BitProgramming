/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiprogramming;

import java.awt.Frame;

public class OurFirstGUI {
    
    public OurFirstGUI(){
        Frame f = new Frame("My Frame");
        
        f.setSize(300,500);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
        new OurFirstGUI();
    }
}
