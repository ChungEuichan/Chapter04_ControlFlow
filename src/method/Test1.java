package method;

public class Test1 {

	public static void main(String[] args) {
		
//		�� ���� '���� ���밪'�� ����Ͽ� ����ϴ� �޼ҵ带
//		�ۼ��ϰ� �����ϴ� �ڵ� �ۼ�, �޼��� �̸��� : abs
		
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
