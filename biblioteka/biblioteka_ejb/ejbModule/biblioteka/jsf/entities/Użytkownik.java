package biblioteka.jsf.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the u篡tkownik database table.
 * 
 */
@Entity
@NamedQuery(name="U篡tkownik.findAll", query="SELECT u FROM U篡tkownik u")
public class U篡tkownik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idU篡tkownik;

	private String adres;

	private String has這;

	private String imie;

	private String login;

	private String nazwisko;

	private String nrTelefonu;

	private String rola;

	public U篡tkownik() {
	}

	public int getIdU篡tkownik() {
		return this.idU篡tkownik;
	}

	public void setIdU篡tkownik(int idU篡tkownik) {
		this.idU篡tkownik = idU篡tkownik;
	}

	public String getAdres() {
		return this.adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getHas這() {
		return this.has這;
	}

	public void setHas這(String has這) {
		this.has這 = has這;
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