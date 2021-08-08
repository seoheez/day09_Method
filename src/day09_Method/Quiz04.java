package day09_Method;

public class Quiz04 {
	public int primeCheck(int n1) {
		int cnt = 0;
		for(int i=1; i<=n1; i++) {
			if(n1 % i == 0) 
				cnt++;
		}
		return cnt;
	}
	public void output(int n1, int re) {
		if(re == 2)
			System.out.println(n1 + "은 소수입니다.");
		else
			System.out.println(n1 + "은 소수가 아닙니다.");
	}

}
