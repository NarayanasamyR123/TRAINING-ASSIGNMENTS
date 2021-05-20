package firstexample;
import java.util.*;
public class PriorityQueueExample {
	public static void main(String[] args) {
	Queue<String> obj=new PriorityQueue<String>();
obj.add("A");
obj.add("B");
obj.add("C");
obj.add("D");
obj.add("E");
obj.add("F");
obj.remove();
obj.remove("B");
Iterator it=obj.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
System.out.println(obj.hashCode());
obj.offer("G");
System.out.println(obj.contains("E"));
System.out.println(obj.peek());
System.out.println(obj.poll());
System.out.println(obj.element());
System.out.println(obj.isEmpty());
System.out.println(obj.size());
System.out.println(obj);
obj.clear();
System.out.println(obj);
	}
}