import java.util.Arrays;

public class multi {
public static void main(String[] args) {
	
	int[] a={4,5,9,6,1,3,2,0};
	int leader =a[a.length-1];
	System.out.print(leader);
	for(int i=a.length-1;i>=0;i--)
	{
		if(leader<a[i])
		{
			leader=a[i];
			System.out.print(leader);
		}
	}
	
}
}




