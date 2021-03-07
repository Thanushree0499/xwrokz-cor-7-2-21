package com.xworkz.oops.agency;

import com.xworkz.oops.contract.RedbusContract;

public class TravelAgency {
	
	private RedbusContract contract;
	private String agencyName;

	 public TravelAgency(RedbusContract contract) {
		 System.out.println("created travel agency");
		 this.contract=contract;
		}

		public void acceptBooking() {

			System.out.println("invoked acceptBooking");
			System.out.println("checking bookings for" + this.agencyName);
			boolean warranty = contract.busWarranty();
	
		}

		public String getAgencyName() {
			return agencyName;
		}

		public void setAgencyName(String agencyName) {
			this.agencyName = agencyName;
		}

		


		
		}


