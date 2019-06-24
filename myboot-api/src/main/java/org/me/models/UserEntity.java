package org.me.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user")
public class UserEntity {

	@Id
	@Column
	String username;
	@Column
	String password;
	@Column
	String email;
	@Column
	int active;
	@Column
	int islogged;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable( name="user_roles",joinColumns={@JoinColumn(name="username",referencedColumnName="username")},inverseJoinColumns={@JoinColumn(name="role_id",referencedColumnName="idroles")} )
	List<Roles> roles = new ArrayList<Roles>();
}
