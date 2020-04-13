package jul;

public class nam {
public static void main(String[] args) {
	String input1="9900114279";
	System.out.println(input1.length());
	StringBuilder sb=new StringBuilder();
	boolean even=false;
	int sum=input1.charAt(0)-'0';
	for(int i=1;i<input1.length();i++)
	{
		
		if(sum%2!=0)
		{ System.out.println("odd and i="+i);
			while(sum%2!=0 && i<input1.length())
			{
				//System.out.println(i);
				System.out.println(input1.charAt(i)-'0');
		        sum+=input1.charAt(i)-'0';
		        i++;
			}
			//sb.append(sum);
			System.out.println(sum);
			//i--;
			//sum=0;
		}
		
		else if(sum%2==0 )
		{ System.out.println("Even");
			System.out.println();
			while(sum%2==0 && i<input1.length())
			{
				//System.out.println(i);
				System.out.println(input1.charAt(i)-'0');
		        sum+=input1.charAt(i)-'0';
		        i++;
			}
			//sb.append(sum);
			System.out.println(sum);
			//i--;
			//sum=0;
		}
		sb.append(sum);
		if(i<input1.length())
		{
		sum=input1.charAt(i)-'0';
		}
		
		System.out.println("new sum="+sum);
		//sb.append(sum);
		
	}
	System.out.println(sb.toString());
}
}
