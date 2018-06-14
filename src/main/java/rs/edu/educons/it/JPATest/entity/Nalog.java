package rs.edu.educons.it.JPATest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Nalog {

	@Id
	@GeneratedValue
	private Long id;

	private String username;

	@JsonIgnore
	private String password;

	@OneToMany(mappedBy = "account")
	private Set<Predmet> predmet = new HashSet<>();

	private Nalog() {
	} // JPA only

	public Nalog(final String username, final String password) {
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public Set<Predmet> getPredmet() {
		return predmet;
	}
}