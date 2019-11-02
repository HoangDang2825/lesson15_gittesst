package test;

public class Ex01 {
	public static void main(String[] args) {
		int a = 2, b = 3;
		System.out.println("Tong 2 so a b: "+sum(a, b));
		System.out.println("Hieu 2 so a b: "+sub(a, b));
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int sub(int a, int b) {
		return a - b;
	}
}
