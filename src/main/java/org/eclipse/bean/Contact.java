package org.eclipse.bean;

public class Contact {
        private int id;
        private String username,msg,email,phone;
        
		public Contact(String username, String email, String phone,String msg) {
			this.username = username;
			this.msg = msg;
			this.email = email;
			this.phone=phone;
		}

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

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "Contact [id=" + id + ", username=" + username + ", msg=" + msg + ", email=" + email + ", phone="
					+ phone + "]";
		}
          
}
