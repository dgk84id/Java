package wiprotrainingmahe;
import java.util.*;
public class palindrome {
	public static void main(String[] args) 
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l=s.length();
		int flag=0;
		{
			
			for(int i=0;i<l/2;i++)
			{
				if(s.charAt(--l)==s.charAt(i))
				{
					flag=1;
				}
			
			}
		}
	
	if (flag==1)
	{
		System.out.println("String is palindrome");
	}
	else
	{
		System.out.println("String is not a palindrome");
	}

}}
