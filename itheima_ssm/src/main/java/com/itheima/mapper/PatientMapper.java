package com.itheima.mapper;

import com.itheima.domain.Patient;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PatientMapper {
	@Insert("insert into patient values(#{id}, #{name}, #{sex}, #{age}, #{did}, #{content})")
	void save(Patient patient);
	@Select("select * from patient")
	List<Patient> getPatientList();
}
