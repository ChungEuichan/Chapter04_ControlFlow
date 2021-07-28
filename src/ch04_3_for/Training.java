package ch04_3_for;

public class Training {

	public static void main(String[] args) {
		
//		이거를 if 한번만..
//		int n = 120;
//		if( n >0 && (n%2) ==0) {
//			System.out.println("양수 이면서 짝수");
//			
//		}
		
//		int n =24;
//		
//		if(n >=0 && n <10) {
//			System.out.println("0이상 10 미만의 수");
//			
//		} else if(n >=20 && n <30) {
//			System.out.println("10 이상의 20미만의 수");
//			
//		} else if( n >=20 && n <30) {
//			
//			System.out.println("20이상 30 미만의 수");
//		} else {
//			System.out.println("음수 혹은 30 이상의 수");
//		}
		
//		int n = (int)(Math.random()*100);
//		System.out.println(n);
//		int nu = n / 10;
//		System.out.println(nu);
//		
//		switch(nu) {
//		case 0 :
//			System.out.println("0이상 10 미만의 수");
//			break;
//		case 1 :
//			System.out.println("10이상 20 미만의 수");
//			break;
//		case 2 :
//			System.out.println("20이상 30 미만의 수");
//			break;
//		default :
//			System.out.println("음수 혹은 30 이상의 수");
		
//			while, do~while();
//			1~100 출력하고 거꾸로 100에서~1까지 출력
			
//			int i = 1;
//			while(i<100) {
//				i++;
//				System.out.println(i);
//				
//			} 
//			
//			do { 
//				System.out.println(i--);
//				
//				
//			} while(i>0);
			
//		1000 이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력
//		그 수들의 총합을 출력...
//		(while 문 이용)
		
//			int i = 1;
//			int s = 0;
//		
//			while(i<1000) {
//				i++;
//				
//				if((i%2) == 0 && (i%7) ==0) {
//					System.out.println(i);
//					s += i;
//					
//				}
//				
//			}
//			System.out.println("총합 :"+ s);
			
//			자연수 1부터 시작... 모든 홀수를 더해... 그 합이 언제(몇을 더 했을 때)
//			1000을 넘서는지?, 그리고 100을 넘어선 값은 얼마?
		
		
			int s = 0;
			int i = 1;
			while(true) {
				i++;
					if(i%2 !=0) {	
						s += i;
					}
					if(s >1000) {
						System.out.println(i + "더할 때 1000을 넘습니다");
						System.out.println("초과된 값은: "+s);
						break;
					}
					
				}
				
		
			
		
		
		
		
		
		
		
		
		
	}
}
