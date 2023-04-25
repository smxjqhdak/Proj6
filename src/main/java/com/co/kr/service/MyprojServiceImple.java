package com.co.kr.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.co.kr.domain.BoardListDomain;
import com.co.kr.domain.MyprojListDomain;
import com.co.kr.mapper.MyprojMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class MyprojServiceImple implements MyprojService {

	@Autowired
	private MyprojMapper myprojMapper;

	@Override
	public List<MyprojListDomain> myprojList() {
		// TODO Auto-generated method stub
		return myprojMapper.myprojList();
	}

	@Override
	public void myContentRemove(HashMap<String, Object> map) {
		myprojMapper.myContentRemove(map);
	}

	@Override
	public MyprojListDomain myprojSelectOne(HashMap<String, Object> map) {
		return myprojMapper.myprojSelectOne(map);
	}
	
}