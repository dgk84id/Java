package wiprotrainingmahe;

import java.util.Scanner;
class twodarrayscanner{
public static void main(String[] args)
      {
	int [][] a=new int [3][];
	Scanner s=new Scanner(System.in);
	 a[0]=new int[3];
	 a[1]=new int [5];
	 a[2]=new int [4];
	 for (int i = 0; i < a.length; i++) 
	 { int n=i+1;
		 System.out.println("Enter the values of row "+n);
		for (int j = 0; j < a[i].length; j++) 
		{
			a[i][j]=s.nextInt();	
		}
	}
	 for (int i = 0; i < a.length; i++) {
		 for (int j = 0; j < a[i].length; j++) {
			 System.out.print(a[i][j]+"  ");
		}
		System.out.println();
	}

}}
