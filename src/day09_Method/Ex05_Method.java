package day09_Method;

public class Ex05_Method {

	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public void test(int n) {
		//void는 return값이 없다는 것.
		if(n == 1) {
			System.out.println("if");
		}else {
			System.out.println("else");
			return;
		}	
		System.out.println("test 메소드 종료");
	}
	public String test02() {
//		return " 안녕하세요";
		int num = 1;
		if(num == 1)
			return "111.111";
		else
			return null;
	}
	
	public double test03() {
		return 123.234; //return값과 반환타입을 일치시켜야 한다.
	
	}
	
	

}
