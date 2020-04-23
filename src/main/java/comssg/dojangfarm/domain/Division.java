package comssg.dojangfarm.domain;

import java.util.Date;

public class Division extends Normal{
	private int count;
	private Date Ddate;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getDate() {
		return Ddate;
	}
	public void setDate(Date Ddate) {
		this.Ddate = Ddate;
	}
	
}
