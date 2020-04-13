import java.util.ArrayList;
import java.util.List;

public class mistakennumbers {
    public List<Integer> getNum(int num) {
        List<Integer> mistaken = new ArrayList<Integer>();
        if (num <= 11) {
            return mistaken;
        }
        
        for (int i=12; i <=num ; i++) {
            int flippedNumber = this.flippedNumber(i);
            if (i % 10 != 0 && flippedNumber != i) {
                mistaken.add(i);
            }
        }
        return mistaken;
    }
    
    private int flippedNumber(int number) {
        String currentNumber = String.valueOf(number);
        StringBuffer flippedString = new StringBuffer();
        for (int i= currentNumber.length()-1 ; i >= 0 ;i--) {
            flippedString.append(currentNumber.charAt(i));
        }

        return Integer.valueOf(flippedString.toString());
    }
    
    public static void main(String[] args) {
        mistakennumbers numbers = new mistakennumbers();
        List<Integer> mistaken = numbers.getNum(100);
        System.out.println("running mistaken number");
        for (int n : mistaken) {
            System.out.println(n);
        }
    }
}