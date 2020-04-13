import java.util.*;
public class coll {
public static void main(String[] args) {
	List<Integer> l = new ArrayList<Integer>();
	l.add(1);
	l.add(2);
	l.add(0, 10);
	System.out.println(l.contains(2));
	System.out.println(l.toString());
	Collections.sort(l);
	System.out.println(l.toString());
	System.out.println(Collections.max(l));
	System.out.println(Collections.min(l));
	Collections.rotate(l, 2);
	System.out.println("rotated "+l.toString());
	Collections.swap(l, 1, 2);
	System.out.println("swapped "+l.toString());
	Collections.reverse(l);
	System.out.println(l.toString());
	Collections.binarySearch(l, 2);
	List<Integer> l2=new ArrayList<Integer>();
	l2.add(4);
	l2.add(5);
	l.addAll(l2);
	System.out.println(l.toString());
	for(int i: l)
		System.out.println(i);
	
	List<Integer> ll = new LinkedList<Integer>();
	ll.add(1);
	ll.add(2);
	ll.add(3);
	System.out.println(ll.contains(3));
	for(int i: ll)
		System.out.println(i);
	
	Set<Integer> s= new HashSet<Integer>();
	s.add(1);
	s.add(2);
	s.add(3);
	
	System.out.println(s.contains(3));
	System.out.println(s.toString());
	for(int i: s)
		System.out.println(i);
	
	Map<Character,Integer> m= new TreeMap<Character,Integer>();
	m.put('c', 1);
	m.put('b', 3);
	m.put('a', 2);
	m.put('a', 6);
	System.out.println(m.containsKey('a'));
	System.out.println(m.containsValue(3));
	System.out.println(m.toString());
	for(Map.Entry<Character, Integer> e: m.entrySet())
		System.out.println(e.getKey()+":"+e.getValue());
}
}
