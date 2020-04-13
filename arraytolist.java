package day5;
import java.util.*;
public class arraytolist {
	int a=1;
public static void main(String[] args) {
	Integer ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
	// Java program to demonstrate asList()
    // Creates a wrapper list over ar[]
    List<Integer> l1 = Arrays.asList(ar);
    System.out.println(l1);
 // initializing an array original
    int[] org = new int[] {1, 2 ,3};

    System.out.println("Original Array");
    for (int i = 0; i < org.length; i++)
        System.out.print(org[i] + " ");

    // copying array org to copy
    int[] copy = Arrays.copyOf(org, 5);

    // Changing some elements of copy
    copy[3] = 11;
    copy[4] = 55;

    System.out.println("\nNew array copy after modifications:");
    for (int i = 0; i < copy.length; i++)
        System.out.print(copy[i] + " ");
    
    int arr1[] = {1, 2, 3};
    int arr2[] = {1, 2, 3};
    if (arr1 == arr2) // Same as arr1.equals(arr2)
        System.out.println("Same");
    else
        System.out.println("Not same");
    
    int ar1[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
    
    // To fill a range with a particular value
    Arrays.fill(ar1, 0, 3, 0);
    System.out.println("Array filled with 0 "+
      "from 0 to 3 => \n" + Arrays.toString(ar1));

    // To fill complete array with a particular
    // value
    Arrays.fill(ar1, 10);
    System.out.println("Array completely filled"+
              " with 10=>\n"+Arrays.toString(ar1));
    
 // Trying to print array of strings using toString
    String[] strs = new String[] {"practice.geeksforgeeks.org",
                                  "quiz.geeksforgeeks.org"
                                 };
    System.out.println(Arrays.toString(strs));

    // Trying to print multidimensional array using
    // toString
    //toString() works well for single dimensional arrays, 
    //but doesn’t work for multidimensional arrays.
    int[][] mat = new int[2][2];
    mat[0][0] = 99;
    mat[0][1] = 151;
    mat[1][0] = 30;
    mat[1][1] = 50;
    System.out.println(Arrays.toString(mat));
    Integer []  arr11 = {10, 20, 30, 40};
    /*deepToString() works for both single and multidimensional, 
     * but doesn’t work single dimensional array of primitives*/
    System.out.println(Arrays.deepToString(arr11));
    /*int []  ar2 = {10, 20, 30, 40};
    System.out.println(Arrays.deepToString(ar2));*/     
//Compare two arrays
    int arr111[] = {1, 2, 3};
    int arr21[] = {1, 2, 3};
    /*arr1 and arr2 are two references to two different objects. 
     * So when we compare arr1 and arr2, two reference variables are compared,
     * therefore we get the output as “Not Same”*/
    if (arr111 == arr21) // Same as arr1.equals(arr2)
        System.out.println("Same");
    else
        System.out.println("Not same");
    if (Arrays.equals(arr1, arr2))
        System.out.println("Same");
    else
        System.out.println("Not same");
    /*the Arrays.equals() works fine and compares arrays contents.
     * Now the questions, what if the arrays contain arrays inside them 
     * or some other references which refer to different object but have same values.*/
    int inarr1[] = {1, 2, 3};
    int inarr2[] = {1, 2, 3};   
    Object[] rr1 = {inarr1};  // arr1 contains only one element
    Object[] rr2 = {inarr2};  // arr2 also contains only one element
    if (Arrays.equals(rr1, rr2))
        System.out.println("Same");
    else
        System.out.println("Not same");
    /*Arrays.equals() is not able to do deep comparison. 
     * Java provides another method for this Arrays.deepEquals() 
     * which does deep comparison.*/
    if (Arrays.deepEquals(rr1, rr2))
        System.out.println("Same");
    else
        System.out.println("Not same");
    
    
           final int arr[] = {1, 2, 3, 4, 5};  // Note: arr is final
           for (int i = 0; i < arr.length; i++)
           {
               arr[i] = arr[i]*10;  
               System.out.println(arr[i]);          
           }      
    
/*    The array arr is declared as final, but the elements of array 
 * are changed without any problem. Arrays are objects and object variables 
 * are always references in Java. So, when we declare an object variable as final,
 *  it means that the variable cannot be changed to refer to anything else. 
 *  For example, the following program 1 compiles without any error and program fails in compilation.*/

    
        
    
           final arraytolist t = new arraytolist();       
           t.a = 30;
           System.out.println(t.a);   

        arraytolist t2 = new arraytolist();
           t = t2; 
           System.out.println(t.a);      
    
    /*So a final array means that the array variable which is actually 
     * a reference to an object, cannot be changed to refer to anything else,
     *  but the members of array can be modified.*/
    
}
}
