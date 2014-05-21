
import java.awt.ActiveEvent;
import javax.swing.*;
import java.awt.ActiveEvent.*;
import java.awt.event.ActionListener;

 public class Notepad extends JFrame implements ActionListener 
         
         
 {
     JMenuBar mb1;
     JMenuBar m1,m2;
     JMenuItem mm1,mm2,mm3,mm4;
     JMenuItem mm21,mm22,mm23,mm24;
     
     JEditorPane jed;
     JFileChooser jfc =new JFileChooser();
     public  Notepad()
     {
         setVisible (true);
         setSize(400,400);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        mb1=new JMenuBar();
m1=new JMenuBar();         
 m2=new JMenuBar();
 
 mm1= new JMenuItem("new");
 mm2= new JMenuItem("open");
 mm3= new JMenuItem("save");
 mm4= new JMenuItem("exit");
 
 mm21= new JMenuItem("cut");
 mm22= new JMenuItem("copy");
 mm23= new JMenuItem("paste");
 mm24= new JMenuItem("select all");
 
 JSeparator js1= new JSeparator();
 JSeparator js2= new JSeparator();
 
 
 m1.add(mm1);
 m1.add(mm2);
 m1.add(mm3);
 m1.add(js1);
 m1.add(mm4);
 
 
 m2.add(mm21);
 m2.add(mm22);
 m2.add(mm23);
 m2.add(js2);
 m2.add(mm24);
 
 mb1.add(m1);
 mb1.add(m2);
 
setJMenuBar (mb1);
jed=new JEditorPane();
JScrollPane js= new JScrollPane(jed);
getContentPane().add(js);

mm1.addActionListener(this);
mm2.addActionListener(this);
mm3.addActionListener(this);
mm4.addActionListener(this);
mm21.addActionListener(this);
mm22.addActionListener(this);
mm23.addActionListener(this);
mm24.addActionListener(this);
 }
public void ActionPerformed (ActionEvent e)
{
    if (e.getSource()==mm1)
    {jed.getText("");}
     if (e.getSource()==mm2)
     {jfc.showOpenDialog(null);
       if (e.getSource()==mm3)
       {jfc.showOpenDialog(this);}
            if (e.getSource()==mm4)
            {system.exit(0);}
      
      
      
       if (e.getSource()==mm21)
       {jed.cut();}
           
            if (e.getSource()==mm22)
            {jed.copy();}
                
                 if (e.getSource()==mm23)
                 {jed.paste();}
                     
                      if (e.getSource()==mm24)
                      {jed.selectAll();}         
         
     }
     public static void main (String args[])
     {
         new Notepad();
     }
 }


