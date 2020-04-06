package com.mindtree.kalingahospital.service;

import java.util.List;

import com.mindtree.kalingahospital.entity.KalingaHospital;

public interface KalingaHospitalService {
	 KalingaHospital addpatient(KalingaHospital hospital);
	 List<KalingaHospital> allPatients ();
	 KalingaHospital update(int id);
	 void delete(int id);

}
