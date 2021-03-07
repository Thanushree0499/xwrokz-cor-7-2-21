package com.xworkz.oops;

import com.xworkz.oops.engineer.CsEngineer;
import com.xworkz.oops.engineer.Engineer;

public class VtuTester {

	public static void main(String[] args) {
		
		Engineer engineer=new Engineer();
		engineer.setUSN("12fdsb");
		System.out.println(engineer.getUSN());
		System.out.println(engineer.getBranch());
		engineer.problemSolving();
		
		
		CsEngineer csEngineer=new CsEngineer();
		csEngineer.setUSN("166516jjf");
		System.out.println(csEngineer.getUSN());
		System.out.println(csEngineer.getBranch());
		csEngineer.problemSolving();
		
		Object object=new CsEngineer();
		CsEngineer csEngineer3=(CsEngineer)object;
		csEngineer3.problemSolving();
		
		
		Engineer engineer2=new CsEngineer();
		System.out.println(engineer2.getBranch());
		System.out.println(engineer2.getUSN());
		engineer2.problemSolving();
		
	    CsEngineer csEngineer2=(CsEngineer)engineer2;
		System.out.println(csEngineer2.getBranch());
		csEngineer2.problemSolving();
		
	    Engineer engineer3=(Engineer)engineer2;
		engineer3.getBranch();
		System.out.println(engineer2);
		System.out.println(engineer2.toString());
		System.out.println(engineer2.hashCode());
		
		
	}

}
