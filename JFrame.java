import javax.swing.JFrame;
public class FrameDemo
{
JFrame obj;
public FrameDemo()
{
obj=new JFrame();
obj.setTitle("JFrame Demo");
obj.setVisible(true);
obj.setSize(300,300);
}
public static void main (String[] args)
{
FrameDemo fobj = new FrameDemo();
}
}