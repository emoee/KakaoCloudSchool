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
		System.out.println("이름: " + this.studentName);
	}
	
	public void getStudentNumber() {
		System.out.println("학번: " + this.studentNumber);
	}
	
	public void getTotalScore() {
		this.totalScore = this.kor + this.eng + this.math;
		System.out.println("총점: " + this.totalScore);
	}
	
	public void getScore(String name) {
		if (name == "국어") {
			System.out.println("국어: " + this.kor);
		} else if (name == "수학") {
			System.out.println("수학: " + this.math);
		} else {
			System.out.println("영어: " + this.eng);
		}
	}
	
	public void setScore(String name, int score) {
		if (name == "국어") {
			this.kor = score;
			System.out.println("국어: " + this.kor);
		} else if (name == "수학") {
			this.math= score;
			System.out.println("수학: " + this.math);
		} else {
			this.eng = score;
			System.out.println("영어: " + this.eng);
		}
	}
	
	public void getAll() {
		getStudentNumber();
		getStudentName();
		getTotalScore();
		
		getScore("국어");
		getScore("수학");
		getScore("영어");
	}

}
