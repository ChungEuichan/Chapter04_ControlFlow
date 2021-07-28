package ch04_2_switch;

public class SwitchExample {

	public static void main(String[] args) {
		
//		int s = 85;
//		char g;
//		char g = (s > 90)  ? 'A' : ((s>80) ? 'B' : 'C');
		
//		if(s>90) {
//			g = 'A';
//		} else if(s>= 80 && s <90) {
//			g = 'B';
//			
//		} else if (s>=70 && s < 80) {
//			g = 'C';
//		} else if (s >= 60 && s < 70) {
//			g = 'D';
//		} else {
//			g= 'F';
//		}
//		
//		System.out.println(g);
		
		int m = 5;
		switch(m)	{
		
		case 11:
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("어름입니다.");
			break;
		case 9:
		case 10:
			System.out.println("가을입니다.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
