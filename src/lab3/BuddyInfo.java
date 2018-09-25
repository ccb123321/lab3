package lab3;

public class BuddyInfo {

	 String name ="";
	 String address="";
	 String phoneNumber="";
	
	 public BuddyInfo() {
		 
	 }
	 public BuddyInfo(String name,String address,String phoneNumber){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public static void main(String[] args) {
	  BuddyInfo old = new BuddyInfo("jason","123", "1111");
	
		// TODO Auto-generated method stub
     System.out.println("Hello " + old.getName());
      
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

