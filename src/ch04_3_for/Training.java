package ch04_3_for;

public class Training {

	public static void main(String[] args) {
		
//		�̰Ÿ� if �ѹ���..
//		int n = 120;
//		if( n >0 && (n%2) ==0) {
//			System.out.println("��� �̸鼭 ¦��");
//			
//		}
		
//		int n =24;
//		
//		if(n >=0 && n <10) {
//			System.out.println("0�̻� 10 �̸��� ��");
//			
//		} else if(n >=20 && n <30) {
//			System.out.println("10 �̻��� 20�̸��� ��");
//			
//		} else if( n >=20 && n <30) {
//			
//			System.out.println("20�̻� 30 �̸��� ��");
//		} else {
//			System.out.println("���� Ȥ�� 30 �̻��� ��");
//		}
		
//		int n = (int)(Math.random()*100);
//		System.out.println(n);
//		int nu = n / 10;
//		System.out.println(nu);
//		
//		switch(nu) {
//		case 0 :
//			System.out.println("0�̻� 10 �̸��� ��");
//			break;
//		case 1 :
//			System.out.println("10�̻� 20 �̸��� ��");
//			break;
//		case 2 :
//			System.out.println("20�̻� 30 �̸��� ��");
//			break;
//		default :
//			System.out.println("���� Ȥ�� 30 �̻��� ��");
		
//			while, do~while();
//			1~100 ����ϰ� �Ųٷ� 100����~1���� ���
			
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
			
//		1000 ���� �ڿ��� �߿��� 2�� ������� 7�� ����� ���� ���
//		�� ������ ������ ���...
//		(while �� �̿�)
		
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
//			System.out.println("���� :"+ s);
			
//			�ڿ��� 1���� ����... ��� Ȧ���� ����... �� ���� ����(���� �� ���� ��)
//			1000�� �Ѽ�����?, �׸��� 100�� �Ѿ ���� ��?
		
		
			int s = 0;
			int i = 1;
			while(true) {
				i++;
					if(i%2 !=0) {	
						s += i;
					}
					if(s >1000) {
						System.out.println(i + "���� �� 1000�� �ѽ��ϴ�");
						System.out.println("�ʰ��� ����: "+s);
						break;
					}
					
				}
				
		
			
		
		
		
		
		
		
		
		
		
	}
}
