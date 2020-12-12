
package guiprogramming;

import java.awt.*;

public class SimpleGUICalculator {

    public SimpleGUICalculator() {
        Frame f = new Frame("Simple Calculator");
        
        /* Initializing the components */
        Label lab1 = new Label("Num 1:");
        Label lab2 = new Label("Num 2:");
        TextField num1 =  new TextField();
        TextField num2 =  new TextField();
        Button add = new Button("+");
        Button sub = new Button("-");
        Button div = new Button("/");
        Button mul = new Button("*");
        Label res = new Label("Result is:- ");
        /* end of initialization */
        
        /* setting dimensions */
        lab1.setBounds(25,50,75,30);
        num1.setBounds(115,50,100,30);
        lab2.setBounds(25,105,75,30);
        num2.setBounds(115,105,100,30);
        
        add.setBounds(25,160,50,50);
        sub.setBounds(165,160,50,50);
        div.setBounds(25,235,50,50);
        mul.setBounds(165,235,50,50);
        
        res.setBounds(60,310,100,30);
        res.setBackground(Color.red);
        res.setFont(new Font("Arial",Font.BOLD,11));
        res.setAlignment(Label.CENTER);
        /* end of setting dimensions*/
        /* mapping with frame */
        f.add(lab1);
        f.add(lab2);
        f.add(num1);
        f.add(num2);
        f.add(add);
        f.add(sub);
        f.add(div);
        f.add(mul);
        f.add(res);
        /* end of mapping */
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new SimpleGUICalculator();
    }
}
