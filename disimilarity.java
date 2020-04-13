package jul;
import java.util.*;
public class disimilarity {
public static void main(String[] args) {
	Set<Character> s=new TreeSet<Character>();
	Set<Character> s2=new TreeSet<Character>();
	s.add('p');
	s.add('o');
	s.add('t');
	s2.add('p');
	s2.add('a');
	s.add('t');
	s.retainAll(s2);
	s2.retainAll(s);
	System.out.println(s.size());
	System.out.println(s2.size());
}
}
