package mycom.dept.member;

public class Member {
    public static void main(String[] args) {
		MemberInfo member1 = new MemberInfo("홍길동", 20120212, 3);
		MemberInfo member2 = new MemberInfo("김길동", 20120812, 2);
		MemberInfo member3 = new MemberInfo("이길동", 20130112, 10);
		MemberInfo member4 = new MemberInfo("박길동", 20110912, 11);
		MemberInfo member5 = new MemberInfo("최길동", 20100712, 6);
		MemberInfo member6 = new MemberInfo("한길동", 20120112, 8);

		for (MemberInfo member: MemberInfo.getAllInstances()) {
			member.display();
		}
		
		System.out.println("");
		System.out.println("이달의 최고 회원");
		BestMember.getBestOfMonth();
	}
}
