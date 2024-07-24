package in.sp.beans;

public class Ad {

	private String hname;
	private String hno;
	
	public void setHname(String hname) {
		this.hname=hname;
	}
	public void setHno(String hno) {
		this.hno=hno;
	}
	@Override
	public String toString() {
		
		return "---->"+hname+"\n-------->"+hno;
	}
}
