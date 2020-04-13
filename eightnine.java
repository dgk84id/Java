package jul;

import java.util.*;


public class eightnine {
public static void main(String[] args) {
		
		String str= "a13b2c14d15";		
		Map<Character, Integer> alphaMap= new LinkedHashMap<>();		
		
		int count=0;
		char hold='\0';
		boolean flag=false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)<'0'||str.charAt(i)>'9')
				{

				flag=true;
				count=0;
				hold=str.charAt(i);				
				}
			else
			{			  	
			  count=count*10+(str.charAt(i)-48);
			  
			}
			if(flag)
			{
				alphaMap.put(hold, count);
			}
		}
		
		System.out.println(alphaMap);
		
		Set<Character> charSet= alphaMap.keySet();
		
		for(char c:charSet)
		{
			for(int i=0;i<alphaMap.get(c);i++)
			{
				System.out.print(c);
			}
		}
	}
}
