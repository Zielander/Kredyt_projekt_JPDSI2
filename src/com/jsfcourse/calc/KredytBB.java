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
	private Double kwota;
	private Double lat;
	private Double ile_proc;
	private Double result;

	@Inject
	FacesContext ctx; //Dependency Injection w skrócie DI

	public Double getKwota() {
		return kwota;
	}

	public void setKwota(Double kwota) {
		this.kwota = kwota;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getIle_proc() {
		return ile_proc;
	}

	public void setIle_proc(Double ile_proc) {
		this.ile_proc = ile_proc;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public boolean doTheMath() {
		try {
			result = (kwota * Math.pow(1+ile_proc/1200 , lat*12) * ( (1+(ile_proc / 1200)-1) / (Math.pow(1+ile_proc/1200 , lat*12) - 1)));
			result *= 100;
			result = (double) Math.round(result);
			result /= 100;
			
			ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacja wykonana poprawnie", null));
			return true;
		} catch (Exception e) {
			ctx.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Błąd podczas przetwarzania parametrów", null));
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

