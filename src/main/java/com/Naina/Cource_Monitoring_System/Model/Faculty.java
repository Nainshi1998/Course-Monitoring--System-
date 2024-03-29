package com.Naina.Cource_Monitoring_System.Model;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Faculty {

		@Id
		private int id;
		
		private String name;
		
		private String address;
		
		private String mobileNo;
		
		private String email;
		
		private String username;
		
		private String password;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public String getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
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

		public void setPassword(String string) {
			this.password = string;
		}

		public Faculty() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Faculty(int id, String name)
		{
			super();
			this.id = id;
			this.name = name;
		}

		public Faculty(int id, String name, String address, String mobileNo, String email, String username,
				String password) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.mobileNo = mobileNo;
			this.email = email;
			this.username = username;
			this.password = password;
		}

		@Override
		public String toString() {
			return "Faculty [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + ", email="
					+ email + ", username=" + username + ", password=" + password + "]";
		}
	}


