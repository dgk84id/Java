/*Google 
Given two lowercase strings, S1 and S2, sort S1 in same order as S2. 
If a character in S1 doesn't exist in S2, put them at the end. 
If S1 is "program" and S2 is "grapo", then return "grrapom".
*/
import java.util.*;

public class stringmatching {
public static void main(String[] args) {
System.out.println(mergeStrings("program","pgr"));
}
public static String countingSort(String s1, String s2) {
    Map<Character, Integer> map = new HashMap<>();
    for(char c: s1.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    StringBuilder overlaps = new StringBuilder();
    StringBuilder nonoverlaps = new StringBuilder();
    for(char c: s2.toCharArray()) {
        if(map.containsKey(c)) {
            int count = map.get(c);
            while(count > 0) {
                overlaps.append(c);
                count--;
            }
            map.put(c, 0);
        } else {
            nonoverlaps.append(c);
        }
    }
    overlaps.append(nonoverlaps);
    return overlaps.toString();
}

public static String mergeStrings(String s1, String s2) {
    
    if(s1==null || s2==null){
          return "";
    }

    StringBuilder charMatch = new StringBuilder();
    String charNonMatch = s1;
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s1.toCharArray()) {
    	
         map.put(c, map.getOrDefault(c, 0) + 1);//if it already exists it is incremented to 1
    }
    for (char s2Char : s2.toCharArray()) {
       if (map.containsKey(s2Char)) {
            String s2String = Character.toString(s2Char);
            System.out.println(map.get(s2Char));
            charMatch.append(String.join("",Collections.nCopies(map.get(s2Char),s2String)));
            map.remove(s2Char);
            charNonMatch = charNonMatch.replaceAll(s2String,"");
        }
    }
    return charMatch.append(charNonMatch).toString();
}
}