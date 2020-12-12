
package guiprogramming;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIButtons {
    
    public GUIButtons(){
        Frame f = new Frame("Buttons");
        
        Button b = new Button("Click Me");
        b.setBounds(100,100,150,30);
        f.add(b);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Is Clicked");
            }
        });
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new GUIButtons();
    }
}
