package ch04_1_if;

public class IfExample {

	public static void main(String[] args) {

//		int s = 99;
//		
//		if(s>=90) {
//			
//			System.out.println("점수가 100점~90점 입니다.");
//			System.out.println("등급은 A 등급입니다.");
//		} else if (s>=80) {
//			System.out.println("점수가 80~89점 입니다.");
//			System.out.println("등급은 B 등급입니다.");
//		} else if (s>=70) {
//			System.out.println("점수가 70~79점 입니다.");
//			System.out.println("등급은 C 등급입니다.");
//		} else if (s>=60) {
//			System.out.println("점수가 60~69점 입니다");
//			System.out.println("등급은 D 등급이니다.");
//			
//		}
		
		int s = 75;
		char g;
//		char g = (s > 90)  ? 'A' : ((s>80) ? 'B' : 'C');
		
		if(s>90) {
			g = 'A';
		} else if(s>= 80 && s <90) {
			g = 'B';
			
		} else if (s>=70 && s < 80) {
			g = 'C';
		} else if (s >= 60 && s < 70) {
			g = 'D';
		} else {
			g= 'F';
		}
	
		
		System.out.println(g);
		
		
		
		
		
		
		
		
		
		
		
	}

}
