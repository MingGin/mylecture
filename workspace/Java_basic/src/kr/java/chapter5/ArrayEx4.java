package kr.java.chapter5;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		// �л� �̸� ,�й�, ��ġ ������ 100�� ���� �ڷḦ �����Ͻÿ�.
		// ��1) "ȫ�浿, 1020,���α�" --> "ȫ�浿 - 1020 - ���α�"
		// ",", "-" : ������ Delimeter, �и��� Seperator
		
		String[] info = new String[100];
		info[0] = "ȫ�浿, 1020, ���α�";
		info[1] = "ȫ����, 1021, �λ� ���屸";
//		info[2] = "ȫ�浿, 1020, ���α�";

		
		for(int i = 0; i < info.length; i ++)
		{
			String person = info[i];
			String[] data = person.split(",");
			System.out.println("�̸�: " + data[0]
					+ " �й�: " + data[1]
					+ " ��ġ: " + data[2]);
		}
		
		// ��)2
		// �̸� : "ȫ�浿"
		// �й� : 1020
		// ��ġ : ���α�
		
		String[] name = new String[100];
		String[] number = new String[100];
		String[] house = new String[100];
		name[0] = "ȫ�浿"; number[0] = "1020"; house[0] = "�����";
		
		for(int i = 0; i< house.length; i++)
		{
			System.out.println("�̸�: " + name[i]
					+ " �й�: " + number[i]
					+ " ��ġ: " + house[i]);
		}
		
	}

}
