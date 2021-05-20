package firstexample;
import java.util.*;
public class ArraylistExample {
	public static void main(String[] args) {
List<String> obj=new ArrayList<String>();
obj.add("A");
obj.add("B");
obj.add("C");
obj.add("M");
obj.add("D");
obj.add("E");
obj.add(1, "AA");
obj.remove("D");
obj.remove(2);
obj.set(0, "AAA");
ArrayList<String> obj1=new ArrayList<String>();
obj1.addAll(obj);
obj.add("F");
System.out.println(obj.lastIndexOf("E"));
System.out.println(obj.indexOf("AA"));
System.out.println(obj.contains("E"));
System.out.println(obj.get(0));
System.out.println(obj.size());
System.out.println(obj.isEmpty());
obj.sort(Comparator.reverseOrder());
Collections.sort(obj);
System.out.println(obj);
System.out.println(obj1);
obj.removeAll(obj1);
System.out.println(obj);
obj.clear();
System.out.println(obj);
System.out.println(obj.hashCode());
for(String str:obj1)
{
	System.out.println(str);
}
Iterator<String> it=obj1.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

	}
}