package com.xworkz.appzone.entity.login;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name="logindetail")

@NamedQuery(name="checkLogin" , query = "Select user from LoginEntity user where user.username= :user AND user.password = :password")
public class LoginEntity implements Serializable {
	
	private static final Logger logger=Logger.getLogger(LoginEntity.class);
	
	public LoginEntity() {
		logger.info("created LoginEntity"+this.getClass().getSimpleName());
	}
		@Id
		@Column(name = "username")
		private String username;
		@Column(name = "password")
		private String password;
		@Column(name = "emailid")
		private String emailid;
		@Column(name = "role")
		private String role;
		@Column(name = "isactive")
		private boolean isactive;
		

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

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public boolean isIs_active() {
			return isactive;
		}

		public void setIs_active(boolean isactive) {
			this.isactive = isactive;
		}

		@Override
		public String toString() {
			return "appzoneDTO [username=" + username + ", password=" + password + ", emailid=" + emailid + ", role=" + role
					+ ", isactive=" + isactive + "]";
		}

	}


