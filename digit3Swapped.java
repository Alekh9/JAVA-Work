import java.util.*;

public class digit3Swapped {
	public static void main(String[] args){
	checkDigitAndSwapped();
	}
	public static void checkDigitAndSwapped() {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a three digit integer and I will check whether given number is of 3 digits or not and if it of 3 digits, I will swap the first and third digits");
		System.out.println("Enter 3 digit number from 100 to 999 : ");
		number = sc.nextInt();
		if (number >= 100 && number <= 999) {
			int digit1 = number / 100;
			int digit2 = (number % 100) / 10;
			int digit3 = number % 10;
			System.out.print(digit3);
			System.out.print(digit2);
			System.out.print(digit1);
		} else if (number >= -999 && number <= -100) {
			int negativeVal = number;
			int positiveVal = ~(negativeVal - 1);
			int digit1 = positiveVal / 100;
			int digit2 = (positiveVal % 100) / 10;
			int digit3 = positiveVal % 10;
			int negdigit3 = ~(digit3 - 1);
			for (int i : new int[]{negdigit3, digit2, digit1}) {
				System.out.print(i);
			}
		} else {
			System.out.println("Run again and Please enter only 3 digits number");
		}
	}
}

