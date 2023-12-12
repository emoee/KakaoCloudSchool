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
		System.out.println("이름: " + this.studentName);
	}
	
	public void getStudentNumber() {
		System.out.println("학번: " + this.studentNumber);
	}
	
	private void setTotalScore() {
		this.totalScore = this.kor + this.eng + this.math;
	}
	
	public void getTotalScore() {
		setTotalScore();
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
		if (score > 0) {
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
			setTotalScore();
		} else {
			System.out.println("잘못된 입력입니다.");
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
