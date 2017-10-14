package edu.cueb.degree.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
	@Id
	@Column(length=10)
	private String name;
	@ManyToMany
	private Set<Account> users;
}
