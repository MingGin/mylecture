package ex.java.input;

public class Test2 {

	public static void main(String[] args) {
		
		int A = Integer.parseInt(args[0]);
		int B = Integer.parseInt(args[1]);
		
		A = A+100;
		B = B%10;
		System.out.println(A);
		System.out.println(B);
	
	}

}
