import java.util.*;
import java.lang.*;
import java.io.*;
class Ques17
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0,a,temp;
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		temp=num;
		while(num>0)
		{
			a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
		}
		if(temp==sum)
		{
			System.out.println("yes");
			
		}
		else 
		  {
		  	System.out.println("no");
		  }	  
	}
}
