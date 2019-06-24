package org.dta;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;


//@JsonIgnoreProperties(ignoreUnknown = true)

public class PersonType implements  Serializable{


	@JsonProperty
	String typeName;
	public PersonType(String type) {
	
		this.typeName = type;
	}
}
