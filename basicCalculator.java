import java.util.*;

public class basicCalculator {
	public static void main(String[] args){
		basic_cal();
	}
	public static void basic_cal(){
		int a, b;
		int Operator;
		System.out.println("-------BASIC CALCULATOR---------- \n Calculation will be done only of 2 numbers ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		a = sc.nextInt();
		System.out.println("Enter Second number : ");
		b = sc.nextInt();

		System.out.println("Type the operation you want to do : \n 1 for DIVISION \n 2 for ADDITION \n 3 for MULTIPLICATION \n 4 for SUBTRACTION \n 5 for REMINDER");
		Operator = sc.nextInt();
		switch (Operator){
			case 1: if (b <= 0) {
				System.out.println("Denominator cannot zero or less than zero");
			} else {
				System.out.println("Result of division : " + (a / b));
			}
			break;

			case 2: System.out.println("Result of addition : " + ( a + b));
			break;

			case 3: System.out.println("Result of multiplication : " + ( a * b));
			break;

			case 4: System.out.println("Result of subtraction : " + ( a - b));
			break;

			case 5: if (b <= 0) {
				System.out.println("Denominator cannot zero or less than zero");
			} else {
				System.out.println("Reminder of division : " + (a % b));
			}
			break;

			default: System.out.println("Invalid Operator /n Please run the program again.......");
			}
		}
	}

