package day09_Method;

import java.util.Scanner;

public class Quiz01Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Quiz01 b = new Quiz01();
		int num1, num2;
		System.out.println("첫 번째 값 입력: ");
		num1 = input.nextInt();
		System.out.println("두 번째 값 입력: ");
		num2 = input.nextInt();
		int result = b.big(num1, num2);
		b.output(num1, num2, result);
	}

}
