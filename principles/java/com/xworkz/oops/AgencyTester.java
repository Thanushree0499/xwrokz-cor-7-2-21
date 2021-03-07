package com.xworkz.oops;

import java.io.Serializable;

import com.xworkz.oops.agency.TravelAgency;
import com.xworkz.oops.contract.RedbusContract;
import com.xworkz.oops.vrl.RedbusContractImplementor;

public class AgencyTester {

	public static void main(String[] args) {
		
		RedbusContract contract=new RedbusContractImplementor();
		


		Serializable obj=new RedbusContractImplementor();
		
         Object obj1=new RedbusContractImplementor();
         RedbusContractImplementor implementor=(RedbusContractImplementor)obj1;
         
        


		//RedbusContract.printDate();
		//abstraction	
		TravelAgency agency=new TravelAgency(contract);

		agency.acceptBooking();
	}

}
