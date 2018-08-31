package com.vwork.enums;

public enum GlobalConstants {
	PATHPROPERTYFILE("./src/main/java/com/vwork/configuration/path.property"),
	ENDPOINTURL("http://localhost:3000");

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
