package day09_Method;

public class Quiz01 {
	public int big(int n1, int n2) {
		if(n1 > n2) return n1;
		else return n2;
	}
	public void output(int n1, int n2, int re) {
		System.out.println(n1 + "과 " + n2 + "중 큰수: " + re);
	}

}
