import java.util.Scanner;
public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("How many times would you like the coin to be flipped?");
		int coins=in.nextInt();
		int heads=0;
		int tails=0;
	Double x;
	for (int i=0;i<coins;i++){
		x=Math.random();
		if (x<0.5){
			tails++;
			System.out.print("T");
		}else if (x>0.5){
			heads++;
			System.out.print("H");
		}
	}
	System.out.println("");
		System.out.println("You had "+heads+ " heads and "+tails+" tails.");
		}
	
	
}



