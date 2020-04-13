/*Password Complexity Validation
 * The purpose of choosing a password is to
 * make it as difficult as possible for an intruder
 * to identify your password, whether by guesses or automated attacks.
 * Following rules are advised
 * be at least 8 but no more than 50 characters in length
 * use both UPPER CASE and lower case letters
 * include at least one number
 * punctuation mark (allowed symbols are: ! # $ @ _ + , ? . - );
 * Password Validation Pattern
 * ((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!.#$@_+,?-]).{8,50})
 * Description
 * (					Start of group
 * (?=.*\d)				must contains one digit from 0-9
 * (?=.*[a-z])			must contains one lowercase characters
 * (?=.*[A-Z])			must contains one uppercase characters
 * (?=.*[!.#$@_+,?-])	must contains one special symbols in the list "!.#$@_+,?-"
 * .					match anything with previous condition checking
 * {8,50}				length at least 8 characters and maximum of 50
 * )					End of group
 * 
 * Password Strength Checker Pattern
 * Description
 * [A-Za-z0-9!.#$@_+,?-]{8,50}	Checking valid characters and length for password
 * .*[a-z]+.*					Checking for existence of lower case letter
 * .*[A-Z].*					Checking for existence of upper case letter
 * .*[0-9]+.					Checking for existence of number
 * .*[!.#$@_+,?-]+.*			Checking for existence of symbol
 * 

*
*/
package jul;

import java.util.regex.Pattern;
public class PasswordValidator {
private Pattern pattern;
public static void main(String[] args) {
PasswordValidator validator = new PasswordValidator();
System.out.println(validator.validate("Oxus20.2014")); // true
System.out.println(validator.validate("Oxus.20_14")); // true
System.out.println(validator.validate("OXUS20@Herat")); // true
System.out.println(validator.validate("Oxus20@2014")); // true
System.out.println(validator.validate("Oxus202014")); // false
System.out.println(validator.validate("Oxus20")); // false
System.out.println(validator.validate("Oxus@20")); // false
System.out.println(validator.validate("Oxus20@")); // false


//Your Password is too weak!
System.out.println(PasswordValidator.checkPasswordStrength("1234"));
//Your Password is Normal!
System.out.println(PasswordValidator.checkPasswordStrength("OXUS201234"));
//Your Password is Strong!
System.out.println(PasswordValidator.checkPasswordStrength("OXUS20_2014"));
//Your Password is Very Strong!
System.out.println(PasswordValidator.checkPasswordStrength("Oxus20_2014"));

}
private static final String PASSWORD_PATTERN =
"((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!.#$@_+,?-]).{8,50})";
public PasswordValidator() {
pattern = Pattern.compile(PASSWORD_PATTERN);
}
public boolean validate(final String password) {
return pattern.matcher(password).matches();
}
public static String checkPasswordStrength(String password) {
String msg = "Your Password is too weak!";
int strength = 0;
String lowerCaseCheck = ".*[a-z]+.*";
String upperCaseCheck = ".*[A-Z].*";
String numberExistenceCheck = ".*[0-9]+.*";
String symbolExistenceCheck = ".*[!.#$@_+,?-]+.*";
String validPassword = "[A-Za-z0-9!.#$@_+,?-]{8,50}";
// checking valid characters and length for password
if (password.matches(validPassword)) {
// checking for existence of upper case letter
if (password.matches(upperCaseCheck))
strength += 4;
//checking for existence of lower case letter
if (password.matches(lowerCaseCheck))
strength += 4;
//checking for existence of number
if (password.matches(numberExistenceCheck))
strength += 4;
//checking for existence of symbol
if (password.matches(symbolExistenceCheck))
strength += 4;
if (strength >= 16) {
msg = "Your Password is Very Strong!";
} else if (strength >= 12) {
msg = "Your Password is Strong!";
} else if (strength >= 8) {
msg = "Your Password is Normal!";
} else if (strength >= 4) {
msg = "Your Password is weak!";
} else {
msg = "Your Password is too weak!";
}
}
return msg;
}
}