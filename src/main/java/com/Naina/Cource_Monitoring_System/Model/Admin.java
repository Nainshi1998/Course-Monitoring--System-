package com.Naina.Cource_Monitoring_System.Model;



	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Admin {
		@Id
		private int id;
		
		private String username;
		
		private String password;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public Admin() {
			super();
		}

		public Admin(int id, String username, String password) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
		}

		@Override
		public String toString() {
			return "Admin [id=" + id + ", username=" + username + ", password=" + password + "]";
		}
	}


