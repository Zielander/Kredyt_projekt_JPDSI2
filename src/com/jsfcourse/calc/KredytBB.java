package com.jsfcourse.calc;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@RequestScoped
/*@SessionScoped*/
public class KredytBB {
	private String kwota = "10000.00";
	private String lat = "1";
	private String ile_proc = "5";
	//private String rata;
	private Double result;

	@Inject
	FacesContext ctx; //Dependency Injection w skrócie DI

	public String getKwota() {
		return kwota;
	}

	public void setKwota(String kwota) {
		this.kwota = kwota;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getIle_proc() {
		return ile_proc;
	}

	public void setIle_proc(String ile_proc) {
		this.ile_proc = ile_proc;
	}

/*	public String getRata() {
		return rata;
	}

	public void setRata(String rata) {
		this.rata = rata;
	}
*/
	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public boolean doTheMath() {
		try {
			double kwota = Double.parseDouble(this.kwota);
			double lat = Double.parseDouble(this.lat);
			double ile_proc =  Double.parseDouble(this.ile_proc);
			
			result = (kwota * Math.pow(1+ile_proc/1200 , lat*12) * ( (1+(ile_proc / 1200)-1) / (Math.pow(1+ile_proc/1200 , lat*12) - 1)));
			result *= 100;
			result = (double) Math.round(result);
			result /= 100;
			
			ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacja wykonana poprawnie", null));
			return true;
		} catch (Exception e) {
			ctx.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "B³¹d podczas przetwarzania parametrów", null));
			return false;
		}
	}

	// Go to "showresult" if ok
	public String calc() {
		if (doTheMath()) {
			return "showresult";
		}
		return null;
	}

}
