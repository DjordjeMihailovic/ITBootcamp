package Domaci;

public class GlavniProgramDogadjaj {

	public static void main(String[] args) {
		
		Dvorana d1 = new Dvorana("Arena", "Beograd", 10000);
		Dvorana d2 = new Dvorana("Spens", "Novi Sad", 7000);
		
		Event e1 = new Event("22:00", d1, "koncert");
		Event e2 = new Event("18:00", d1, "cirkus");
		Event e3 = new Event("19:00", d2, "opera");
		
		System.out.println(e1.toString());
		e1.setVreme("23:00");
		e1.setDvorana(d2);
		System.out.println(e1.toString());
		
		

	}

}
