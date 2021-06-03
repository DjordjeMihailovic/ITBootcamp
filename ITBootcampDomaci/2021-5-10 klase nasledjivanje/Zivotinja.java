package Domaci;

public class Zivotinja {
	
	private String vrsta;
	private String naziv;
	private String omHrana;
	
	public Zivotinja(String vrsta, String naziv, String omHrana) {
		super();
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.omHrana = omHrana;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOmHrana() {
		return omHrana;
	}

	public void setOmHrana(String omHrana) {
		this.omHrana = omHrana;
	}

	@Override
	public String toString() {
		return "Zivotinja [vrsta=" + vrsta + ", naziv=" + naziv + ", omHrana=" + omHrana + "]";
	}
	
}
