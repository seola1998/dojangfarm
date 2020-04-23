package comssg.dojangfarm.domain;

public class CommonNotice {
	private int CNNo;
	private int userNo;
	
	private String userName;
	private String CNTitle;
	private String CNinfo;
	
	public int getCNNo() {
		return CNNo;
	}
	public void setCNNo(int cNNo) {
		CNNo = cNNo;
	}
	public String getCNTitle() {
		return CNTitle;
	}
	public void setCNTitle(String cNTitle) {
		CNTitle = cNTitle;
	}
	public String getCNinfo() {
		return CNinfo;
	}
	public void setCNinfo(String cNinfo) {
		CNinfo = cNinfo;
	}

	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
