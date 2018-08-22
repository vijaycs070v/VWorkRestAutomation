package Json;

public class EmpDetails {

	private int id;
	private String account;
	private boolean isIndian;
	private Object[] skils;
	private Persionaldetails persionaldetails;
	private Mobiles[] mobiles;
	
	
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
	public Object[] getSkils() {
		return skils;
	}
	public void setSkils(Object[] skils) {
		this.skils = skils;
	}
	public Persionaldetails getPersionaldetails() {
		return persionaldetails;
	}
	public void setPersionaldetails(Persionaldetails persionaldetails) {
		this.persionaldetails = persionaldetails;
	}
	
	
	public Mobiles getMobiles(int index) {
		return mobiles[index];
	}
	public void setMobiles(Mobiles[] mobiles) {
		this.mobiles = mobiles;
	}
	
	
}
