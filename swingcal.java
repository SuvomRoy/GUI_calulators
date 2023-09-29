import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.lang.Exception.*;
import java.math.*;
public class swingcal extends JFrame implements ActionListener{
    JButton ebutton,cancel,equal,plus,minus,mul,div,zero,one,two,three,four,five,six,seven,eight,nine,point;
    JLabel enter;
    JLabel result;
    JLabel equ;
    JLabel ans;
    public swingcal(){
        Font f=new Font("Verdana",Font.BOLD,16);
        Font f1=new Font("arial",Font.BOLD,16);
    setTitle("Calculator");
   getContentPane().setBackground(Color.BLUE);
    ebutton=new JButton("Exit");
    ebutton.setForeground(Color.red);
    ebutton.setBounds(160,200,80,25);
    ebutton.setFont(f1);
    add(ebutton);
    enter=new JLabel("Enter Equation:");
    enter.setBounds(50,-10,200,100);
    enter.setFont(f);
    enter.setForeground(Color.white);
    add(enter);
    equ=new JLabel("");
    equ.setBounds(50,60,500,30);
    equ.setForeground(Color.white);
    equ.setFont(f);
    add(equ);
    result=new JLabel("Result:");
    result.setBounds(50,70,200,100);
    result.setForeground(Color.white);
    result.setFont(f);
    add(result);
    ans=new JLabel("0");
    ans.setBounds(50,140,500,30);
    ans.setForeground(Color.white);
    ans.setFont(f);
    add(ans);
    cancel=new JButton("C");
    cancel.setBounds(50,215,50,25);
    cancel.setForeground(Color.black);
    cancel.setFont(f1);
    add(cancel);
    plus=new JButton("+");
    plus.setBounds(50,240,50,25);
    plus.setFont(f1);
    add(plus);
    minus=new JButton("-");
    minus.setBounds(50,265,50,25);
    minus.setFont(f1);
    add(minus);
    mul=new JButton("*");
    mul.setBounds(50,290,50,25);
    mul.setFont(f1);
    add(mul);
    div=new JButton("/");
    div.setBounds(50,315,50,25);
    div.setFont(f1);
    add(div);
    one=new JButton("1");
    one.setBounds(160,240,50,25);
    add(one);
    two=new JButton("2");
    two.setBounds(210,240,50,25);
    add(two);
    three=new JButton("3");
    three.setBounds(260,240,50,25);
    add(three);
    four=new JButton("4");
    four.setBounds(160,265,50,25);
    add(four); 
    five=new JButton("5");
    five.setBounds(210,265,50,25);
    add(five); 
    six=new JButton("6");
    six.setBounds(260,265,50,25);
    add(six);
    seven=new JButton("7");
    seven.setBounds(160,290,50,25);
    add(seven);
    eight=new JButton("8");
    eight.setBounds(210,290,50,25);
    add(eight);
    nine=new JButton("9");
    nine.setBounds(260,290,50,25);
    add(nine);
    zero=new JButton("0");
    zero.setBounds(160,315,50,25);
    add(zero);
    point=new JButton(".");
    point.setBounds(210,315,50,25);
    add(point);
    equal=new JButton("=");
    equal.setBounds(260,315,50,25);
    equal.setForeground(Color.black);
    equal.setFont(f1);
    add(equal);
    setLayout(null);
    setSize(400,400);
    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ebutton.addActionListener(this);
    equal.addActionListener(this);
    cancel.addActionListener(this);
    div.addActionListener(this);
    mul.addActionListener(this);
    minus.addActionListener(this);
    plus.addActionListener(this);
    one.addActionListener(this);
    two.addActionListener(this);
    three.addActionListener(this);
    four.addActionListener(this);
    five.addActionListener(this);
    six.addActionListener(this);
    seven.addActionListener(this);
    eight.addActionListener(this);
    nine.addActionListener(this);
    zero.addActionListener(this);
    point.addActionListener(this);
    }
@Override
public void actionPerformed(ActionEvent e){
 
    String s="";
    if(e.getSource()==ebutton)
    System.exit(0);
    else if(e.getSource()==plus){
        s=equ.getText()+"+";
        equ.setText(s);
    }
    else if(e.getSource()==minus){
        s=equ.getText()+"-";
        equ.setText(s);
    }
    else if(e.getSource()==div){
        s=equ.getText()+"/";
        equ.setText(s);
    }
    else if(e.getSource()==mul){
        s=equ.getText()+"*";
        equ.setText(s);
    }
    else if(e.getSource()==minus){
        s=equ.getText()+"-";
        equ.setText(s);
    }
    else if(e.getSource()==zero){
        s=equ.getText()+"0";
        equ.setText(s);
    }
    else if(e.getSource()==one){
        s=equ.getText()+"1";
        equ.setText(s);
    }
    else if(e.getSource()==two){
        s=equ.getText()+"2";
        equ.setText(s);
    }
    else if(e.getSource()==three){
        s=equ.getText()+"3";
        equ.setText(s);
    }
    else if(e.getSource()==four){
        s=equ.getText()+"4";
        equ.setText(s);
    }
    else if(e.getSource()==five){
        s=equ.getText()+"5";
        equ.setText(s);
    }
    else if(e.getSource()==six){
        s=equ.getText()+"6";
        equ.setText(s);
    }
    else if(e.getSource()==seven){
        s=equ.getText()+"7";
        equ.setText(s);
    }
    else if(e.getSource()==eight){
        s=equ.getText()+"8";
        equ.setText(s);
    }
    else if(e.getSource()==nine){
        s=equ.getText()+"9";
        equ.setText(s);
    }
    else if(e.getSource()==point){
        s=equ.getText()+".";
        equ.setText(s);
    }
    else if(e.getSource()==equal){
        String s1=equ.getText();
        String s3="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='+'||s1.charAt(i)=='-'){
           s3=s3+" "+s1.charAt(i);
            }
            else if(s1.charAt(i)=='*'||s1.charAt(i)=='/'){
                s3=s3+" "+s1.charAt(i)+" ";
            }
           else{
           s3=s3+s1.charAt(i);
           }
        }
        String[] arr=s3.split(" ");
        double res=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j].equals("/")){
                try {
                    res=res/(double)Integer.valueOf(arr[j+1]);
                    j+=1;
                } catch (Exception f) {
                    res=res/Double.valueOf(arr[j+1]);
                    j+=1;
                }
               
            }
            else if(arr[j].equals("*")){
            try {
                res=res*(double)Integer.valueOf(arr[j+1]);
                j+=1;
            } catch (Exception f) {
                res=res*Double.valueOf(arr[j+1]);
                j+=1;
            }
            }
            else{
                try {
                    res+=(double)Integer.valueOf(arr[j]);
                } catch (Exception f) {
                    res+=Double.valueOf(arr[j]);
                }
            } 
        }
    ans.setText(""+res);
}
   else if(e.getSource()==cancel){
    equ.setText("");
    ans.setText("0");
   }

}
public static void main(String args[]){
    swingcal ob=new swingcal();
}
}