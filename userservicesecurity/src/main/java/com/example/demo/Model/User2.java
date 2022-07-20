package com.example.demo.Model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
@Entity
public class User2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String name;
	private String email;
	private String pwd;
	
	@ElementCollection
	@CollectionTable(name="rolestab1",
	joinColumns = { @JoinColumn(name="uid", nullable = false,referencedColumnName = "uid")})
	@Column(name="role1",updatable = false,nullable = false)
	
	private List<String> roles;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public User2(int uid, String name, String email, String pwd, List<String> roles) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.roles = roles;
	}

	public User2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User2 [uid=" + uid + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", roles=" + roles + "]";
	}
	
	

}
