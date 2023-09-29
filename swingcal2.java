import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;	
public class swingcal2 extends JFrame implements ActionListener{
    JFrame f1,f2;
    JLabel unit1,unit2;
    JTextField input,output;
    JButton gm,kg,tonne,cm,m,km,inch,feet,yard,C,F,equals,clr;
    JLabel result,enter;
    JButton btn,btn1,back,clear,scientific,conversion,exit;
    JButton sin,cos,tan,cot,cosec,sec,one,two,three,four,five,six,seven,eight,nine,zero,dot,equal;
    Font s1,s2;
    swingcal2(){
        s1=new Font("Verdana",Font.BOLD,16);
        s2=new Font("Verdana",Font.BOLD,18);
        JPanel p=new JPanel();
        f1=new JFrame();
        f1.setTitle("Trigonometric Value");
        p.setBackground(Color.black);
        btn=new JButton("Unit Conversion");
        btn.setForeground(Color.orange);
        btn.setBackground(Color.black);
        btn.setFont(s1);
        p.add(btn);
        enter=new JLabel("");
        enter.setBounds(40,40,150,50);
        enter.setForeground(Color.orange);
        enter.setFont(s1);
        f1.add(enter);
        JLabel value=new JLabel("Value:");
        value.setBounds(40,80,100,50);
        value.setForeground(Color.orange);
        value.setFont(s1);
        f1.add(value);
        result=new JLabel("0");
        result.setBounds(40,120,100,50);
        result.setForeground(Color.orange);
        result.setFont(s1);
        f1.add(result);
        sin=new JButton("sin");
        sin.setFont(s1);
        sin.setBounds(15,180,60,30);
        sin.setBackground(Color.orange);
        f1.add(sin);
        cos=new JButton("cos");
        cos.setFont(s1);
        cos.setBounds(70,180,65,30);
        cos.setBackground(Color.orange);
        f1.add(cos);
        tan=new JButton("tan");
        tan.setFont(s1);
        tan.setBounds(130,180,65,30);
        tan.setBackground(Color.orange);
        f1.add(tan);
        cot=new JButton("cot");
        cot.setFont(s1);
        cot.setBounds(190,180,65,30);
        cot.setBackground(Color.orange);
        f1.add(cot);
        cosec=new JButton("cosec");
        cosec.setFont(s1);
        cosec.setBounds(255,180,90,30);
        cosec.setBackground(Color.orange);
        f1.add(cosec);
        sec=new JButton("sec");
        sec.setFont(s1);
        sec.setBounds(340,180,65,30);
        sec.setBackground(Color.orange);
        f1.add(sec);
        clear=new JButton("C");
        clear.setFont(s2);
        clear.setBounds(405,180,70,30);
        clear.setBackground(Color.red);
        clear.setForeground(Color.orange);
        f1.add(clear);
        one=new JButton("1");
        one.setBounds(140,220,60,30);
        one.setBackground(Color.black);
        one.setForeground(Color.orange);
        one.setFont(s1);
        f1.add(one);
        two=new JButton("2");
        two.setBounds(200,220,60,30);
        two.setBackground(Color.black);
        two.setForeground(Color.orange);
        two.setFont(s1);
        f1.add(two);
        three=new JButton("3");
        three.setBounds(260,220,60,30);
        three.setBackground(Color.black);
        three.setForeground(Color.orange);
        three.setFont(s1);
        f1.add(three);
        four=new JButton("4");
        four.setBounds(140,250,60,30);
        four.setBackground(Color.black);
        four.setForeground(Color.orange);
        four.setFont(s1);
        f1.add(four);
        five=new JButton("5");
        five.setBounds(200,250,60,30);
        five.setBackground(Color.black);
        five.setForeground(Color.orange);
        five.setFont(s1);
        f1.add(five);
        six=new JButton("6");
        six.setBounds(260,250,60,30);
        six.setBackground(Color.black);
        six.setForeground(Color.orange);
        six.setFont(s1);
        f1.add(six);
        seven=new JButton("7");
        seven.setBounds(140,280,60,30);
        seven.setBackground(Color.black);
        seven.setForeground(Color.orange);
        seven.setFont(s1);
        f1.add(seven);
        eight=new JButton("8");
        eight.setBounds(200,280,60,30);
        eight.setBackground(Color.black);
        eight.setForeground(Color.orange);
        eight.setFont(s1);
        f1.add(eight);
        nine=new JButton("9");
        nine.setBounds(260,280,60,30);
        nine.setBackground(Color.black);
        nine.setForeground(Color.orange);
        nine.setFont(s1);
        f1.add(nine);
        zero=new JButton("0");
        zero.setBounds(140,310,60,30);
        zero.setBackground(Color.black);
        zero.setForeground(Color.orange);
        zero.setFont(s1);
        f1.add(zero);
        dot=new JButton(".");
        dot.setBounds(200,310,60,30);
        dot.setBackground(Color.black);
        dot.setForeground(Color.orange);
        dot.setFont(s1);
        f1.add(dot);
        equal=new JButton("=");
        equal.setBounds(260,310,60,30);
        equal.setBackground(Color.red);
        equal.setForeground(Color.orange);
        equal.setFont(s2);
        f1.add(equal);
        exit=new JButton("EXIT");
        exit.setBounds(175,360,90,30);
        exit.setBackground(Color.black);
        exit.setForeground(Color.red);
        exit.setFont(s2);
        f1.add(exit);
        f1.add(p);
        f1.setSize(500,430);
        f1.setResizable(false);
      //   f1.setUndecorated(true);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(this);
        exit.addActionListener(this);
        clear.addActionListener(this);
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        sec.addActionListener(this);
        cot.addActionListener(this);
        cosec.addActionListener(this);
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
        dot.addActionListener(this);
        equal.addActionListener(this);
           
    }
 @Override
public void actionPerformed(ActionEvent e){
    String ques="";
    if(e.getSource()==sin){
       ques=enter.getText();
       enter.setText(ques+"sin");
    }
    else if(e.getSource()==cos){
        ques=enter.getText();
        enter.setText(ques+"cos");
     }
     else if(e.getSource()==tan){
        ques=enter.getText();
        enter.setText(ques+"tan");
     }
     else if(e.getSource()==cot){
        ques=enter.getText();
        enter.setText(ques+"cot");
     }
     else if(e.getSource()==sec){
        ques=enter.getText();
        enter.setText(ques+"sec");
     }
     else if(e.getSource()==cosec){
        ques=enter.getText();
        enter.setText(ques+"cosec");
     }
     else if(e.getSource()==one){
        ques=enter.getText();
        enter.setText(ques+"1");
     }
     else if(e.getSource()==two){
        ques=enter.getText();
        enter.setText(ques+"2");
     }
     else if(e.getSource()==three){
        ques=enter.getText();
        enter.setText(ques+"3");
     }
     else if(e.getSource()==four){
        ques=enter.getText();
        enter.setText(ques+"4");
     }
     else if(e.getSource()==five){
        ques=enter.getText();
        enter.setText(ques+"5");
     }
     else if(e.getSource()==six){
        ques=enter.getText();
        enter.setText(ques+"6");
     }
     else if(e.getSource()==seven){
        ques=enter.getText();
        enter.setText(ques+"7");
     }
     else if(e.getSource()==eight){
        ques=enter.getText();
        enter.setText(ques+"8");
     }
     else if(e.getSource()==nine){
        ques=enter.getText();
        enter.setText(ques+"9");
     }
     else if(e.getSource()==dot){
        ques=enter.getText();
        enter.setText(ques+".");
     }   
     else if(e.getSource()==zero){
        ques=enter.getText();
        enter.setText(ques+"0");
     }
   else if(e.getSource()==equal){
    String s= enter.getText();
    String c="";
    int count=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='.'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'||s.charAt(i)=='0'){
        if(count==0){
        c=c+" "+s.charAt(i);
        count++;
        }
        else
        c=c+s.charAt(i);
    }
    else
    c=c+s.charAt(i);
    }
    String str[]=c.split(" ");
    double degrees,radians,trivalue=0;
    degrees=Double.valueOf(str[1]);
    if(str[0].equals("sin")){
        radians=Math.toRadians(degrees);
        trivalue=Math.sin(radians);
        result.setText(String.format("%.5f",trivalue));
    }
    else if(str[0].equals("cosec")){
        radians=Math.toRadians(degrees);
        trivalue=1/Math.sin(radians);
        result.setText(String.format("%.5f",trivalue));
    }
    else if(str[0].equals("cos")){
        radians=Math.toRadians(degrees);
        trivalue=Math.cos(radians);
        result.setText(String.format("%.5f",trivalue));
    }
    else if(str[0].equals("sec")){
        radians=Math.toRadians(degrees);
        trivalue=1/Math.cos(radians);
        result.setText(String.format("%.5f",trivalue));
    }
    else if(str[0].equals("tan")){
        if(degrees==90){
            result.setText("Infinity");
        }
        else{
        radians=Math.toRadians(degrees);
        trivalue=Math.tan(radians);
        if(trivalue>=200000){
         result.setText("Infinity");
        }
        else
        result.setText(String.format("%.5f",trivalue));
        }
    }
    else if(str[0].equals("cot")){
        if(degrees%180==0){
            result.setText("Infinty");
        }
        else{
        radians=Math.toRadians(degrees);
        trivalue=1/Math.tan(radians);
        result.setText(String.format("%.5f",trivalue));
        }
    }
   }
   //  JLabel unit1,unit2;
   //  JTextField input,output;
   //  JButton gm,kg,tonne,cm,m,km,inch,feet,yard,C,F,equals;
    else if(e.getSource()==btn){
        f2=new JFrame("Unit Conversion");
        JPanel p1=new JPanel();
        p1.setBackground(Color.black);
        btn1=new JButton("Trigonometric Value");
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.orange);
        btn1.setFont(s1);
        p1.add(btn1);
      unit1=new JLabel("Unit:");
      unit1.setBounds(40,50,100,20);
      unit1.setBackground(Color.black);
      unit1.setForeground(Color.orange);
      unit1.setFont(s1);
       f2.add(unit1);
       input=new JTextField("");
       input.setBounds(40,80,150,28);
       input.setBackground(Color.white);
       input.setForeground(Color.black);
       input.setFont(s1);
      f2.add(input);
      unit2=new JLabel("Unit:");
      unit2.setBounds(40,120,50,20);
      unit2.setBackground(Color.black);
      unit2.setForeground(Color.orange);
      unit2.setFont(s1);
      f2.add(unit2);
      clr=new JButton("Clear");
      clr.setBounds(315,260,80,30);
      clr.setBackground(Color.red);
      clr.setForeground(Color.orange);
      clr.setFont(s1);
      f2.add(clr); 
      output=new JTextField("");
      output.setBounds(40,150,150,28);
      output.setBackground(Color.white);
      output.setForeground(Color.black);
      output.setFont(s1);
      f2.add(output);
      gm=new JButton("gm");
      gm.setBounds(60,200,100,30);
      gm.setForeground(Color.orange);
      gm.setBackground(Color.black);
      gm.setFont(s1);
      f2.add(gm);
      kg=new JButton("kg");
      kg.setBounds(60,230,100,30);
      kg.setForeground(Color.orange);
      kg.setBackground(Color.black);
      kg.setFont(s1);
      f2.add(kg);
      tonne=new JButton("tonne");
      tonne.setBounds(60,260,100,30);
      tonne.setForeground(Color.orange);
      tonne.setBackground(Color.black);
      tonne.setFont(s1);
      f2.add(tonne);
      inch=new JButton("inch");
      inch.setBounds(155,200,80,30);
      inch.setForeground(Color.orange);
      inch.setBackground(Color.black);
      inch.setFont(s1);
      f2.add(inch);
      feet=new JButton("feet");
      feet.setBounds(155,230,80,30);
      feet.setForeground(Color.orange);
      feet.setBackground(Color.black);
      feet.setFont(s1);
      f2.add(feet);
      yard=new JButton("yard");
      yard.setBounds(155,260,80,30);
      yard.setForeground(Color.orange);
      yard.setBackground(Color.black);
      yard.setFont(s1);
      f2.add(yard);
      cm=new JButton("cm");
      cm.setBounds(235,200,80,30);
      cm.setForeground(Color.orange);
      cm.setBackground(Color.black);
      cm.setFont(s1);
      f2.add(cm);
      m=new JButton("m");
      m.setBounds(235,230,80,30);
      m.setForeground(Color.orange);
      m.setBackground(Color.black);
      m.setFont(s1);
      f2.add(m);
      km=new JButton("km");
      km.setBounds(235,260,80,30);
      km.setForeground(Color.orange);
      km.setBackground(Color.black);
      km.setFont(s1);
      f2.add(km);
      C=new JButton("°C");
      C.setBounds(315,200,80,30);
      C.setForeground(Color.orange);
      C.setBackground(Color.black);
      C.setFont(s1);
      f2.add(C);
      F=new JButton("°F");
      F.setBounds(315,230,80,30);
      F.setForeground(Color.orange);
      F.setBackground(Color.black);
      F.setFont(s1);
      f2.add(F);
      equals=new JButton("Equal");
      equals.setBounds(210,120,100,30); 
      equals.setForeground(Color.orange);
      equals.setBackground(Color.red);
      equals.setFont(s2);
      f2.add(equals);
       back=new JButton("CLOSE");
        back.setBounds(175,335,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.red);
        back.setFont(s2);
        f2.add(back);
        f1.dispose();
        f2.add(p1);
        f2.setSize(500,430);
        f2.setLocationRelativeTo(f1);
        f2.setResizable(false);
        f2.setVisible(true);
        f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        btn1.addActionListener(this);
        back.addActionListener(this);
        gm.addActionListener(this);
        kg.addActionListener(this);
        tonne.addActionListener(this);
        inch.addActionListener(this);
        feet.addActionListener(this);
        yard.addActionListener(this);
        cm.addActionListener(this);
        m.addActionListener(this);
        km.addActionListener(this);
        C.addActionListener(this);
        F.addActionListener(this);
        equals.addActionListener(this);
        clr.addActionListener(this);
        }
        else if(e.getSource()==gm){
         if(unit1.getText().equals("Unit:"))
         unit1.setText("gm");
         else if(!unit1.getText().equals("Unit:"))
         unit2.setText("gm");
        }
        else if(e.getSource()==kg){
         if(unit1.getText().equals("Unit:"))
         unit1.setText("kg");
         else if(!unit1.getText().equals("Unit:"))
         unit2.setText("kg");
        }
        else if(e.getSource()==tonne){
         if(unit1.getText().equals("Unit:"))
         unit1.setText("tonne");
         else if(!unit1.getText().equals("Unit:"))
         unit2.setText("tonne");
        }
        else if(e.getSource()==inch){
         if(unit1.getText().equals("Unit:"))
         unit1.setText("inch");
         else if(!unit1.getText().equals("Unit:"))
         unit2.setText("inch");
        }
        else if(e.getSource()==feet){
         if(unit1.getText().equals("Unit:"))
         unit1.setText("feet");
         else if(!unit1.getText().equals("Unit:"))
         unit2.setText("feet");
        }
        else if(e.getSource()==yard){
         if(unit1.getText().equals("Unit:"))
         unit1.setText("yard");
         else if(!unit1.getText().equals("Unit:"))
         unit2.setText("yard");
        }
        else if(e.getSource()==cm){
         if(unit1.getText().equals("Unit:"))
         unit1.setText("cm");
         else if(!unit1.getText().equals("Unit:"))
         unit2.setText("cm");
        }
        else if(e.getSource()==m){
         if(unit1.getText().equals("Unit:"))
         unit1.setText("m");
         else if(!unit1.getText().equals("Unit:"))
         unit2.setText("m");
        }
        else if(e.getSource()==km){
         if(unit1.getText().equals("Unit:"))
         unit1.setText("km");
         else if(!unit1.getText().equals("Unit:"))
         unit2.setText("km");
        }
        else if(e.getSource()==C){
         if(unit1.getText().equals("Unit:"))
         unit1.setText("C");
         else if(!unit1.getText().equals("Unit:"))
         unit2.setText("C");
        }
        else if(e.getSource()==F){
         if(unit1.getText().equals("Unit:"))
         unit1.setText("F");
         else if(!unit1.getText().equals("Unit:"))
         unit2.setText("F");
        }
        else if(e.getSource()==clr){
         unit1.setText("Unit:");
         unit2.setText("Unit:");
         input.setText("");
         output.setText("");
        }
        else if(e.getSource()==equals){
         String x=input.getText();
         String a= unit1.getText();
         String b= unit2.getText();
         double d=Double.valueOf(x);
         if(a.equals(b)){
            output.setText(x);
         }
         else if(a.equals("gm")&&b.equals("kg")){
            d=d/1000;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("gm")&&b.equals("tonne")){
            d=d/1000000;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("kg")&&b.equals("gm")){
            d=d*1000;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("kg")&&b.equals("tonne")){
            d=d/1000;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("tonne")&&b.equals("gm")){
            d=d*1000000;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("tonne")&&b.equals("kg")){
            d=d*1000;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("inch")&&b.equals("feet")){
            d=d*0.083333333;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("inch")&&b.equals("yard")){
            d=d*0.0277777778;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("feet")&&b.equals("inch")){
            d=d*12;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("feet")&&b.equals("yard")){
            d=d*0.3333333;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("yard")&&b.equals("inch")){
            d=d*36;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("yard")&&b.equals("feet")){
            d=d*3;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("inch")&&b.equals("feet")){
            d=d*0.083333333;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("cm")&&b.equals("m")){
            d=d*0.01;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("cm")&&b.equals("km")){
            d=d*0.00001;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("m")&&b.equals("cm")){
            d=d*100;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("m")&&b.equals("km")){
            d=d*0.001;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("km")&&b.equals("cm")){
            d=d*100000;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("km")&&b.equals("m")){
            d=d*1000;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("C")&&b.equals("F")){
            d=(d*9/5)+32;
            output.setText(String.format("%.2f",d));
         }
         else if(a.equals("F")&&b.equals("C")){
            d=(d-32)*5/9;
            output.setText(String.format("%.2f",d));
         }
        }
        else if(e.getSource()==btn1){
            f1.setVisible(true);
            f2.dispose();
        }
        else if(e.getSource()==exit || e.getSource()==back){
            System.exit(0);
        }
        else if(e.getSource()==clear){
            enter.setText("");
            result.setText("0");
        }
}
public static void main(String args[])
{
    swingcal2 ob=new swingcal2();
}
}