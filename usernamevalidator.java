/*Common pattern for username that is widely use is as follow:
3 to 15 characters in length
with any lower case character, 
digit or special symbol underscore "_", 
hyphen "-" and dot "." only.

Username Validation Pattern
^[a-z0-9._-]{3,15}$


Description
^			Start of the line
[a-z0-9._-]	Match characters and symbols in the list, a-z, 0-9, underscore, hyphen and dot.
{3,15}		Minimum 3 characters and maximum of 15 of characters in length
$			End of the line
*/
package jul;
import java.util.regex.Pattern;
public class usernamevalidator {
	private Pattern pattern;
	private static final String USERNAME_PATTERN = "^[a-z0-9._-]{3,15}$";
	public usernamevalidator() {
	pattern = Pattern.compile(USERNAME_PATTERN);
	}
	
	public static void main(String[] args) {
		usernamevalidator validator = new usernamevalidator();
		System.out.println(validator.validate("absherzad")); //true
		System.out.println(validator.validate("ab.sherzad")); //true
		System.out.println(validator.validate("ab-sherzad")); //true
		System.out.println(validator.validate("ab_sherzad")); //true
		System.out.println(validator.validate("oxus20")); //true
		System.out.println(validator.validate("ars")); //true
		System.out.println(validator.validate("Abc")); //false
		System.out.println(validator.validate("abh")); //true
		System.out.println(validator.validate("ab")); //false
		System.out.println(validator.validate("abdsfhkjsdfljslfjksd")); //false
		}
	public boolean validate(final String username) {
	return pattern.matcher(username).matches();
	}
}
