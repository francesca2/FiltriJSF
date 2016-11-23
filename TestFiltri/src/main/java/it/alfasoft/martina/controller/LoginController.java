package it.alfasoft.martina.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="loginController")
@SessionScoped
public class LoginController {
	
	private String username;
	private String password;
	private boolean loggato;
	
	public LoginController(){
		loggato = false;
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
	
	public boolean isLoggato() {
		return loggato;
	}
	
	public void setLoggato(boolean loggato) {
		this.loggato = loggato;
	}

	public String doLogin(){
		
		if(!this.username.equals("aaa") || !this.password.equals("aaa")){
			
			//se non è verificato visualizzo a video un messaggio di errore e rimando a login page
			FacesMessage msg = new FacesMessage("Username o Password ERRATI!");
			
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return "Login";
		}
		
		//se è verificato allora posso mandare ad home page
		this.loggato = true;
		return "/portali/home?faces-redirect=true";
	}
	
}
