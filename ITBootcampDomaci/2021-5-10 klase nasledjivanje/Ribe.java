package Domaci;

public class Ribe extends Zivotinja {
	
	private String vrstaVode;
	private String vrstaPeraja;
	
	public Ribe(String vrsta, String naziv, String omHrana, String vrstaVode, String vrstaPeraja) {
		super(vrsta, naziv, omHrana);
		this.vrstaVode = vrstaVode;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getVrstaVode() {
		return vrstaVode;
	}

	public void setVrstaVode(String vrstaVode) {
		this.vrstaVode = vrstaVode;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}
	
}
