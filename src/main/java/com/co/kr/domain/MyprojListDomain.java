package com.co.kr.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName="builder")
public class MyprojListDomain {

	private String mySeq;
	private String mbId;
	private String myTitle;
	private String myContent;
	private String myCreateAt;
	private String myUpdateAt;
	private String myNum;
	
}