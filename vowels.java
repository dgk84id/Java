import java.util.*;

public class vowels {
	int i;
	   public static void main(String[] args)
	    {
	        /*String input="aeiheljildsfofd";
	        String output = input.replaceAll("[AEIOUaeiou]", "");
	        System.out.println("The string without vowels...");
	        System.out.println(output);*/
	        vowels obj=new vowels();
	        int[] a={1,3,4,5,6,7,8};
	        int[] b=new int[a.length];
	        //b=obj.disp(a, b);
	        //b=a;
	        b=Arrays.copyOfRange(a,2,4);
	        
	        //for(int i:b)
	        	//System.out.println(i);
	        Arrays.sort(a);
	        //String res=Arrays.binarySearch(a, 77)>=0?"Found":"Not found";
	        System.out.println(Arrays.binarySearch(a, 77)>=0?"Found":"Not found");
	        
	       
	    }
	   int[] disp(int[] x,int[] y)
	   {
		   for(int i=0;i<x.length;i++)
			   y[i]=x[i]+10;
		   return y;
	   }
	}