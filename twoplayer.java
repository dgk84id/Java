package jul;

public class twoplayer {
public static void main(String[] args) {
determineWinner(4,2);	
}
public static void determineWinner(int c1, int c2){
	if ((c1<=0) || (c2<=0) || (c1==c2)){
		System.out.println("Bad input arguments");
		return;
	}
	
	if ((c1 % 3 == 0) || ((c1>3) && ((c1-2) % 3 ==0)) || 
		(c2 % 3 == 0) || ((c2>3) && ((c2-2) % 3 ==0))){
		System.out.println("Starting player wins.");
	}
	else {
		System.out.println("Starting player loses.");
	}
}
}
