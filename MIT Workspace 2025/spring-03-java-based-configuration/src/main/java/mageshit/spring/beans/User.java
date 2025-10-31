package mageshit.spring.beans;

public class User {
	
	private String userName;
	private String password;
	
	public User() {
		System.out.println("<><><> User - Default Constructor Called!!!!");
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		System.out.println("[][][] - User - setUserName Method called!!! " + userName);

		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		System.out.println("[][][] - User - setPassword Method called!!! "  + password);
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
}
