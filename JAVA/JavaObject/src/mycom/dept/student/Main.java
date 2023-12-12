package mycom.dept.student;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 1, 25, 34, 56);
		student1.getStudentName();
		student1.getTotalScore();
		student1.getScore("영어");
		
		System.out.println();
		System.out.println("--- 수학 점수 변경");
		
		Student student2 = new Student("김길동", 2, 56, 78, 34);
		student2.getStudentName();
		student2.getTotalScore();
		student2.setScore("수학", 90);
		student2.getTotalScore();
		
		System.out.println();
		System.out.println("--- 전체 정보 확인");
		
		Student student3 = new Student("이길동", 3, 78, 56, 78);
		student3.getAll();

	}

}
