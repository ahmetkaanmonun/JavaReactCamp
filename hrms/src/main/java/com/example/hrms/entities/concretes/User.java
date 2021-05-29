package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Entity
@Table(name ="users")
@AllArgsConstructor
@NoArgsConstructor
public class User{
	
	@Id @Column(name = "id") @GeneratedValue
	private int id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	
	public User(String email,String password) {
		
		this.email = email;
		this.password = password;
		
		
	}
	

}
