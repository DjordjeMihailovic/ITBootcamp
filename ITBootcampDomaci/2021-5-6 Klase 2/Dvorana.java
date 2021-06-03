package Domaci;

public class Dvorana {
	
	private String ime;
	private String grad;
	private int kapacitet;
	
	public Dvorana(String ime, String grad, int kapacitet) {
		super();
		this.ime = ime;
		this.grad = grad;
		this.kapacitet = kapacitet;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	@Override
	public String toString() {
		return ",  Dvorana [ime=" + ime + ", grad=" + grad + ", kapacitet=" + kapacitet + "]";
	}
		
}
