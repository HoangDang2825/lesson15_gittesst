package test;

import java.util.function.BiFunction;

public class Ex01 {
	public static void main(String[] args) {
		int a = 2, b = 3;
		System.out.println("Tong 2 so a b: " + sum(a, b));
		System.out.println("Hieu 2 so a b: " + sub(a, b));
		System.out.println("Tich 2 so a va b: " + tich(a, b));
		lambda();
		check(a);
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sub(int a, int b) {
		return a - b;
	}

	private static void lambda() {
		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		BiFunction<Integer, Integer, Integer> sup = (a, b) -> a - b;
		BiFunction<Integer, Integer, Integer> dev = (a, b) -> a * b;
		BiFunction<Integer, Integer, Integer> mul = (a, b) -> a / b;
	}

	private static int tich(int a, int b) {
		return a / b;
	}

	private static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}
	
	private static void check(int a) {
		if (a % 2 == 0) {
			System.out.println("So chan");
		} else {
			System.out.println("so le");
		}
	}
}
