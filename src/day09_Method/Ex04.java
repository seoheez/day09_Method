package day09_Method;

public class Ex04 {

	public static void main(String[] args) {
		Ex04_Method ex = new Ex04_Method();
//		int s = ex.sumFunc(10, 20); //인자값(파라미터)
//		System.out.println("두 합: " + s);
		
		int num = 100, su = 200;
		ex.sumFunc(num, su);
		
		ex.test("문자열", 100); 
		//넘겨주는 타입과 받아주는 타입을 똑같이 맞춰야지만 에러가 발생하지 않는다.
//		ex.test02();
	}

}
