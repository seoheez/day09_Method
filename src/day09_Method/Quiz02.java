package day09_Method;

import java.util.Scanner;

public class Quiz02 {
	public void print() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력: ");
		num = input.nextInt();

//		String s = op(num);
//		scan(s);

		int result = op(num);
		scan(result);

	}
	public void scan(int r) {
		if(r==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

	}
	public int op(int num) {
		if(num%2 == 0) {
//			System.out.println("짝수");
//			return "짝수";
			return 0;
			
		}else {
//			System.out.println("홀수");
//			return "홀수";
			return 1;
		}

	}
	public void scan(String result) {
			System.out.println(result);


	}

}
