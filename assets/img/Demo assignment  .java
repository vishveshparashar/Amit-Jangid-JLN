import java.awt.*;
class Windemo extends Frame
{
private Button b1,b2,b3,b4,b5,b6;
private Label l1,l2,l3;
private TextField t1,t2,t3;
private Panel p1,p2,p3,p4;
public Windemo()
{
setSize(500,500);
setTitle("eg of panel");
l1=new Label("Num1");
l2=new Label("num2");
l3=new Label("Ans");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
b1=new Button("+");
b2=new Button("-");
b3=new Button("*");
b4=new Button("/");
b5=new Button("CLEAR");
b6=new Button("Arithmtic operator");
p1=new Panel();
p2=new Panel();
p3=new Panel();
p4=new Panel();
GridLayout g1=new GridLayout(3,2);
p1.setLayout(g1);
p1.add(l1);
p1.add(t1);
p1.add(l2);
p1.add(t2);
p1.add(l3);
p1.add(t3);
GridLayout g2=new GridLayout(2,1);
p2.setLayout(g2);
p2.add(b1);
p2.add(b2);
GridLayout g3=new GridLayout(2,1);
p3.setLayout(g3);
p3.add(b3);
p3.add(b4);
FlowLayout f=new FlowLayout();
p4.setLayout(f);
p4.add(b5);
BorderLayout b=new BorderLayout();
setLayout(b);
add(p1,BorderLayout.CENTER);
add(p2,BorderLayout.WEST);
add(p3,BorderLayout.EAST);
add(p4,BorderLayout.SOUTH);
add(b6,BorderLayout.NORTH);
setVisible(true);
}
}
class Demo
{
public static void main(String args[])
{
Windemo obj=new Windemo(); 
}
}