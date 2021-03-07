package com.xworkz.oops.engineer;

import com.xworkz.oops.constants.Branch;

public class Engineer {

	public String USN;
	public  Branch branch= Branch.EC;
	public Engineer() {
		
	}

public  void problemSolving() {
		System.out.println("invoked problem solving");
		System.out.println(this.getBranch());
		
		
	}
	
	
	
	










	public String getUSN() {
		return USN;
	}

	public void setUSN(String uSN) {
		USN = uSN;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	
	
}
