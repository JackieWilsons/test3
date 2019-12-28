package com.itheima.controller;

import com.itheima.domain.Patient;
import com.itheima.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 患者Controller层
 */
@RequestMapping("/patient")
@Controller
public class PatientController {
	@Autowired
	private PatientService patientService;
	@RequestMapping("/save.do")
	public String savePatient(Patient patient){
		System.out.println(patient);
		//调用service保存用户
		patientService.save(patient);
		return "subscribe-form";
	}

}
