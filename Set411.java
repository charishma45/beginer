/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set411
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int len=str.length();
		int count=1;
		for(int i=0;i<len-1;i++)
		{ 
		   if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
		   {
		        count++;
		   }
		  }
		  System.out.println(count);
	}
}
	// your code goes here
	
