/*Write a function that takes a magic number and a list of numbers. 
 * It returns true if it can insert add or subtract operations in the 
 * list of numbers to get the magic number. Otherwise, it returns false. 

For example: 

f(10, [1,2]) = false. There's no way to add or subtract 1 and 2 to get 10. 
f(2, [1,2,3,4]) = true. 1 + 2 + 3 - 4 = 2. 
f(0, []) = true 
f(1, []) = false 
f(1, [1]) = true 
f(0, [1]) = false*/
public class magic {
	public static int count=0;
public static void main(String[] args) {
	int[] a= {1,2};
	int ans=3;
	//System.out.println(isMgic(ans,a,0,1));
	System.out.println(isMgic(ans,a,0,0));
}

private static boolean isMgic(int ans, int[] arr, int index, int tmp)
{
	System.out.println(tmp);
    if (ans == tmp)
        return true;
	if (arr.length > index)
	{
		//count++;
		//System.out.println(count);
        /*return (isMgic(ans, arr, index + 1, tmp * arr[index])
                | isMgic(ans, arr, index + 1, tmp / arr[index]));*/
		return (isMgic(ans, arr, index + 1, tmp + arr[index])
                | isMgic(ans, arr, index + 1, tmp - arr[index]));
		
	}
    return false;
}
}
