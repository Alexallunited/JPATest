package rs.edu.educons.it.JPATest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
<<<<<<< HEAD

import com.fasterxml.jackson.annotation.JsonIgnore;
=======
>>>>>>> master

@Entity
public class Predmet {

	@Id
	@GeneratedValue
<<<<<<< HEAD
	private Long id;

	@JsonIgnore
	@ManyToOne
	private Nalog account;

	private String ime;
	private String opis;

=======
	private Integer id;
	private String ime;
	private String opis;

	@ManyToOne
	private Smer smer;

>>>>>>> master
	public Predmet() {

	}

<<<<<<< HEAD
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
=======
	public Predmet(String ime, String opis, Integer smerId) {
		super();
		this.ime = ime;
		this.opis = opis;
		
		this.smer = new Smer(smerId, "", "");
	}

	public Smer getSmer() {
		return smer;
	}

	public void setSmer(Smer smer) {
		this.smer = smer;
>>>>>>> master
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

<<<<<<< HEAD
	public Predmet(Long id, Nalog account, String ime, String opis) {
		super();
=======
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
>>>>>>> master
		this.id = id;
		this.account = account;
		this.ime = ime;
		this.opis = opis;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Predmet [id=" + id + ", account=" + account + ", ime=" + ime + ", opis=" + opis + "]";
=======
		return "Predmet [id=" + id + ", ime=" + ime + ", opis=" + opis + "]";
>>>>>>> master
	}

}
