package day09_Method;

import java.util.Scanner;

public class Quiz05Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Quiz05 absolute = new Quiz05();
		int num1;
		System.out.println("수 입력: ");
		num1 = input.nextInt();
		int result = absolute.absoluteCheck(num1);
		absolute.output(num1, result);
		
	}

}
