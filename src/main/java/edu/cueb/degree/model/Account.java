package edu.cueb.degree.model;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account implements UserDetails {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(length = 4)
	private String id;
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Column(length = 10)
	private String name;
	@JsonIgnore
	@Column(length = 8)
	private String password;
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Role> roles;
	@OneToOne
	private Discipline discipline;
	@OneToOne
	private School scholl;

	public String getSchollName() {
		return scholl.getName();
	}
	public String getDisciplineName() {
		return discipline.getName();
	}
	public String getDisciplineId() {
		return discipline.getId();
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.commaSeparatedStringToAuthorityList(StringUtils.collectionToCommaDelimitedString(roles));
		// return AuthorityUtils.commaSeparatedStringToAuthorityList("Admin");
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
