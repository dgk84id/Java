import java.util.*;
public class stck {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		
		st.push(10);
		st.push(20);
		System.out.println(st.indexOf(st.peek()));
		System.out.println(st.size());
		System.out.println(st.lastElement());
		
		
		/*//System.out.println(st.pop());
		//System.out.println(st.pop());
		//System.out.println(st.size());
		//st.get(1);
		for(int i:st)
		{
			System.out.println(i);
		}
		System.out.println(st.isEmpty());
		System.out.println(st.empty());
		System.out.println(st.size());
		//st.clear();
		System.out.println(st.size());
		st.remove(1);
		System.out.println(st.size());
		System.out.println(st.contains(1));
		st.add(1, 2);
	    st.add(3);*/

	}
}
