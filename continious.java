
public class continious {
public static void main(String[] args) {
	int i=293,temp1,sum=0;
	while(i>9)
	{ temp1=i;
		while(temp1!=0)
		{
			sum+=temp1%10;
			temp1=temp1/10;
		}
		i=sum;
		sum=0;
	}
	System.out.println(i);
}
}
