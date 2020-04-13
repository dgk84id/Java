package jul;

//import java.util.*;

public class RG {
public static void main(String[] args) {
	int[] b={3,2,2,1};
	int temp=0,count=0;
	for(int i=b.length-1;i>=0;i--)
	{
		for(int j=b.length-2;j>0;j--)
		{
			
			if(b[i]<b[j]&&i>j)
			{
				//System.out.println("b[i]= "+b[i]+" b[j]= "+b[j]);
				System.out.println("Before");
				System.out.print("b[i]= "+b[i]+" b[j]= "+b[j]+" i= "+i+" j="+j);
				for(int k:b)
					System.out.print(k);
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				count++;
				System.out.println();
				System.out.print("b[i]= "+b[i]+" b[j]= "+b[j]+" i= "+i+" j="+j);
				System.out.println();
				System.out.println("After");
				for(int k:b)
					System.out.print(k);
				System.out.println();
			}
		}
	}
	for(int i:b)
	{
		System.out.println(i);
	}
	System.out.println("count="+count);
		
	

}
}
