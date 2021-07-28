package ch04_3_for;

public class ForMultiplicatiomTableExample {

	public static void main(String[] args) {

		for(int s=2; s<=9; s++) {
			System.out.print("***"+ s + "´Ü*** \t");
		}
			System.out.println("");
			
			for(int n=1; n<=9; n++) {
				for(int j =2; j <=9; j++) {
				System.out.print(j + " x " + n + " = " + (j*n) +  "\t");
				
			}
			
				System.out.println();
		}
		
//		for(int i=1; i<5; i++) {
//			for(int y=1; y<=i; y++) {
//				System.out.print("*");
//				if (i==y) {
//					System.out.println();
//				}
//			} 
//			
//		}
		
		
		
	}

}
