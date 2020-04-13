package test;

import java.util.*;
public class second {
	
	public static void main(String[] string) {
		Set<Character> set = new HashSet<Character>();
		set.add('1');
		 set.add('1');
		 set.add('2');
		 System.out.println(set.size());//2
		 
		 List<Integer> lis=new ArrayList<Integer>();
		 lis.add(2);
		 lis.add(3);
		 lis.add(5);
		 lis.add(3);
		 System.out.println(lis.size());//4
		 System.out.println(lis.get(0));//2
		 System.out.println(Collections.frequency(lis, 3));//2
		 System.out.println(lis.contains(5));//true
		
	}
	

}
