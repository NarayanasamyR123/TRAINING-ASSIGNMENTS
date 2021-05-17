package firstexample;

public class ArrayAndStringExample {
	public void array()
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int a1[][]= {{1,2,3,4,5},{6,7,8}};
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1[i].length;j++)
			{
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void string_operation(String str)
	{
		int a=10;
		char arr[]=str.toCharArray();
		String arr1[]=str.split(" ");
		System.out.println("length "+str.length());
		System.out.println("Upper case "+str.toUpperCase());
		System.out.println("Lower case "+str.toLowerCase());
		System.out.println("char at "+str.charAt(0));
		System.out.println("string empty or not "+str.isEmpty());
		System.out.println("substring from start to end "+str.substring(1));
		System.out.println("substring from begin to end index "+str.substring(1,str.length()));
		System.out.println("Trim "+str.trim());
		System.out.println("string concat "+str.concat("hello"));
		System.out.println("String hashcode "+str.hashCode());
		System.out.println("string replace "+str.replace('v', 'a'));
		System.out.println("string replace first "+str.replaceFirst("bye", "hi"));
		System.out.println("String replace all "+str.replaceAll("hi", "bye"));
		System.out.println("String contains "+str.contains("hi"));
		System.out.println("String equals "+str.equals(str));
		System.out.println("String equalsIgnoreCase "+str.equalsIgnoreCase(str));
		System.out.println("string index of "+str.indexOf('a'));
		System.out.println("string last index of "+str.lastIndexOf('a'));
		System.out.println(arr);
		System.out.println("Integer to String "+str.valueOf(a));
		for(String st:arr1)
		{
			System.out.println(st);
		}
	}

}
