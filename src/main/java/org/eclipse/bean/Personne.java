package org.eclipse.bean;

public class Personne {
        private int id;
        private String nom,prenom,pwd,mail,profile;
        
        
		public Personne() {
			
		}
		public Personne(String mail, String pwd) {
			this.pwd = pwd;
			this.mail = mail;
		}
		public Personne(String nom, String prenom, String mail,String profile,String pwd) {
			this.nom = nom;
			this.prenom = prenom;
			this.pwd = pwd;
			this.mail = mail;
			this.profile=profile;
		}
		public Personne(int id,String nom, String prenom, String mail,String profile,String pwd) {
			this.id=id;
			this.nom = nom;
			this.prenom = prenom;
			this.pwd = pwd;
			this.mail = mail;
			this.profile=profile;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id ;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		
		public String getProfile() {
			return profile;
		}
		public void setProfile(String profile) {
			this.profile = profile;
		}
		@Override
		public String toString() {
			return "Personne [d=" + id + ", nom=" + nom + ", prenom=" + prenom + ", pwd=" + pwd + ", mail=" + mail
					+ "]";
		}
        
}
