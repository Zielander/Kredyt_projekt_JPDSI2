package biblioteka.jsf.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the u�ytkownik database table.
 * 
 */
@Entity
@NamedQuery(name="U�ytkownik.findAll", query="SELECT u FROM U�ytkownik u")
public class U�ytkownik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idU�ytkownik;

	private String adres;

	private String has�o;

	private String imie;

	private String login;

	private String nazwisko;

	private String nrTelefonu;

	private String rola;

	public U�ytkownik() {
	}

	public int getIdU�ytkownik() {
		return this.idU�ytkownik;
	}

	public void setIdU�ytkownik(int idU�ytkownik) {
		this.idU�ytkownik = idU�ytkownik;
	}

	public String getAdres() {
		return this.adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getHas�o() {
		return this.has�o;
	}

	public void setHas�o(String has�o) {
		this.has�o = has�o;
	}

	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getNrTelefonu() {
		return this.nrTelefonu;
	}

	public void setNrTelefonu(String nrTelefonu) {
		this.nrTelefonu = nrTelefonu;
	}

	public String getRola() {
		return this.rola;
	}

	public void setRola(String rola) {
		this.rola = rola;
	}

}