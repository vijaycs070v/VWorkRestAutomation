package Json;

import java.util.List;

public class EmpDetails {

	private int id;
	private String account;
	private boolean isIndian;
	private List<String> skils;
	private Persionaldetails persionaldetails;
	private List<Mobiles> mobiles;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public boolean isIndian() {
		return isIndian;
	}
	public void setIndian(boolean isIndian) {
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
	
	
}
