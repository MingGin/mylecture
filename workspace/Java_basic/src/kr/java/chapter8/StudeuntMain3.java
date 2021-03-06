package kr.java.chapter8;

public class StudeuntMain3 {

	public static void main(String[] args) {
		// Student2, Score2 이용
		// -- subj -> 배열
		
		
		// 홍길동/구로구/3, 수학 100, 국어 90
		// 고길동/영등포구/3, 수학 70, 국어 80
		
		Student2 students[] = new Student2[2];
		// 학생 1
		students[0] = new Student2();
		students[0].studentName = "홍길동";
		students[0].address = "구로구";
		students[0].grade = 3;
		students[0].subj = new Score2[2];
		
		students[0].subj[0] = new Score2();
		students[0].subj[0].subject = "수학";
		students[0].subj[0].score = 100;
		students[0].subj[1] = new Score2();
		students[0].subj[1].subject = "국어";
		students[0].subj[1].score = 90;
		
		//학생 2
		students[1] = new Student2();
		students[1].studentName = "고길동";
		students[1].address = "영등포구";
		students[1].grade = 3;
		students[1].subj = new Score2[2];
		
		students[1].subj[0] = new Score2();
		students[1].subj[0].subject = "수학";
		students[1].subj[0].score = 70;
		students[1].subj[1] = new Score2();
		students[1].subj[1].subject = "국어";
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
