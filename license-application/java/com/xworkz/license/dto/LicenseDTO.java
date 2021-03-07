package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;

public class LicenseDTO extends CommonDTO {
	private IdProof idProof;
	private String idProofNo;
	private VehicleType vehicleType;
	private Date startdate;
	private boolean disablity;
	private boolean commercial;
	
	public LicenseDTO() {
		
	}

	public LicenseDTO(String name, int age, java.util.Date dob, long mobileNumber, AddressDTO addressDTO, Gender gender,
			BloodGroup bloodGroup) {
		super();
		// TODO Auto-generated constructor stub
	}

	public IdProof getIdProof() {
		return idProof;
	}

	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}

	public String getIdProofNo() {
		return idProofNo;
	}

	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public boolean isDisablity() {
		return disablity;
	}

	public void setDisablity(boolean disablity) {
		this.disablity = disablity;
	}

	public boolean isCommercial() {
		return commercial;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}
	
	

	
}
