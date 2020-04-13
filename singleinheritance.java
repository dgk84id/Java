package test;

public class singleinheritance{

	public static void main(String[] args) {
			int[] id=new int[3];
				id[0]=1;
				id[1]=2;
				id[2]=3;

			char[] code=new char[3];
			code[0]='a';
			code[1]='b';
			code[2]='c';
			String convert;
			for(int loop=0;loop<3;loop++)
			{
				convert=code[loop]+"";
				convert=convert.toUpperCase();
				code[loop]=convert.charAt(0);
				System.out.println(code[loop]+""+id[loop]);
			}
			/*convert=code[0]+"";
			convert=convert.toUpperCase();
			code[0]=convert.charAt(0);	
			convert=code[1]+"";
			convert=convert.toUpperCase();
			code[1]=convert.charAt(0);	
			convert=code[2]+"";
			convert=convert.toUpperCase();
			code[2]=convert.charAt(0);	*/
			
			
			



				int[][] a = new int[3][3];
				
		a[2][2]=2;
		System.out.println(a[2][3]);
	}

}
