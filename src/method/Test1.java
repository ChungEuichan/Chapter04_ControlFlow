package method;

public class Test1 {

	public static void main(String[] args) {
		
//		두 수의 '차의 절대값'을 계산하여 출력하는 메소드를
//		작성하고 실행하는 코드 작성, 메서드 이름은 : abs
		
		abs(3, 7);
		abs(-5, -3);
		abs(4, -3);
	}

	private static void abs(int i, int j) {
		if (i > j) {
			System.out.println(i - j);
			
		} else {
			System.out.println(j - i);
			
		}
		
	}
	

}
