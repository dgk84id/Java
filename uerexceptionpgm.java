
public class uerexceptionpgm {
public static void main(String[] args) {
	int i=-2;
	try
	{
		if(i<0)
			throw new userexception();
	}
	catch(userexception e)
	{
		System.out.println(e);
	}
}
}
