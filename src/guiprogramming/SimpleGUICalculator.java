
package guiprogramming;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUICalculator implements ActionListener{
        TextField num1,num2;
        Label res;
    public SimpleGUICalculator() {
        Frame f = new Frame("Simple Calculator");
        
        /* Initializing the components */
        Label lab1 = new Label("Num 1:");
        Label lab2 = new Label("Num 2:");
        num1 =  new TextField();
        num2 =  new TextField();
        Button add = new Button("+");
        Button sub = new Button("-");
        Button div = new Button("/");
        Button mul = new Button("*");
        res = new Label("Result is:- ");
        /* end of initialization */
        
        /* setting dimensions */
        lab1.setBounds(25,50,75,30);
        num1.setBounds(115,50,100,30);
        num1.setFont(new Font("Arial",Font.BOLD,18));
        lab2.setBounds(25,105,75,30);
        num2.setBounds(115,105,100,30);
        num2.setFont(new Font("Arial",Font.BOLD,18));
        
        add.setBounds(25,160,50,50);
        add.setFont(new Font("Arial",Font.BOLD,18));
        sub.setBounds(165,160,50,50);
        sub.setFont(new Font("Arial",Font.BOLD,18));
        div.setBounds(25,235,50,50);
        div.setFont(new Font("Arial",Font.BOLD,18));
        mul.setBounds(165,235,50,50);
        mul.setFont(new Font("Arial",Font.BOLD,18));
        
        res.setBounds(60,310,400,30);
        res.setFont(new Font("Arial",Font.BOLD,18));
        res.setBackground(Color.red);
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
        
        
        /*Adding button listener */
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new SimpleGUICalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double r= 0.0;
            if(e.getActionCommand().equals("+")){
                r = n1+n2;
            }
            else if(e.getActionCommand().equals("-")){
                r = n1-n2;
            }
            else if(e.getActionCommand().equals("/")){
                r = n1/n2;
            }else{
                r = n1*n2;
            }
            res.setText("Result : "+r);
            num1.setText("");
            num2.setText("");
            num1.requestFocus();
        }catch(Exception exp){
            res.setText("Exception occured");
        }
        
    }
}
