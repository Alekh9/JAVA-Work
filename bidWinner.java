import java.util.*;

public class bidWinner {

	public static void main(String[] args) {
		int a, b, c;
		String winner;
		Scanner sc = new Scanner(System.in);
		System.out.println("1st Friend enter your bid");
		a = sc.nextInt();
		System.out.println("2nd Friend enter your bid");
		b = sc.nextInt();
		System.out.println("3rd Friend enter your bid");
		c = sc.nextInt();
		if (a >= b && a >= c) {
			winner = "1st Friend is winner";
		} else if (b >= a && b >= c) {
			winner = "2nd Friend is winner";
		} else {
			winner = "3rd Friend is winner";
		}
		System.out.printf("Highet bid " + winner);
		/*String winner1 = winner;
		return a > b && a > c ? "1st Friend is winner";
		return b > a && b > c ? "2nd Friend is winner";
		return c > a && c > b ? "3rd Friend is winner";;
		System.out.println(winner1);*/
		// this is ternary operator but not working please tell how to get correct coding for if-else-if
	}
}