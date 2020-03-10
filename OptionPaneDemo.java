import javax.swing.JFrame;
import javax.swing.JOptionPane;
class OptionPaneDemo extends JFrame
{
public OptionPaneDemo()
{
setVisible(true);
setSize(100,100);
JOptionPane.showConfirmDialog(this,"Do you want to save it ?");
setTitle("Confirmation Message");
JOptionPane.Yes_NO_CANCEL_OPTION;
JOptionPane.WARNING_MESSAGE;
}
public static void main(String[]args)
{
OptionPaneDemo oobj = new OptionPaneDemo();
}
}