package kr.java.chapter5;

public class ArrayEx1 {

	public static void main(String[] args) {
		//10개 짜리 문자열 배열
		String[] testArray;
		testArray = new String[10];
		
		String[] testArray2 = new String[10];//개수 주기
		String testArray3[] = new String[10];
		
		
		String[] testArray4 = new String[] {"1","2","3","4","5","6","7","8","9","10"};
		
		
		String[] testArray5 = {"1","2","3","4","5","6","7","8","9","10"};
		
		System.out.println("testArray: "+ testArray.length);
		System.out.println("testArray: "+ testArray2.length);
		System.out.println("testArray: "+ testArray3.length);
		System.out.println("testArray: "+ testArray4.length);
		System.out.println("testArray: "+ testArray5.length);
		
		double num[] = {1,2,3,4,5};
		double num2[] = new double[8];
		double[] num3 = new double[30];
		
		System.out.println(num.length);
		System.out.println(num2.length);
		System.out.println(num3.length);
		

	}

}
