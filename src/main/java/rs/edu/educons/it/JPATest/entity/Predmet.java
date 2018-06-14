package rs.edu.educons.it.JPATest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Predmet {

	@Id
	@GeneratedValue
	private Long id;

	@JsonIgnore
	@ManyToOne
	private Nalog account;

	private String ime;
	private String opis;

	public Predmet() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Nalog getAccount() {
		return account;
	}

	public void setAccount(Nalog account) {
		this.account = account;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Predmet(Long id, Nalog account, String ime, String opis) {
		super();
		this.id = id;
		this.account = account;
		this.ime = ime;
		this.opis = opis;
	}

	@Override
	public String toString() {
		return "Predmet [id=" + id + ", account=" + account + ", ime=" + ime + ", opis=" + opis + "]";
	}

}
