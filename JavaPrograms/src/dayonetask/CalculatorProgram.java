package dayonetask;

import java.util.Scanner;

public class CalculatorProgram {
	public static void main(String[] args) {
		double num1, num2;
		num1 = 12;
		System.out.println(num1);
		num2 = 4.0;
		System.out.println(num2);
		char operator = '+';
        double output;
        switch (operator) {
		case '+':
			output = num1 + num2;
			break;

		case '-':
			output = num1 - num2;
			break;

		case '*':
			output = num1 * num2;
			break;

		case '/':
			output = num1 / num2;
			break;

		default:
			System.out.print("You have entered wrong operator");
			return;
		}

		System.out.println(num1 + " " + operator + " " + num2 + ": " + output);
	}
}
