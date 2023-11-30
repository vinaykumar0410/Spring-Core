package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("adr")
public class Address {
	@Value("${doorNumber}")
	int doorNumber;
	@Value("${city}")
	String city;
//	public int getDoorNumber() {
//		return doorNumber;
//	}
//	public void setDoorNumber(int doorNumber) {
//		this.doorNumber = doorNumber;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
	
}
