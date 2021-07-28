package method;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
//			"오버로딩"
//		add(1, 5);	
//		add(11, 55);
//		add(111, 555);
//		
//		add(1.5, 3.1);
		
		showDispaly();
		Scanner scn = new Scanner(System.in);
		
	}
	
	private static void showDispaly() {

		System.out.println("--------MENU--------");
		System.out.println();
		System.out.println("1.계좌등록 2.입금 3.출근 4.종료 \n");
		System.out.println();
	}

	
	private static void add(int i, int j) {
		
		System.out.println(i + j);
		
		
		
		
	}

}
