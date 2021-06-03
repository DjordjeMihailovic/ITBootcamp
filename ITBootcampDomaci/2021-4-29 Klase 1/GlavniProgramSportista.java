package Domaci;

public class GlavniProgramSportista {

	public static void main(String[] args) {

		Sportista s1 = new Sportista("Boban Marijanovic", "Kosarka", "Dallas", 11);
		Sportista s2 = new Sportista("Boban Mihailovic", "Kosarka", "Lakers", 13);
		Sportista s3 = new Sportista("Zika Moravac", "Bocanje", "NBGDBK", 96);
		
		System.out.println(s1.getImeIprezime());
		System.out.println(s2.getBrojDres());
		s3.setKlub(null);
		s3.setBrojDres(77);
		System.out.println(s3.toString());
	}

}
