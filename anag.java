package jul;

public class anag {
public static void main(String[] args) {
	String s1="cat";
	String s2="aat";
	String s="12221";
	int flag,uniq=0;;
	for(int i=0;i<s.length();i++)
	{
		flag=0;
		for(int j=0;j<s.length();j++)
		{
			if(i!=j)
			if(s.charAt(i)==s.charAt(j))
			{
				flag=1;
			}
		}
		if(flag==0)
			uniq++;
	}
	System.out.println(uniq);
	
	
	
if(s1.length()==s2.length())
{
	for(int i=0;i<s1.length();i++)
	{
		for(int j=0;j<s2.length();j++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				s1=s1.substring(0, i)+'-'+s1.substring(i+1);
				System.out.println(s1);
				
			}
			
		}
	}
	s1=s1.replaceAll("-", "");
	//System.out.println(s1.length());
	if(s1.length()==0)
		System.out.println("anagram");
	else
		System.out.println("Not an anagram");
		
	

}
}
}
