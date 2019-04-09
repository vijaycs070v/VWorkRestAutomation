package com.vwork.enums;

public enum GlobalConstants {
	PROPERTYFILE_PATH("./src/main/java/com/vwork/configuration/config.property"),
	DATAFILE_PATH("./src/main/java/com/vwork/data/TestData.csv"),
	ENDPOINTURL("");

	private	String value;
	private GlobalConstants(String value)
	{
		this.value=value;
	}

	public String getValue()
	{
		return value;
	}
}
