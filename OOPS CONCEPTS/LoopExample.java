package firstexample;

public class LoopExample {
	public void disp_loops()
	{
          
		System.out.println("For loop");
		for(int i=0;i<=10;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		System.out.println("While loop");
		int j=0;
		while(j<=10)
		{
			System.out.print(j);
			j++;
		}
		int k=0;
		System.out.println();
		System.out.println("Do-while loop");
		do
		{
			System.out.print(k);
			k++;
		}while(k<=10);
	}

}
