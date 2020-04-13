package jul;

public class replacestringbasedonindex {
	public static void main(String[] args) {
		String S = "abcd";
		int[] indexes = {0,2};
		String[] sources = {"a","cd"};
		String[] targets = {"eee","ffff"};
		System.out.println(findReplaceString(S,indexes,sources,targets));
	}
	public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
		
        String op=S.replace(S.substring(indexes[0],indexes[0]+1), targets[0]);
        //int length=op.length();
        	op=op.replace(S.substring(indexes[1]+targets.length-2,indexes[1]+1+targets.length-1),targets[1]);
        return op;
    }
}
