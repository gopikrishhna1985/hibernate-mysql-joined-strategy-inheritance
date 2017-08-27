package com.hibernate.startup;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "home_addr")
public class HomeAddress extends Address {
	private String addressType;

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

}
