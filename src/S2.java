

import javax.swing.*;
public class S2 extends JFrame{
    public S2() {
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox c1=new JCheckBox("Bold");
        JCheckBox c2=new JCheckBox("Italic");
        JPanel p1=new JPanel();
        p1.add(c1);
        p1.add(c2);
        
        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");
        p1.add(r1);
        p1.add(r2);
         
       ButtonGroup grp = new ButtonGroup();
       grp.add(r1);
       grp.add(r2);
       JComboBox ch1 =new JComboBox();
       ch1.addItem("a");
       ch1.addItem("b");
       ch1.addItem("c");
       ch1.addItem("d");
       
       
       String a[]={"rahul","saumil","deepak","bittu"};
       JComboBox ch2=new JComboBox(a);
       p1.add(ch2);
       p1.add(ch1);
       
       JTextArea ta1=new JTextArea(5,10);
       JScrollPane js1= new JScrollPane(ta1);
       p1.add(js1);
       
       
       JList ls = new JList(a);
       JScrollPane js2= new JScrollPane(ls);
       p1.add(js2);
       ls.setVisibleRowCount(3);
       
      
        ImageIcon img = new ImageIcon("C:\\CLICKS\\PICS\\!! It's My Turn !!\\Mine\\Clg Fun\\rahul.jpg");
       JLabel L1=new JLabel();
       L1.setIcon(img);
      
       
       p1.add(L1);
       getContentPane().add(p1);}
    
    public static void main(String Args[])
    {
        new S2();
    }      }
      
