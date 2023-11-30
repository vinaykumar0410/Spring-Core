package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {
	@Value("${dNo}")
	int dNo;
	@Value("${city}")
	String city;
//	public Address(int dNo, String city) {
//		super();
//		this.dNo = dNo;
//		this.city = city;
//	}
//	public int getdNo() {
//		return dNo;
//	}
//	public void setdNo(int dNo) {
//		this.dNo = dNo;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
	
}
