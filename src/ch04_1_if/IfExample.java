package ch04_1_if;

public class IfExample {

	public static void main(String[] args) {

//		int s = 99;
//		
//		if(s>=90) {
//			
//			System.out.println("������ 100��~90�� �Դϴ�.");
//			System.out.println("����� A ����Դϴ�.");
//		} else if (s>=80) {
//			System.out.println("������ 80~89�� �Դϴ�.");
//			System.out.println("����� B ����Դϴ�.");
//		} else if (s>=70) {
//			System.out.println("������ 70~79�� �Դϴ�.");
//			System.out.println("����� C ����Դϴ�.");
//		} else if (s>=60) {
//			System.out.println("������ 60~69�� �Դϴ�");
//			System.out.println("����� D ����̴ϴ�.");
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
