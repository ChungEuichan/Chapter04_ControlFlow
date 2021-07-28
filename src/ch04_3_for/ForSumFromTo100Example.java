package ch04_3_for;

public class ForSumFromTo100Example {

	public static void main(String[] args) {
		
		for(int i=0, j=100; i<=50 && j>=50; i++, j--) {
			System.out.println(j);
			
		}
		
		int s = 0;
		
		for(int i=1; i<=100; i++) {
			
			s += i;
		}
		
		System.out.println("1~100 гу:"+ s);
	}

}
