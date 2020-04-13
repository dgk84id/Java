/*Character Classes
Character Class  Explanation and Alternatives
.    Match any character (may or may not match line terminators)
\d   Matches a digit, is an alternative for: [0-9]
\D   Matches a non-digit character, is an alternative for: [^0-9]
\s   Matches a whitespace character, is an alternative for:
	 [ \t\n\x0B\f\r]
\S   Matches a non-whitespace character, is an alternative for: [^\s]
\w   Match a word character, is an alternative for: [a-zA-Z_0-9]
\W   Match a non-word character, is an alternative for: [^\w]



Quantifiers Explanation and Alternatives
*	   Match zero or more times, is an alternative for {0,}
+	   Match one or more times, is an alternative for {1,}
?	   Match no or one times, ? is an alternative for {0,1}
{n}    Match exactly n number of times
{n,}   Match at least n times,
{n,m}  Match at least n but not more than m times
       
Quantifiers can be used to specify the number or length that part of a pattern should match or repeat.


Meta Characters  	Explanation
\					Escape the next meta-character (it becomes a normal / literal character)
^					Match the beginning of the line
.					Match any character (except newline)
$					Match the end of the line (or before newline at the end)
|					Alternation for ('or' statement)
()					Grouping
[]					Custom character class

Meta-characters are used to group, divide, and perform special operations in patterns.

*/
package jul;

import java.util.regex.*;

public class regular {
public static void main(String[] args) {
		System.out.println("I study English".matches("I study \\w+")); // true
		System.out.println("I study Programming".matches("I study \\w+")); // true
		System.out.println("I study JAVA".matches("I study \\w+")); // true
		System.out.println("I study: JAVA".matches("I study \\w+")); // false
		
		System.out.println("I study English".matches("I study [a-zA-Z_0-9]+")); // true
		System.out.println("I study Programming".matches("I study [a-zA-Z_0-9]+")); // true
		System.out.println("I study JAVA".matches("I study [a-zA-Z_0-9]+")); // true
		System.out.println("I study: JAVA".matches("I study [a-zA-Z_0-9]+")); // false
		
		System.out.println("I study English".matches("I study:? \\w+")); // true
		/*If we want the expression to be able to handle this situation 
		 * does not care about the case sensitivity then we need to make a small change as follow:
		   "(?i)I study \\w+"
		   */
		System.out.println("I study English".matches("(?i)I study \\w+")); // true
		System.out.println("i STUDY English".matches("(?i)I study \\w+")); // true
		
		/*The following two meta-characters are core parts of flexible Regular Expressions
		| Alternation ('or' statement)
		() Grouping*/
		
		String pattern = "I study (Java|English|Programming|Math|Islamic|HTML)";
		System.out.println("I study English".matches(pattern)); // true
		System.out.println("I study Programming".matches(pattern)); // true
		System.out.println("I study Islamic".matches(pattern)); // true
		/* Regular Expressions make it possible to find all instances of text 
		 * that match a certain pattern, and return a 
		 * Boolean value if the pattern is found / not found.
		 * This can be used to validate user input such as
		   Phone Numbers
           Social Security Numbers (SSN)
           Email Addresses
           Web Form Input Data
		 * */
		String pattern1 = "^(\\d{3}-?\\d{2}-?\\d{4})$";
		
		/*Regular Expression  	Meaning
		^						match the beginning of the line
		() 						group everything within the parenthesis as group 1
		\d{3}					match only 3 digits
		-?						optionally match a dash
		\d{2}					match only 2 digits
		-?						optionally match a dash
		\d{4}					match only 4 digits
		$						match the end of the line*/
		
		String input[] = new String[5];
		input[0] = "123-45-6789";
		input[1] = "9876-5-4321";
		input[2] = "987-650-4321";
		input[3] = "987-65-4321 ";
		input[4] = "321-54-9876";
		for (int i = 0; i < input.length; i++) {
		if (input[i].matches(pattern1)) {
		System.out.println("Found correct SSN: " + input[i]);
		}
		}
		/*Capturing groups are an extremely useful feature
		 * of Regular Expression matching that allow us to 
		 * query the Matcher to find out what the part of the string
		 *  was that matched against a particular part of the regular expression.
		 *  Consider you have a large complex body of text
		 *  (with an unspecified number of numbers) and
		 *  you would like to extract all the numbers.
	     */
		String text = "Person with university ID of 20120 "
				+ "is trying to access the server for OXUS20 member's data in less than 10 seconds.";
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(text);
		while (m.find()) {
		System.out.println(m.group());
		}
		
		String text1 = "my mail id is abc@gmail.com"
				+ " and m friends mail id is  on xyz123@gmail.com";
		String pattern11 = "[A-Za-z0-9-_]+(\\.[A-Za-z0-9-_]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
		Pattern p1 = Pattern.compile(pattern11);
		Matcher m1 = p1.matcher(text1);
		while (m1.find()) {
		System.out.println(m1.group());
		}
		/*Modifying / Substitution
		 * Values in String can be replaced with new values
		 * For example, you could replace all instances 
		 * of the word 'StudentID=', followed by an ID, 
		 * with a mask to hide the original ID.
		 * This can be a useful method of filtering sensitive information.*/
		String text11 = "Three student with StudentID=20120, StudentID=20121 and finally StudentID=20122.";
		Pattern p11 = Pattern.compile("(StudentID=)([0-9]+)");
		Matcher m11 = p11.matcher(text11);
		StringBuffer result = new StringBuffer();
		while (m11.find()) {
		System.out.println("Masking: " + m11.group(2));
		m11.appendReplacement(result, m11.group(1) + "***masked***");
		}
		m11.appendTail(result);
		System.out.println(result);
		
		
		
		}
}
