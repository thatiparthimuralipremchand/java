import java.util.Locale;
import java.util.ResourceBundle;
public class TestLocale
{
public static void main (String args[ ])
{
Locale L1 = new Locale ("de","DE");
ResourceBundle rbl = ResourceBundle.getBundle("MessageBundle",L1);
System.out.println (rbl.getString("message"));
Locale L2 = new Locale ("zn","ZN");
ResourceBundle rb2 = ResourceBundle.getBundle("MessageBundle",L2);
System.out.println(rb2.getString("message"));
}
}