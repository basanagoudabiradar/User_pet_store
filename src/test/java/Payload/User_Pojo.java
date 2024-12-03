package Payload;

public class User_Pojo 
{
	int id;
	  String Uesrname;
	  String firstrname;
	  String lastname;
	  String email;
	  String password;
	  String phnonenumber;
	  int UserStatus=0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUesrname() {
		return Uesrname;
	}
	public void setUesrname(String uesrname) {
		Uesrname = uesrname;
	}
	public String getFirstrname() {
		return firstrname;
	}
	public void setFirstrname(String firstrname) {
		this.firstrname = firstrname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhnonenumber() {
		return phnonenumber;
	}
	public void setPhnonenumber(String phnonenumber) {
		this.phnonenumber = phnonenumber;
	}
	public int getUserStatus() {
		return UserStatus;
	}
	public void setUserStatus(int userStatus) {
		UserStatus = userStatus;
	}
	
}
