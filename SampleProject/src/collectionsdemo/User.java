package collectionsdemo;

public class User {
	
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userCPassword;
	private String userCountry;
	private String userState;
	private String userPhno;
	public User(String userName, String userEmail, String userPassword, String userCPassword, String userCountry,
			String userState, String userPhno) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userCPassword = userCPassword;
		this.userCountry = userCountry;
		this.userState = userState;
		this.userPhno = userPhno;
	}
	public User() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserCPassword() {
		return userCPassword;
	}
	public void setUserCPassword(String userCPassword) {
		this.userCPassword = userCPassword;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(String userPhno) {
		this.userPhno = userPhno;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userCPassword=" + userCPassword + ", userCountry=" + userCountry + ", userState=" + userState
				+ ", userPhno=" + userPhno + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userCPassword == null) ? 0 : userCPassword.hashCode());
		result = prime * result + ((userCountry == null) ? 0 : userCountry.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result + ((userPhno == null) ? 0 : userPhno.hashCode());
		result = prime * result + ((userState == null) ? 0 : userState.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userCPassword == null) {
			if (other.userCPassword != null)
				return false;
		} else if (!userCPassword.equals(other.userCPassword))
			return false;
		if (userCountry == null) {
			if (other.userCountry != null)
				return false;
		} else if (!userCountry.equals(other.userCountry))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		if (userPhno == null) {
			if (other.userPhno != null)
				return false;
		} else if (!userPhno.equals(other.userPhno))
			return false;
		if (userState == null) {
			if (other.userState != null)
				return false;
		} else if (!userState.equals(other.userState))
			return false;
		return true;
	}
	
	
	

}
