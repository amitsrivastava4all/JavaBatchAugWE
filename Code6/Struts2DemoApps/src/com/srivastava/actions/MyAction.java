package com.srivastava.actions;

import java.util.Date;

import org.apache.struts2.components.ActionError;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
// pojo // action interface  //ActionSupport
// 
public class MyAction extends ActionSupport { //implements Action {
		private String user;
		private String message;
		private String userid;
		private String password;
//		@Override
//		public String execute(){
//			return null;
//		}
		
		@Override
		public void validate(){
			if(this.userid.trim().length()==0){
					addFieldError("userid","Userid can't be blank");
			}
			if(this.password.trim().length()==0){
				addFieldError("password", "Password Can't be blank");
			}
			else
			if(this.password.trim().length()<5){
				addFieldError("password", "Password Can't be less than 5 char ");
			}
		}
		
		public String checkLogin(){
			if(userid.equals(password)){
			message = "Welcome "+userid+ " Login Date Time "+new Date();
			return SUCCESS;
			//return "success";
			}
			else{
				message = "Invalid userid or password";
				return ERROR;
				//return "fail";
			}
		}
		
		
		public String getUserid() {
			return userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String userInfo(){
			this.setMessage("Welcome");
			this.setUser("Amit");
			return "success";
		}
		
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		
}
