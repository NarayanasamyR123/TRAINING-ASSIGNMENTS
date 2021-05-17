package firstexample;

public class SwitchExample {
	public void switch_calculator(char c,int a,int b)
	{
		switch(c)
		{
		case 'A':
			System.out.println(a+b);
			break;
		case 'S':
			System.out.println(a-b);
			break;
		case 'M':
			System.out.println(a*b);
			break;
		case 'D':
			System.out.println(a/b);
			break;
			default:
				System.out.println("Invalid Operation");
		}
	}
}
