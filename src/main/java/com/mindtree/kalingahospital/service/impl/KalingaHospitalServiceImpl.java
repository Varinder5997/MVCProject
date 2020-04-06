package com.mindtree.kalingahospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingahospital.entity.KalingaHospital;
import com.mindtree.kalingahospital.repository.KalingaHospiitalRepo;
import com.mindtree.kalingahospital.service.KalingaHospitalService;
@Service
public class KalingaHospitalServiceImpl implements KalingaHospitalService {
	
	@Autowired
	KalingaHospiitalRepo hospitalRepo;
	@Override
	public KalingaHospital addpatient(KalingaHospital hospital) {
		KalingaHospital h=hospitalRepo.save(hospital);
		return h;
	}

	@Override
	public List<KalingaHospital> allPatients() {
		return hospitalRepo.findAll();
	}

	@Override
	public KalingaHospital update(int id) {
		KalingaHospital h=hospitalRepo.findById(id).get();
		return h;
	}

	@Override
	 public void delete(int id) {
		hospitalRepo.deleteById(id);
    }
	
	

}
