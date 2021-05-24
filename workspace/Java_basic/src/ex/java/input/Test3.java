package ex.java.input;

public class Test3 {

	public static void main(String[] args) {
		int A = Integer.parseInt(args[0]);
		int B = Integer.parseInt(args[1]);
		
		int div = A/B;
		int rem = A%B;
		System.out.printf("%d / %d = %d ... %d",A,B,div,rem);

	}

}
