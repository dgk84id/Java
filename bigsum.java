import java.util.*;
public class bigsum {
public static void main(String[] args) {
	/*System.out.println(mul("12345678123456781234567812345678"
			+ "12312345678123456781234567812345678123456781"
			+ "23456781234567812345678123456781234567812345"
			+ "6781234567812345678123456781234567812345678"
			+ "1234567812345678123456781234567845678123456"
			+ "7812345678123456781234567812345678",
			
			"12345678123456781234567812345678123123"
			+ "4567812345678123456781234567812345678"
			+ "12345678123456781234567812345678123456"
			+ "781234567812345678123456781234567812345"
			+ "67812345678123456781234567812345678123456"
			+ "78456781234567812345678123456781234567812345678"));
*/
	System.out.println(mul("1234567890123","2131242142156"));
}
public static String mul(String l, String r) {
    if (l == null || l.equals("0") || r == null || r.equals("0")) {
        return "0";
    }

    boolean isNegative = false;
    if (l.startsWith("-")) {
        isNegative = true;
        l = l.substring(1);
    }

    if (r.startsWith("-")) {
        isNegative ^= true;
        r = r.substring(1);
    }

    int[] result = new int[l.length() + r.length()];
    int resultEnd = result.length - 1;
    int resultIdx = 0;

    for (int rightIdx = r.length() - 1; rightIdx >= 0; rightIdx--) {
        int carry = 0;
        resultIdx = resultEnd;

        for (int leftIdx = l.length() - 1; leftIdx >= 0; leftIdx--) {
            int curr = (l.charAt(leftIdx) - '0') * (r.charAt(rightIdx) - '0')
                    + carry + result[resultIdx];
            result[resultIdx--] = curr % 10;
            carry = curr / 10;
            System.out.println("l="+(l.charAt(leftIdx) - '0')+" r="+(r.charAt(rightIdx) - '0')+" carry="+carry+"result ="+(curr % 10));
        }

        if (carry > 0) {
            result[resultIdx] = carry;
        }
        resultEnd--;
    }

    StringBuilder sb = new StringBuilder();
    if (isNegative) sb.append("-");

    if (result[resultIdx] == 0) resultIdx++;
    for (int i = resultIdx; i < result.length; i++) {
        sb.append(result[i]);
    }

    return sb.toString();
}
}
