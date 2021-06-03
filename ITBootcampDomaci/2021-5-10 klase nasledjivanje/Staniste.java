package Domaci;

import java.util.ArrayList;
import java.util.List;

public class Staniste {
	
	List<Zivotinja> staniste1 = new ArrayList<Zivotinja>();
	private String naziv;
	
	public Staniste(List<Zivotinja> staniste1, String naziv) {
		super();
		this.staniste1 = staniste1;
		this.naziv = naziv;
	}

	public List<Zivotinja> getStaniste1() {
		return staniste1;
	}

	public void setStaniste1(List<Zivotinja> staniste1) {
		this.staniste1 = staniste1;
	}

	public String getNaziv() {
		return naziv;
	}
	
}
