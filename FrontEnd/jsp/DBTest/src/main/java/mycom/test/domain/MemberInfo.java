package mycom.test.domain;

public class MemberInfo {
	private String mid;
	private String mpw;
	private String mname;
	private String memail;
	
	public MemberInfo() {
		
	}
	
	@Override
	public String toString() {
		return "MemberInfo [mid=" + mid + ", mpw=" + mpw + ", mname=" + mname + ", memail=" + memail + "]";
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpw() {
		return mpw;
	}

	public void setMpw(String mpw) {
		// 비밀번호와 같은 경우 보낼 때 검사가 추천이지만 보안을 위해 자바에서 한번 더 검사하는 것도 추천.
		this.mpw = mpw;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

}
