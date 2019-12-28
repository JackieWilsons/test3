package com.itheima.service;


import com.itheima.domain.Patient;

import java.util.List;

public interface PatientService {
	void save(Patient patient);

	List<Patient> getPatientList();
}
