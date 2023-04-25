package com.co.kr.service;


import java.util.HashMap;
import java.util.List;

import com.co.kr.domain.MyprojListDomain;

public interface MyprojService {
	
	// 전체 리스트 조회
	public List<MyprojListDomain> myprojList();

	// 하나 삭제
	public void myContentRemove(HashMap<String, Object> map);
	
	// 하나 리스트 조회
	public MyprojListDomain myprojSelectOne(HashMap<String, Object> map);

}