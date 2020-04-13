package jul;
import java.util.*;
public class arra {
public static void main(String[] args) {
	String s="hello";
	String s2="lloeh";
	char c[]=s.toCharArray();
	char c2[]=s2.toCharArray();
	Arrays.sort(c);
	Arrays.sort(c2);
	if(Arrays.equals(c, c2))
		System.out.println("anagram");
	else
		System.out.println("Not an Anagram");
	
	/*System.out.println(c);
	System.out.println(c2);
	String s3=String.valueOf(c);
	System.out.println(s3);
	String s4=String.valueOf(c2);
	System.out.println(s4);*/
	//if(s3.equals(s4))
	
	
}
}
