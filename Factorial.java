package fellowship;

import java.util.Scanner;
/**
 * @author Premsai Manthani
 * @Purpose : This program find the factorial of a no and returns the factorial value.
 * 
 */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial o1=new factorial();
		o1.process();
		
	}
		public void process()
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the no ");
		int n=s1.nextInt();
		if(n>0)
		{
			fact(n);
		}
		else
		{
			System.out.println("rnter the correct value");
		}
		}
	public void fact(int n)
	{	int fact=1;
	
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("the factorial "+fact);
	}

}
