package Domaci;

public class Sportista {
	
	private String imeIprezime;
	private String sport;
	private String klub;
	private int brojDres;
	
	public Sportista(String imeIprezime, String sport, String klub, int brojDres) {
		super();
		this.imeIprezime = imeIprezime;
		this.sport = sport;
		this.klub = klub;
		this.brojDres = brojDres;
	}

	public String getKlub() {
		return klub;
	}

	public void setKlub(String klub) {
		this.klub = klub;
	}

	public int getBrojDres() {
		return brojDres;
	}

	public void setBrojDres(int brojDres) {
		this.brojDres = brojDres;
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public String getSport() {
		return sport;
	}

	@Override
	public String toString() {
		return "Sportista [imeIprezime=" + imeIprezime + ", sport=" + sport + ", klub=" + klub + ", brojDres="
				+ brojDres + "]";
	}
	
	
}
