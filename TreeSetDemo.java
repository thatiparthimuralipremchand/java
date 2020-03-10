import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo
{
public static void main (String[ ] args)
{
TreeSet<Integer> obj = new TreeSet<Integer>();
Integer iobj1 = new Integer(114);
Integer iobj2 = new Integer (111);
Integer iobj3 = new Integer(113);
Integer iobj4 = new Integer(112);
System.out.println("Size of TreeSet is: " + obj.size());
obj.add(iobj1);
obj.add(iobj2);
obj.add(iobj3);
obj.add(iobj4);
obj.add(iobj2);
System.out.println("\nTreeSet after adding the objects:"+obj);
System.out.println("Size of TreeSet after adding objects:"+obj.size());
obj.remove(iobj3);
obj.remove(iobj1);
System.out.println("\nTreeSet after removing the objects"+obj);
System.out.println("Size of TreeSet after removing objects:"+obj.size());
System.out.println("\nThe final TreeSet:");
Iterator i = obj.Iterator();
while (i.hasNext())
{
System.out.println(i.next());
}
}
}
