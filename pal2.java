package wiprotrainingmahe;

import java.util.*;

public class pal2 {
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String reverse="";
		int l=s.length();
	    for (int i = l-1; i >=0; i--)
	    {
		     reverse=reverse+s.charAt(i);	
		}
		if(s.equals(reverse))
		{
			System.out.println("The given string "+s+" is palindrome");
		}
		else
		{
			System.out.println("The gn str isn't palindrome");
		}

}
}
