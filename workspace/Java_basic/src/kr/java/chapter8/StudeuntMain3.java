package kr.java.chapter8;

public class StudeuntMain3 {

	public static void main(String[] args) {
		// Student2, Score2 �̿�
		// -- subj -> �迭
		
		
		// ȫ�浿/���α�/3, ���� 100, ���� 90
		// ���浿/��������/3, ���� 70, ���� 80
		
		Student2 students[] = new Student2[2];
		// �л� 1
		students[0] = new Student2();
		students[0].studentName = "ȫ�浿";
		students[0].address = "���α�";
		students[0].grade = 3;
		students[0].subj = new Score2[2];
		
		students[0].subj[0] = new Score2();
		students[0].subj[0].subject = "����";
		students[0].subj[0].score = 100;
		students[0].subj[1] = new Score2();
		students[0].subj[1].subject = "����";
		students[0].subj[1].score = 90;
		
		//�л� 2
		students[1] = new Student2();
		students[1].studentName = "���浿";
		students[1].address = "��������";
		students[1].grade = 3;
		students[1].subj = new Score2[2];
		
		students[1].subj[0] = new Score2();
		students[1].subj[0].subject = "����";
		students[1].subj[0].score = 70;
		students[1].subj[1] = new Score2();
		students[1].subj[1].subject = "����";
		students[1].subj[1].score = 80;
		
		
		for(Student2 student : students) {
			System.out.println(student.studentName);
			System.out.println(student.address);
			System.out.println(student.grade);
			System.out.print
			(student.subj[0].subject+" ");
			System.out.println(student.subj[0].score);
			System.out.print(student.subj[1].subject+" ");
			System.out.println(student.subj[1].score);
			System.out.println("--------------");
		}

	}

}