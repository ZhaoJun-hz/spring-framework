package com.zj.pojo;

import java.util.Date;

public class UserMapper {
	private Date dataValue;

	public Date getDataValue() {
		return dataValue;
	}

	public void setDataValue(Date dataValue) {
		this.dataValue = dataValue;
	}

	@Override
	public String toString() {
		return "UserMapper{" +
				"dataValue=" + dataValue +
				'}';
	}
}
