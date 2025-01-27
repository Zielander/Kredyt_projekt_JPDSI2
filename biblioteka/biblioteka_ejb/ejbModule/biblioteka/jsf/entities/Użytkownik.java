package biblioteka.jsf.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the użytkownik database table.
 * 
 */
@Entity
@NamedQuery(name="Użytkownik.findAll", query="SELECT u FROM Użytkownik u")
public class Użytkownik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUżytkownik;

	private String adres;

	private String hasło;

	private String imie;

	private String login;

	private String nazwisko;

	private String nrTelefonu;

	private String rola;

	public Użytkownik() {
	}

	public int getIdUżytkownik() {
		return this.idUżytkownik;
	}

	public void setIdUżytkownik(int idUżytkownik) {
		this.idUżytkownik = idUżytkownik;
	}

	public String getAdres() {
		return this.adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getHasło() {
		return this.hasło;
	}

	public void setHasło(String hasło) {
		this.hasło = hasło;
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