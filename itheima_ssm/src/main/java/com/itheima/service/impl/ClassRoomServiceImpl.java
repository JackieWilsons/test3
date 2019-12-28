package com.itheima.service.impl;

import com.itheima.mapper.ClassRoomMapper;
import com.itheima.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 科室service
 */
@Service
public class ClassRoomServiceImpl implements ClassRoomService {
	@Autowired
	private ClassRoomMapper classRoomMapper;
	@Override
	public List<String> getSelections() {
		//调用mapper查询科室下拉选数据
		List<String> selections= classRoomMapper.getSelections();
		return selections;
	}
}
