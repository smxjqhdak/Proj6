package com.co.kr.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName="builder")
public class MyprojContentDomain {

	private Integer mySeq;
	private String mbId;

	private String myTitle;
	private String myContent;
	private String myNum;

}