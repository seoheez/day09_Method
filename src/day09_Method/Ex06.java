package day09_Method;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Ex06_Method ex = new Ex06_Method();
		ex.display();	
		
		System.out.println("---- main 실행 ----");
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.println("두 수 입력: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		int sum = ex.test(n1, n2);
		ex.printSum(n1, n2, sum);
	}
}
