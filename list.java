import java.util.*;
public class list {
public static void main(String[] args) {
	Map<String,Integer> m=new HashMap<String,Integer>();
	Scanner s=new Scanner(System.in);
	Scanner s2=new Scanner(System.in);
	for(int i=0;i<8;i++)
	{
		System.out.println("Enter a card:");
		String key=s.nextLine();
		int value=s2.nextInt();
		if(m.containsKey(key)==false)
			m.put(key, value);
			
	}
	for(Map.Entry<String, Integer> e:m.entrySet())
		System.out.println(e.getKey()+" "+e.getValue());
}
}
