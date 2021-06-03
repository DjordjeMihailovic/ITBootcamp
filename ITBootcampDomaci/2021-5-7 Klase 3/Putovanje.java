package Domaci;

import java.util.List;

public class Putovanje {
	
	private String destinacija;
	private double cenaAranzmana;
	private List<Putnici> putnici;
	
	public Putovanje(String destinacija, double cenaAranzmana, List<Putnici> putnici) {
		super();
		this.destinacija = destinacija;
		this.cenaAranzmana = cenaAranzmana;
		this.putnici = putnici;
	}

	public String getDestinacija() {
		return destinacija;
	}

	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}

	public double getCenaAranzmana() {
		return cenaAranzmana;
	}

	public void setCenaAranzmana(double cenaAranzmana) {
		this.cenaAranzmana = cenaAranzmana;
	}

	public List<Putnici> getPutnici() {
		return putnici;
	}

	public void setPutnici(List<Putnici> putnici) {
		this.putnici = putnici;
	}
	
		
}