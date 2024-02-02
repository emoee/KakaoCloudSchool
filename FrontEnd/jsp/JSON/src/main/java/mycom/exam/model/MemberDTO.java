package mycom.exam.model;

public class MemberDTO {
	private String name;
	private String email;
	private String phone;
	
	public MemberDTO(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
}
