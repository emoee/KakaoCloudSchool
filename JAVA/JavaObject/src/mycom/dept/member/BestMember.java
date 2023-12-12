package mycom.dept.member;

public class BestMember {

    public static void getBestOfMonth(){
    	int count = MemberInfo.idCount;
    	int maxPoint = 0;
    	MemberInfo bestMember = null;

    	for (MemberInfo member : MemberInfo.getAllInstances()) {
    		if (maxPoint < member.getMemberPoint()) {
    			maxPoint = member.getMemberPoint();
    			bestMember = member;
    		}
    	}
    	bestMember.addMemberPoint(10000);
    	bestMember.display();
    }

}
