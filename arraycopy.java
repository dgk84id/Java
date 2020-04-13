package wiprotrainingmahe;

public class arraycopy {
	public static void main(String[]args)
	{
		int[]a={1,2,3};
		int[]b=new int[a.length];
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[i];
		}
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		int[]c=a.clone();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);	
		}
		int []d=new int[a.length];
		System.arraycopy(a, 0, d, 0, 3);
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
	}

}
