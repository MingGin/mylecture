package kr.java.chapter2;

public class BooleanEx {

	public static void main(String[] args) {
		boolean b1 = false;
		boolean b2 = true;
		
		System.out.println("Is true: " + true);
		System.out.println("Is false: " + false);
		
		b1 = b2;
		System.out.println("b1: " + b1);
		
		
		// 값 변경이 안되는 식별자! (변수) => 상수 Constant
		// 값이 미리보기 사전에 선언을 하고 사용하는 목적!
		
//		final double PI = 3.14;
//		final double PI2 = 3.14;
		
		char a = '\uAE00';
		
		System.out.println(a);


	}

}
