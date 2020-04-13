package jul;

import java.util.*;


public class nonrepeating {
public static void main(String[] args) {
	String s="abcdabcefgd";
	ArrayList<Character> c = new ArrayList<Character>();
	for(int i=0;i<s.length();i++)
	{
		c.add(s.charAt(i));
		
	}
	for(int i=0;i<s.length();i++)
	{
	if(Collections.frequency(c, s.charAt(i))==1)
	{
		System.out.println(s.charAt(i));
		return;
	}
	
	}
	
}
}
