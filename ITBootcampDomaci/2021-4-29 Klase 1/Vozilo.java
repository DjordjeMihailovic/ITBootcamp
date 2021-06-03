package Domaci;

public class Vozilo {
	
	private String marka;
	private String model;
	private int serijskiBroj;
	private String vlasnik;
	
	public Vozilo(String marka, String model, int serijskiBroj, String vlasnik) {
		super();
		this.marka = marka;
		this.model = model;
		this.serijskiBroj = serijskiBroj;
		this.vlasnik = vlasnik;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getSerijskiBroj() {
		return serijskiBroj;
	}
		
}
