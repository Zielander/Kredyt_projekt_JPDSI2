package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ksiazka database table.
 * 
 */
@Entity
@NamedQuery(name="Ksiazka.findAll", query="SELECT k FROM Ksiazka k")
public class Ksiazka implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private KsiazkaPK id;

	private String autor;

	private String koszt;

	private String tytu³;

	private String wydawnictwo;

	//bi-directional many-to-one association to Gatunek
	@ManyToOne
	private Gatunek gatunek;

	public Ksiazka() {
	}

	public KsiazkaPK getId() {
		return this.id;
	}

	public void setId(KsiazkaPK id) {
		this.id = id;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getKoszt() {
		return this.koszt;
	}

	public void setKoszt(String koszt) {
		this.koszt = koszt;
	}

	public String getTytu³() {
		return this.tytu³;
	}

	public void setTytu³(String tytu³) {
		this.tytu³ = tytu³;
	}

	public String getWydawnictwo() {
		return this.wydawnictwo;
	}

	public void setWydawnictwo(String wydawnictwo) {
		this.wydawnictwo = wydawnictwo;
	}

	public Gatunek getGatunek() {
		return this.gatunek;
	}

	public void setGatunek(Gatunek gatunek) {
		this.gatunek = gatunek;
	}

}