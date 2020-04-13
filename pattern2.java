package jul;
import java.util.regex.*;

public class pattern2 {
public static void main(String[] args) {
	Pattern p = Pattern.compile("Fi.er");//. represents single character  
	Matcher m = p.matcher("Fixer");  
	boolean b = m.matches();  
	//2nd way  
	boolean b2=Pattern.compile("Fi.er").matcher("Filter").matches();  
	boolean b3=Pattern.compile("Fi.er").matcher("Fiber").matches();
	boolean b4=Pattern.compile("Fi.er").matcher("Fibre").matches();
	//boolean b5=Pattern.compile("Fi.er").matcher("Fixer").matches();
	  
	//3rd way  
	boolean b5 = Pattern.matches("Fi.er", "Fixer");  
	String ip1="Fi_er";
	ip1=ip1.replaceAll('_'+"",'.'+"");
	String[] ip2={"Fixer","Filter","Fiber","Fibre"};
	for(String s:ip2)
	{
		if(Pattern.matches(ip1, s)==true)
			System.out.println(s.toUpperCase());
	}
  
	System.out.println(b+" "+b2+" "+b3+" "+b4+" "+b5);  
}
}
