package ch.zhaw.iwi.devops.model.university;

import javax.persistence.Entity;

import ch.zhaw.iwi.devops.model.AbstractEntity;

@Entity
public class university extends AbstractEntity implements Comparable<university> {

	private String name;
	
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public int compareTo(university o) {
		return this.getName().compareTo(o.getName());
	}

}
