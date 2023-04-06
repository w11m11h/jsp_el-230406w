package dto;

public class Member {
	
	private String mid;
	private String mpw;
	private String mname;
	private int age;
		
	public Member() {
		super();
	}
	public Member(String mid, String mpw, String mname, int age) {
		super();
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.age = age;
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
		this.mpw = mpw;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}