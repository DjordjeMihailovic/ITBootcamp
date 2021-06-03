package Domaci;

public class Event {
	
	private String vreme;
	private Dvorana dvorana;
	private String tipDogadjaja;
	
	public Event(String vreme, Dvorana dvorana, String tipDogadjaja) {
		super();
		this.vreme = vreme;
		this.dvorana = dvorana;
		this.tipDogadjaja = tipDogadjaja;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}

	public Dvorana getDvorana() {
		return dvorana;
	}

	public void setDvorana(Dvorana dvorana) {
		this.dvorana = dvorana;
	}

	public String getTipDogadjaja() {
		return tipDogadjaja;
	}

	public void setTipDogadjaja(String tipDogadjaja) {
		this.tipDogadjaja = tipDogadjaja;
	}

	@Override
	public String toString() {
		return "Event [vreme=" + vreme + ", tipDogadjaja=" + tipDogadjaja + getDvorana() + "]";
	}



	
}
