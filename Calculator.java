package basicCalculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		char operator;
		double answer = 0.0;

		Scanner scanObject = new Scanner(System.in);

		System.out.println("Enter First Number:");
		num1 = scanObject.nextInt();

		System.out.println("Enter Second Number:");
		num2 = scanObject.nextInt();

		System.out.println("Enter Operation:");
		operator = scanObject.next().charAt(0);

		switch(operator) {

		case '+':
			answer = add((float)num1,(float)num2);
			break;
		case '-':
			answer = sub((float)num1,(float)num2);
			break;

		case 'x':
			answer = mult((float)num1, (float)num2);
			break;

		case '/':
			answer = div((float)num1,(float)num2);
			break;
		case '^':
			answer = power((float)num1, num2);
			break;
		case '!':
			answer  = fact(num1);
			break;
		}

		//Formats output in console
		if(operator != '!') {
		System.out.println(num1 + " " + operator + " "+ num2 + " = " + answer);
		}else {
			System.out.println(num1 + "! = " + answer);
		}


	}

	//HELPER FUNCTIONS
	public static float add(float x,float y) {
		float result = x+y;
		return result;
	}

	public static float sub(float x, float y) {
		float result = x-y;
		return result;
	}

	public static float mult(float x, float y) {
		float result = x*y;
		return result;
	}

	public static float div(float x,float y) {
		float result = x/y;
		return result;
	}
	public static float power(float x, int y) {
		float result = 1;
		int i = 1;
		while(i != y+1) {
			result = result*x;
			i++;
		}
		return result;
	}

	public static int fact(int x) {
		if(x == 1) {
			return 1;
		}else{
			return x *fact(x-1);
		}
	}

}
