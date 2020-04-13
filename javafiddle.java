package jul;

import java.util.regex.*;  
public class javafiddle
{
  public static void main(String[] args)
  {
    String[] arr = {"ache", "slow", "torn", "slum", "boom", "rival", "wrong", "cholera", "revenge", "arrogant", "papa", "book", "home", "cars", "jolly", "sugar", "friend", "mother", "father", "bloomiest"};
    for(int i =0; i < arr.length; i++) {
        System.out.println(arr[i] + ": " + test(arr[i]));
    }
    
  }
  
  public static String test(String str) {
      Pattern p = Pattern.compile("^[atrw].*|^sl|boom|^ch");
      Matcher m = p.matcher(str);
      return m.find() ? "Bad" : "Good";
  }
}
