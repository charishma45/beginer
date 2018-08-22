/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set41
{
	public static void main (String[] args) throws java.lang.Exception
	{ Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=1,b=1,c;
		
		if(n>2)
		{
			System.out.print(a+" "+b);
			for(int i=2;i<n;i++){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;}
		}
		else
		{
			if(n==1)
			 System.out.println(a);
			 else
			System.out.print(a+" "+b);
		}
	}
}
		// your code goes here
	
