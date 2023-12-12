package mycom.dept.student;

public class Student {
	private static int countNumber = 0;
	private int studentNumber;
	private String studentName;
	private int kor;
	private int eng;
	private int math;
	private int totalScore;
	
	public Student(String name){
		countNumber += 1;
		
		this.studentName = name;
		this.studentNumber = countNumber;
	}
	
	public Student(String name, int kor, int eng, int math){
		countNumber += 1;
		
		this.studentNumber = countNumber;
		this.studentName = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotalScore();
	}
	
	public void getStudentName() {
		System.out.println("�̸�: " + this.studentName);
	}
	
	public void getStudentNumber() {
		System.out.println("�й�: " + this.studentNumber);
	}
	
	private void setTotalScore() {
		this.totalScore = this.kor + this.eng + this.math;
	}
	
	public void getTotalScore() {
		setTotalScore();
		System.out.println("����: " + this.totalScore);
	}
	
	public void getScore(String name) {
		if (name == "����") {
			System.out.println("����: " + this.kor);
		} else if (name == "����") {
			System.out.println("����: " + this.math);
		} else {
			System.out.println("����: " + this.eng);
		}
	}
	
	public void setScore(String name, int score) {
		if (score > 0) {
			if (name == "����") {
				this.kor = score;
				System.out.println("����: " + this.kor);
			} else if (name == "����") {
				this.math= score;
				System.out.println("����: " + this.math);
			} else {
				this.eng = score;
				System.out.println("����: " + this.eng);
			}
			setTotalScore();
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
	
	public void getAll() {
		getStudentNumber();
		getStudentName();
		getTotalScore();
		
		getScore("����");
		getScore("����");
		getScore("����");
	}

}
