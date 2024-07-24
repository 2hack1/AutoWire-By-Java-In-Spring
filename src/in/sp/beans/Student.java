package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	@Autowired
	private Ad name;
	private int roll;
	private String email;
	@Autowired
	@Qualifier("create1") //do Sub function main se koi ek ko bnane ke liye mainse(config.java) ((create1 )  do main se koi ek function ka name hai
	private Sub eee;
	
//	public void setName(Ad name) {
//		this.name = name;
//	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public Sub getEee( Sub eee) {
		return eee;
	}

	public void setEee(Sub eee) {
		this.eee = eee;
	}

	public void display() {
		System.out.println("Name"+name);
		System.out.println("Roll"+roll);
		System.out.println("Email"+email);
		System.out.println("Sub"+eee);
	}
	
}
