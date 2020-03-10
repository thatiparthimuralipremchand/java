import javax.swing.JFrame;
import javax.swing.JMenuBar;
public class MenuBarDemo extends JFrame
{
JMenuBar menuBar;
public MenuBarDemo()
{
menuBar=new JMenuBar();
setJMenuBar (menuBar);
setTitle("JMenuBar Demo");
setSize(300,300);
setVisible(true);
}
public static void main (String[] args)
{
MenuBarDemo mobj = new MenuBarDemo();
}
}