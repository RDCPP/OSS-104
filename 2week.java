/*
public class Week 
{

	public static void main(String[] args) 
	{
		int num1 = 50;
		int num2 = 40;

		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 - num2 = " + (num1-num2));
		System.out.println("num1 x num2 = " + (num1*num2));
		System.out.println("num1 / num2 = " + (num1/num2));
		
	}

}

public class Week
{
	public static void main(String[] args)
	{
		int num = 120;
		if(num>0 && (num%2) == 0)
		{
			System.out.println("num is positive and even number.");
		}
	}
}
*/

public class Week
{
	public static void main(String[] args)
	{
		int score = -80;
		if(score<=100 && score>=90)
		{
			System.out.println("A");
		}
		else if(score>=80)
		{
			System.out.println("B");
		}
		else if(score>=70)
		{
			System.out.println("C");
		}
		else if(score>0 && score<70)
		{
			System.out.println("F");
		}
		else
		{
			System.out.println("Impossible");
		}
	}
}