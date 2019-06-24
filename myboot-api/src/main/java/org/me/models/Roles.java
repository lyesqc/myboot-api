package org.me.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="roles")
public class Roles {

	@Id
	@Column
	String idroles;
	
	@Column
	String description;
}
