package com.xworkz.oops.engineer;

import com.xworkz.oops.constants.Branch;

public class CsEngineer extends Engineer {

public Branch branch=Branch.CS;


	
public void problemSolving() {
	System.out.println("invoked problem solving by cs");
	System.out.println(this.getBranch());
	
}

public Branch getBranch() {
	return branch;
}

public void setBranch(Branch branch) {
	this.branch = branch;
}
	

}
