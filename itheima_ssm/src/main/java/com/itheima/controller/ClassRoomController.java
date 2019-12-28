package com.itheima.controller;

import com.itheima.domain.Patient;
import com.itheima.service.ClassRoomService;
import com.itheima.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 科室controller
 */
@RequestMapping("/pages")
@Controller
public class ClassRoomController {
	@Autowired
	private ClassRoomService classRoomService;
	@Autowired
	private PatientService patientService;
	/**
	 * 调用service准备科室下拉选数据列表
	 */
	@RequestMapping("/selections/")
	@ResponseBody
	public List<String> showSelections(){
		List<String> selections = classRoomService.getSelections();
		return selections;
	}

	@RequestMapping("/getPatientList")
	public String getPatientList(Model model){
		List<Patient> patientList = patientService.getPatientList();
		System.out.println(patientList);
		model.addAttribute("patientList", patientList);
		return "patients-list";
	}
}
