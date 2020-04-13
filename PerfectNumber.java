package jul;

public class PerfectNumber {

    public void checkPerfectNumber(int num){
        int divisorSum = 1;
        for(int i = 2; i <= num/2; i++)
            if(num % i == 0)
                divisorSum += i;

        if(divisorSum == num) {
            System.out.print("Given number " + num + " is a perfect number.");
        }else {
            System.out.print("Given number " + num + " is not a perfect number.");
        }
    }

    public static void main(String [] args){
        PerfectNumber perfectNumber = new PerfectNumber();
        perfectNumber.checkPerfectNumber(2);
    }
}

//The . (dot) represents a single character.

