package mycom.dept.member;

public class Member {
    public static void main(String[] args) {
		MemberInfo member1 = new MemberInfo("ȫ�浿", 20120212, 3);
		MemberInfo member2 = new MemberInfo("��浿", 20120812, 2);
		MemberInfo member3 = new MemberInfo("�̱浿", 20130112, 10);
		MemberInfo member4 = new MemberInfo("�ڱ浿", 20110912, 11);
		MemberInfo member5 = new MemberInfo("�ֱ浿", 20100712, 6);
		MemberInfo member6 = new MemberInfo("�ѱ浿", 20120112, 8);

		for (MemberInfo member: MemberInfo.getAllInstances()) {
			member.display();
		}
		
		System.out.println("");
		System.out.println("�̴��� �ְ� ȸ��");
		BestMember.getBestOfMonth();
	}
}
