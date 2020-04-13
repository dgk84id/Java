import java.util.*;
public class stringoperation {
	
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		String s1="Hell",s2="o";
		System.out.println("appending string at the end");
		l.add(s1);
		System.out.println("Before appending"+l.toString());
		l.add(s2);
		System.out.println("after appending"+l.toString());
		String s3="-";
		System.out.println("Inserting at a specific index");
		l.add(1, s3);
		l.add("Hello");
		l.add("Height");
		l.add("Light");
		l.add("Weight");
		System.out.println("After inserting"+l.toString());
		System.out.println("seraching the element Hell"+l.indexOf(s1));
		System.out.println("listing all string starts with the given letter H");
		for(String ip:l)
		{
			if(ip.charAt(0)=='H')
				System.out.println(ip);
		}
		
		
	}
	

}
