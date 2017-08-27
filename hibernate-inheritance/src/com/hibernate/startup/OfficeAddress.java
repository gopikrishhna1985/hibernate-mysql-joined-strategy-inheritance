package com.hibernate.startup;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "office_addr")
public class OfficeAddress extends Address {
	private String addressType;

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

}
