package day09_Method;

public class Quiz05 {

	public int absoluteCheck(int n1) {
		if(n1 < 0) return -n1;
		else return n1;
		
	}
	public void output(int n1, int re) {
		System.out.println(n1 + "의 절대값은 " + re + "입니다.");
	}
}
