package kr.java.chapter8;

public class StudentMain2 {

	public static void main(String[] args) {
		// Student �� ���� ������ ���ؼ� Score Ŭ���� ǥ���Ѵ�
		// � �л��� ����/���� ������ ������ ó���ϵ��� ���ּ���.
		
		//�л�
		Student2 student = new Student2();
		student.studentName = "ȫ�浿";
		student.grade = 3;
//		student.subj = new Score2();
//		student.subj.subject = "����";
//		student.subj.score = 100;
		
		System.out.println(student.toString());
		System.out.println(student.subj.toString());

		
		//���ھ�

	}

}
