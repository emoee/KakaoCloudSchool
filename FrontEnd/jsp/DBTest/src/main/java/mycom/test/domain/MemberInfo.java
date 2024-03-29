package mycom.test.domain;

public class MemberInfo {
	private String memberid;
	private String password;
	private String name;
	private String email;
	
	public MemberInfo() {
		
	}

	@Override
	public String toString() {
		return "MemberInfo [memberid=" + memberid + ", password=" + password + ", name=" + name + ", email=" + email
				+ "]";
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
