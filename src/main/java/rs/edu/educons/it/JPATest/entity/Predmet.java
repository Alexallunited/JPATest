package rs.edu.educons.it.JPATest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Predmet {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String ime;
	private String opis;
	
	public Predmet() {
		
	}
	
	public Predmet(String ime, String opis) {
		super();
		this.ime = ime;
		this.opis = opis;
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
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Predmet [id=" + id + ", ime=" + ime + ", opis=" + opis +"]";
	}
	
	

}
