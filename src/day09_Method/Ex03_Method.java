package day09_Method;

import java.util.Scanner;

public class Ex03_Method {
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num, su, sum;
		System.out.println("첫 수 입력: ");
		num = input.nextInt();
		System.out.println("두 수 입력: ");
		su = input.nextInt();
		sum = num + su;
		System.out.println("두 합: " + sum);
				
	}
}
