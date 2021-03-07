package com.xworkz.license;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dao.impl.LicenseDAOImpl;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
		AddressDTO addressDTO = new AddressDTO("NA", "Avathi", 562164, 341, "Avathi", "Karnataka", "Sri Maruthi");

		Date dob = new Date();

		LicenseDTO dto = new LicenseDTO("Thanushree", 21,dob, 8660664528l,addressDTO,Gender.FEMALE,BloodGroup.O_POSITIVE);
		dto.setIdProof(IdProof.ADHAR_CARD);
		dto.setIdProofNo("6315 4522 8767");
		dto.setCommercial(false);
		dto.setDisablity(false);
		dto.setStartdate(new Date());
		dto.setVehicleType(VehicleType.TWO_WHEELER);

		LicenseDAO dao = new LicenseDAOImpl();
		dao.save(dto);
			
		LicenseDTO dtoFound = dao.findByIdProofNo("6315 4522 8767");
		System.out.println(dtoFound);

		boolean updated=dao.updateVehicleTypeByIdProofNo("6315 4522 8767", VehicleType.LMV);
		System.out.println("updated"+ updated);
		
		LicenseDTO dtoafterUpdate=dao.findByIdProofNo("6315 4522 8767");
		System.out.println(dtoafterUpdate);
	


	}

}
