package com.xworkz.license.dao;

import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dto.LicenseDTO;

public interface LicenseDAO {
	
	public void save(LicenseDTO dto);

	public LicenseDTO findByIdProofNo(String idProofNo);

	public boolean updateVehicleTypeByIdProofNo(String idProof,VehicleType type);

	

}
