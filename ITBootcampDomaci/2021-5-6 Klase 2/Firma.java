package Domaci;

import java.util.List;

public class Firma {
	
	private String naziv;
	private String sediste;
	private List<Zaposleni> zaposleni;
	
	public Firma(String naziv, String sediste, List<Zaposleni> zaposleni) {
		super();
		this.naziv = naziv;
		this.sediste = sediste;
		this.zaposleni = zaposleni;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSediste() {
		return sediste;
	}

	public List<Zaposleni> getZaposleni() {
		return zaposleni;
	}

	@Override
	public String toString() {
		return "Firma [naziv=" + naziv + ", sediste=" + sediste + ", Zaposleni=" + getZaposleni() + "]";
	}

	
	
}
