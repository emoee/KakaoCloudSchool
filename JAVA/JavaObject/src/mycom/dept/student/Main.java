package mycom.dept.student;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("ȫ�浿", 1, 25, 34, 56);
		student1.getStudentName();
		student1.getTotalScore();
		student1.getScore("����");
		
		System.out.println();
		System.out.println("--- ���� ���� ����");
		
		Student student2 = new Student("��浿", 2, 56, 78, 34);
		student2.getStudentName();
		student2.getTotalScore();
		student2.setScore("����", 90);
		student2.getTotalScore();
		
		System.out.println();
		System.out.println("--- ��ü ���� Ȯ��");
		
		Student student3 = new Student("�̱浿", 3, 78, 56, 78);
		student3.getAll();

	}

}
