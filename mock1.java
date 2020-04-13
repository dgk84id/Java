package jul;

public class mock1 {
public static void main(String[] args) {
	/*String s1="5964";
	String s2="1872";
	String s3="9643";*/
	int s1=5964,s2=1872,s3=9643;
	//if(s1.charAt(s1.length()-1)>s2.charAt(s2.length()-1)<s3.charAt(s3.length()-1))
	while(s1/10!=0||s2/10!=0||s3/10!=0)
	{
	if(s1%10>s2%10 && s1%10>s3%10 )
	{
		System.out.print(s1%10);
		s1=s1/10;
		//System.out.println(s1);
	}
	else if(s2%10>s1%10 && s2%10>s3%10 )
	{
		System.out.print(s2%10);
		s2=s2/10;
		//System.out.println(s2);
	}
	else if(s3%10>s2%10 && s3%10>s1%10 )
	{
		System.out.print(s3%10);
		s3=s3/10;
		//System.out.println(s3);
	}
	}
	
}
}
