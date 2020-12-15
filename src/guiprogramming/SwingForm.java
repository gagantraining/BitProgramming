/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiprogramming;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingForm {
    public SwingForm(){
        JFrame f = new JFrame("My Form");
        
        JButton but = new JButton("Click Me");
        but.setBounds(10, 10, 100, 50);
        
        f.add(but);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new SwingForm();
    }
}
