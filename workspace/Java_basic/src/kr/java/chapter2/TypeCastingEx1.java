package kr.java.chapter2;

public class TypeCastingEx1 {

	public static void main(String[] args) {
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		//�Ǽ�
		float f = i;
		double d = f;
		
		//2. ������ Ÿ��ĳ����.
		byte b1 =(byte)256;
		
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		
		System.out.println("b1 = " +b1);

	}

}