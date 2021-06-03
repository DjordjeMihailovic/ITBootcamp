package Domaci;

public class Zaposleni {

	private String ime_prezime;
	private String pozicija;
	private double primanja;
	
	public Zaposleni(String ime_prezime, String pozicija, double primanja) {
		super();
		this.ime_prezime = ime_prezime;
		this.pozicija = pozicija;
		this.primanja = primanja;
	}

	public String getIme_prezime() {
		return ime_prezime;
	}

	public void setIme_prezime(String ime_prezime) {
		this.ime_prezime = ime_prezime;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public double getPrimanja() {
		return primanja;
	}

	public void setPrimanja(double primanja) {
		this.primanja = primanja;
	}

	@Override
	public String toString() {
		return " IME_PREZIME: " + ime_prezime + "  POZICIJA " + pozicija + " ( " + primanja + " ) ";
	}		
	
}
