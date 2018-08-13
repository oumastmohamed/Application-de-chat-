package client;

import java.io.Serializable;

public class Message implements Serializable{
	
	public String message;
	public String EmailE;
	public String EmailEn;
	public Message(String message, String emailE, String emailEn) {
		
		this.message = message;
		this.EmailE = emailE;
		this.EmailEn = emailEn;
	}
	

}
