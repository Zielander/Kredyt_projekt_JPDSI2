package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ksiazka database table.
 * 
 */
@Embeddable
public class KsiazkaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idKsiazka;

	@Column(insertable=false, updatable=false)
	private int gatunek_idGatunek;

	public KsiazkaPK() {
	}
	public int getIdKsiazka() {
		return this.idKsiazka;
	}
	public void setIdKsiazka(int idKsiazka) {
		this.idKsiazka = idKsiazka;
	}
	public int getGatunek_idGatunek() {
		return this.gatunek_idGatunek;
	}
	public void setGatunek_idGatunek(int gatunek_idGatunek) {
		this.gatunek_idGatunek = gatunek_idGatunek;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof KsiazkaPK)) {
			return false;
		}
		KsiazkaPK castOther = (KsiazkaPK)other;
		return 
			(this.idKsiazka == castOther.idKsiazka)
			&& (this.gatunek_idGatunek == castOther.gatunek_idGatunek);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idKsiazka;
		hash = hash * prime + this.gatunek_idGatunek;
		
		return hash;
	}
}