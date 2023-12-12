package mycom.dept.student;

public class Student {
	private int studentNumber;
	private String studentName;
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int totalScore = 0;
	
	public Student(String name, int number){
		this.studentName = name;
		this.studentNumber = number;
	}
	
	public Student(String name, int number, int kor, int eng, int math){
		this.studentName = name;
		this.studentNumber = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void getStudentName() {
		System.out.println("�̸�: " + this.studentName);
	}
	
	public void getStudentNumber() {
		System.out.println("�й�: " + this.studentNumber);
	}
	
	public void getTotalScore() {
		this.totalScore = this.kor + this.eng + this.math;
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
