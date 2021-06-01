package users;


import java.io.Serializable;






public class Sign_Up implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String conf_pass;
	
	public Sign_Up(String username, String password, String conf_pass) {
		super();
		this.username = username;
		this.password = password;
		this.conf_pass = conf_pass;
	}

	public Sign_Up() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConf_pass() {
		return conf_pass;
	}

	public void setConf_pass(String conf_pass) {
		this.conf_pass = conf_pass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conf_pass == null) ? 0 : conf_pass.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Sign_Up other = (Sign_Up) obj;
		if (conf_pass == null) {
			if (other.conf_pass != null)
				return false;
		} else if (!conf_pass.equals(other.conf_pass))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	


	
	
	
	

}
