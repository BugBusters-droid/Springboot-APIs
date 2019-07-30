package io.venkatesh.api.ttt;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
 @Id	
 String id;
 String name;
 
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
