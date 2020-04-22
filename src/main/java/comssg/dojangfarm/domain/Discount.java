package comssg.dojangfarm.domain;

import java.util.Date;

public class Discount {
	private int dRate;
	private Date dStartDate; 
	
	public int getdRate() {
		return dRate;
	}
	public void setdRate(int dRate) {
		this.dRate = dRate;
	}
	public Date getdStartDate() {
		return dStartDate;
	}
	public void setdStartDate(Date dStartDate) {
		this.dStartDate = dStartDate;
	}
	
}
