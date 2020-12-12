package guiprogramming;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIInput {
    public GUIInput(){
        Frame f = new Frame("Inputs");
        
        TextField tf = new TextField();
        tf.setBounds(100,100,150,30);
        f.add(tf);
        
        Button b = new Button("Send");
        b.setBounds(200,200,100,30);
        f.add(b);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(tf.getText());
            }
        });
        
         
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new GUIInput();
    }
}
