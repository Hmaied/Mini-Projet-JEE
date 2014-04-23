package edu.esprit.miniprojet.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AuthentificationBean {

	private String login;
	private String password;
	
	public String ValideteUser()
	{
		
		if(login.equals("Hmaied") && password.equals("Hmaied"))
			return "welcome";
		return  "Error";
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
