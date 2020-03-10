import java.awt.*;
import javax.swing.*;
class notepad extends JFrame
{
JFrame f;
JMenuBar mb;
JMenu m1,m2,m3,m4,m5;
notepad()
{
f=new JFrame();
f.setLayout(null);
mb= new JMenuBar();
m1=new JMenu("File");
m2=new JMenu("Edit");
m3=new JMenu("Format");
m4=new JMenu("View");
m5=new JMenu("Help");
mb.add(m1);
mb.add(m2);
mb.add(m3);
mb.add(m4);
mb.add(m5);
f.setJMenuBar(mb);
f.setVisible(true);
f.setSize(500,400);
}
public static void main(String S[ ])
{
new notepad();
}
}