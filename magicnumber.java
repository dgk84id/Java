package jul;

public class magicnumber {
public static void main(String[] args) {
	int[] a={1,3,3,4};
	int ans=5;
	System.out.println(isMgic(ans,a,0,0));
}
private static boolean isMgic(int ans, int[] arr, int index, int tmp)
{System.out.println("index= "+index);
System.out.println("temp ="+tmp);
System.out.println();
//System.out.println("arr[index] ="+arr[index]);
	if (ans == tmp)
	{
		System.out.println(tmp);
        return true;
	}
	else if (arr.length > index)
	{
		System.out.println("tmp+arr[index] ="+(tmp+arr[index]));
        return (isMgic(ans, arr, index + 1, tmp + arr[index])| isMgic(ans, arr, index + 1, tmp - arr[index]));
	}
	else
		System.out.println("tmp-arr[index] ="+(tmp-arr[index-1]));
    return false;
}
}
