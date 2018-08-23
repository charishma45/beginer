/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set55
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		int len=st.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
		   if(Character.isDigit(st.charAt(i)))
		    {
		    	count++;
		    }
		}
	        System.out.println(count);	   
	}
}
		// your code goes here
	
