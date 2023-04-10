package flatmapandmap;

import java.util.List;

public class Customer {
	private int custId;
	private String name;
	 private String emailId;
	 private List<String> mobileNo;
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", emailId=" + emailId + ", mobileNo=" + mobileNo
				+ "]";
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<String> getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(List<String> mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Customer(int custId, String name, String emailId, List<String> mobileNo) {
		super();
		this.custId = custId;
		this.name = name;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	 

}
