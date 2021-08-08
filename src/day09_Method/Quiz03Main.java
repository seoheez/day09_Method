package day09_Method;

import java.util.Scanner;

public class Quiz03Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Quiz03 multi = new Quiz03();
		int num1;
		System.out.println("수 입력: ");
		num1 = input.nextInt();
		int result = multi.multipleCheck(num1);
		multi.output(num1, result);
	}

}
