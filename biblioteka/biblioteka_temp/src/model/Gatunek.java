package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the gatunek database table.
 * 
 */
@Entity
@NamedQuery(name="Gatunek.findAll", query="SELECT g FROM Gatunek g")
public class Gatunek implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idGatunek;

	private String nazwa;

	//bi-directional many-to-one association to Ksiazka
	@OneToMany(mappedBy="gatunek")
	private List<Ksiazka> ksiazkas;

	public Gatunek() {
	}

	public int getIdGatunek() {
		return this.idGatunek;
	}

	public void setIdGatunek(int idGatunek) {
		this.idGatunek = idGatunek;
	}

	public String getNazwa() {
		return this.nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public List<Ksiazka> getKsiazkas() {
		return this.ksiazkas;
	}

	public void setKsiazkas(List<Ksiazka> ksiazkas) {
		this.ksiazkas = ksiazkas;
	}

	public Ksiazka addKsiazka(Ksiazka ksiazka) {
		getKsiazkas().add(ksiazka);
		ksiazka.setGatunek(this);

		return ksiazka;
	}

	public Ksiazka removeKsiazka(Ksiazka ksiazka) {
		getKsiazkas().remove(ksiazka);
		ksiazka.setGatunek(null);

		return ksiazka;
	}

}