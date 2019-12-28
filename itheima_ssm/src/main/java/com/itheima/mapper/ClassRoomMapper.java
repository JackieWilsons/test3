package com.itheima.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassRoomMapper {
	@Select("select name from classroom")
	List<String> getSelections();
}
