package com.co.kr.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.co.kr.domain.MyprojContentDomain;
import com.co.kr.domain.MyprojListDomain;

@Mapper
public interface MyprojMapper {

	//list
	public List<MyprojListDomain> myprojList();

	//content insert
	public void contentMyproj(MyprojContentDomain myprojContentDomain);

	//content update
	public void myContentUpdate(MyprojContentDomain myprojContentDomain);

	//content delete 
	public void myContentRemove(HashMap<String, Object> map);
	
	//select one
	public MyprojListDomain myprojSelectOne(HashMap<String, Object> map);

}