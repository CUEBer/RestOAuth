package edu.cueb.degree.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Discipline {
	@Id
	@Column(length = 6)
	private String id;
	@Column(length = 30)
	private String name;
	@OneToOne
	private School school;
	private boolean master;
	private boolean doctor;
	private boolean keyDiscipline;

	public String getSchoolName() {
		return school.getName();
	}

	public void setMaster(boolean master) {
		this.master = master;
	}

	public void setDoctor(boolean doctor) {
		this.doctor = doctor;
	}

	public void setKeyDiscipline(boolean keyDiscipline) {
		this.keyDiscipline = keyDiscipline;
	}

	public void setKeyDate(Date keyDate) {
		this.keyDate = keyDate;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isMaster() {
		return master;
	}

	public boolean isDoctor() {
		return doctor;
	}

	public boolean isKeyDiscipline() {
		return keyDiscipline;
	}

	public Date getKeyDate() {
		return keyDate;
	}

	public Account getUser() {
		return user;
	}

	private Date keyDate;
	@OneToOne
	private Account user;
}
