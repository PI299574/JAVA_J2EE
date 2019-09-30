package Immutable;

public class Address {

	
	private int  houseNo ;
	private String houseName;
	public Address() {
		// TODO Auto-generated constructor stub
		
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", houseName=" + houseName + "]";
	}
	
	
}
