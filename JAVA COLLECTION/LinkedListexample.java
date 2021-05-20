package firstexample;
import java.util.*;
public class LinkedListexample {
	public static void main(String[] args) {
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("M");
		obj.add("N");
		obj.add("O");
		obj.addFirst("AA");
		obj.addLast("CC");
		obj.removeFirst();
		obj.removeLast();
		obj.add(1,"BB");
		obj.remove("BB");
		obj.remove(1);
		obj.add("D");
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		String str=obj.toString();
		System.out.println(str);
		System.out.println(obj);
		LinkedList<String> obj1=new LinkedList<String>();
				obj1.addAll(obj);
				System.out.println(obj1);
				obj1.add("E");
				System.out.println(obj.containsAll(obj1));
		System.out.println(obj.hashCode());
		System.out.println(obj.peek());
		System.out.println(obj.peekFirst());
		System.out.println(obj.peekLast());
		System.out.println(obj.poll());
		System.out.println(obj.pollFirst());
		System.out.println(obj.pollLast());
		System.out.println(obj.get(0));
		System.out.println(obj.size());
	     System.out.println(obj.contains("A"));
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		System.out.println(obj.isEmpty());
		LinkedList<String> obj2=new LinkedList<String>();
		obj2=(LinkedList<String>)obj.clone();
		System.out.println(obj2);
		obj.clear();
		System.out.println(obj);
	}
}