package mycom.dept.member;

import java.util.ArrayList;
import java.util.List;

public class MemberInfo {
	public static int idCount;
    private int memberId;
    private String memberName;
    private int joinDate;
    private int purchaseCount;
    private String memberLevel;
    private int memberPoint;
    private static List<MemberInfo> allInstances = new ArrayList<>();

    public MemberInfo(String name, int date, int count) {
    	this.idCount += 1;
    	this.memberId = idCount;
    	this.memberName = name;
    	this.joinDate = date;
    	this.purchaseCount = count;
    	caluateMemberPoint();
    	setMemberLevel();
    	allInstances.add(this);
    }
    
    public void display() {
    	System.out.println("ID: " + this.memberId + " 이름: " + this.memberName + " 회원등급: " + this.memberLevel + " 포인트: " + this.memberPoint);
    }
    
    private void caluateMemberPoint(){
    	if (this.purchaseCount > 9) {
    		this.memberPoint = this.purchaseCount * 100;
    	} else if (this.purchaseCount > 4) {
    		this.memberPoint = this.purchaseCount * 50;
    	} else if (this.purchaseCount > 2) {
    		this.memberPoint = this.purchaseCount * 30;
    	} else {
    		this.memberPoint = this.purchaseCount * 20;
    	}
    }

    private void setMemberLevel(){
    	if (this.memberPoint > 499) {
    		this.memberLevel = "VVIP";
    	} else if (this.memberPoint > 299) {
    		this.memberLevel = "VIP";
    	} else if (this.memberPoint > 99) {
    		this.memberLevel = "Gold";
    	} else {
    		this.memberLevel = "Family";
    	}
    }

    public void addMemberPoint(int point){
    	this.memberPoint += point;
    	setMemberLevel();
    }
    
    public int getMemberPoint() {
    	return this.memberPoint;
    }
    
    public static List<MemberInfo> getAllInstances() {
        return allInstances;
    }
}
