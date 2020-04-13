
public class backspace {
public static void main(String[] args) {
	System.out.println(isStringsSimilar("abc\\b", "ab"));
}
private static boolean isStringsSimilar(String longStr, String shortStr)
{
int longStrIndex = longStr.length()-1;
int shortStrIndex = shortStr.length()-1;


while(longStrIndex >=0 && shortStrIndex >=0)
{
if(longStrIndex > 0 && longStr.charAt(longStrIndex) == 'b' 
&& longStr.charAt(longStrIndex - 1) == new Character('\\'))
{
longStrIndex = longStrIndex -3;
continue;
}
else if(longStrIndex > 1 && longStr.charAt(longStrIndex -1) == 'c' 
&& longStr.charAt(longStrIndex -2) == new Character('\\'))
{
if(Character.toUpperCase(longStr.charAt(longStrIndex)) != shortStr.charAt(shortStrIndex))
{
return false;
}

longStrIndex = longStrIndex -3;
}
else 
{
if(longStr.charAt(longStrIndex) != shortStr.charAt(shortStrIndex))
{
return false; 
}
longStrIndex--;
}
shortStrIndex--;
}

return (longStrIndex < 0 && shortStrIndex < 0);
}
}
