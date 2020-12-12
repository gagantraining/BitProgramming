
package guiprogramming;

import java.awt.Frame;
import java.awt.Label;


public class GUILabels extends Frame{
    
    public GUILabels(){
        
        Label lab = new Label("This is my label");
        lab.setBounds(100,100,150,20);
        
        add(lab);
        
        setSize(500,500);
        setLayout(null);
        setVisible(true); 
    }
    public static void main(String[] args) {
        new GUILabels();
    }
}
