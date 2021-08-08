package day09_Method;

import java.util.Scanner;

public class Quiz04Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz04 prime = new Quiz04();
		int num1;
		System.out.println("수 입력: ");
		num1 = input.nextInt();
		int result = prime.primeCheck(num1);
		prime.output(num1, result);

	}

}
