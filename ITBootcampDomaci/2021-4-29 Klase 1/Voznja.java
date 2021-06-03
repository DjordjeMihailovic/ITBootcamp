package Domaci;

public class Voznja {

	public static void main(String[] args) {
		
		Vozilo v1 = new Vozilo("Fiat", "Punto", 123, "Boban");
		Vozilo v2 = new Vozilo("BMW", "X5", 1234, "Bobina");
		
		System.out.println(v1.getMarka());
		System.out.println(v2.getModel());
		System.out.println(v2.getVlasnik());
		v2.setVlasnik("Bobardo");
		System.out.println(v2.getVlasnik());
	}	
}
