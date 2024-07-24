package in.sp.beans;

import java.util.List;

public class Sub {

	private List<String>sub;

	public List<String> getSub() {
		return sub;
	}

	public void setSub(List<String> sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Sub [sub=" + sub + "]";
	}
	
	
}
