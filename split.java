import java.util.Stack;

public class split {
public static void main(String[] args) {
	String ip="   Hello how are you?              ";
	//System.out.println(Integer.toHexString(15));
	//System.out.println(Integer.toBinaryString(15));
	//System.out.println(Integer.toOctalString(15));
	//System.out.println(ip.contains(" "));
	String s="keerthika";
	int q=s.length()/3;
	if(s.length()%3==0)
	{
	//System.out.println(s.substring(0, q));
	//System.out.println(s.substring(q, q+q));
	//System.out.println(s.substring(q+q));
	}
	if(s.length()%3==1)
	{
		//System.out.println(s.substring(0, q));
		//System.out.println(s.substring(q, q+q+1));
		//System.out.println(s.substring(q+q+1));	
	}
	String s2="johny";
	s2=s2.substring(0,2).toUpperCase()+s2.substring(2);
	//System.out.println(s2);
	String s3="123";
	//System.out.println(s3=="123");
	//System.out.println(s3.equals("123"));
	//System.out.println(s3.equals("123"));
	//System.out.println(s3.equalsIgnoreCase("123"));
	s3=s3.concat("o");
	s3=s3.replace("l", "L");
	//System.out.println(s3);
	String s4="hi,hello,how,are,you?";
	String s5[]=s4.split(",");
	for(String z:s5)
	{
		System.out.println(z+":"+z.length());
	}
	String s6=null;
	s6=s4.intern();
	System.out.println(s6.equals(s4));
	System.out.println(s6);
	System.out.println(s6.length());
	System.out.println(s6.indexOf('o'));
	System.out.println(s6.lastIndexOf('o'));
	System.out.println(s6.indexOf("re"));
	System.out.println(s6.indexOf('o', 8));
	s6=s6.toUpperCase();
	System.out.println(s6);
	String s7="     12     ";
	s7=s7.trim();
	System.out.println(Integer.parseInt(s7));
	s7=String.valueOf(5);//convert any datatype to string
	s7=5.5+"";
	System.out.println(s7);
	System.err.println(s7);
}
int disp(int x)
{
	return Math.abs(x)+10;
}
	
	


}
