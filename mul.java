package test;

public class mul {
public static void main(String[] args) {
	int a=2,c=-9;
	int[] b=new int[2];
	
	try
	{
		if(c<0)
			throw new exceptionclass();
	}
	catch(exceptionclass obj)
	{
	System.out.println(obj);		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	
}
}
