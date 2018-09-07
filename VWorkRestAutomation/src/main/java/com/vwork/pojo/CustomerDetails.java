package com.vwork.pojo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDetails {

	private int id;
	private String account;
	//@JsonProperty("isIndian")
	private boolean isIndian;
	private List<String> skils;
	private Persionaldetails persionaldetails;
	private List<Mobiles> mobiles;
	private Map<String, String> properties;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount()  // Json key will be "Account". remove "get" prefix. Key name doesn't depend on variable or set method
	
	{
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	//@JsonProperty("isIndian")
	public boolean getIsIndian() {
		return isIndian;
	}
	
	//@JsonProperty("isIndian")
	public void setIsIndian(boolean isIndian) {
		this.isIndian = isIndian;
	}
	public List<String> getSkils() {
		return skils;
	}
	public void setSkils(List<String> skils) {
		this.skils = skils;
	}
	public Persionaldetails getPersionaldetails() {
		return persionaldetails;
	}
	public void setPersionaldetails(Persionaldetails persionaldetails) {
		this.persionaldetails = persionaldetails;
	}
	
	
	public List<Mobiles> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<Mobiles> mobiles) {
		this.mobiles = mobiles;
	}
	
	public Map<String, String> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	
}
