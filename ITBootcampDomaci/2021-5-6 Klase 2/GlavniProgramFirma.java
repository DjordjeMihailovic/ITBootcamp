package Domaci;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgramFirma {

	public static void main(String[] args) {
		
		Zaposleni z1 = new Zaposleni("Marija_Milovanovic", "Crni mag", 80000);
		Zaposleni z2 = new Zaposleni("Boban_Mihailovic", "QA", 81000);
		Zaposleni z3 = new Zaposleni("Nikola_Vekaric", "Ekonomista", 25000);
		Zaposleni z4 = new Zaposleni("Marko_Vekaric", "Dev", 250000);
		Zaposleni z5 = new Zaposleni("Pavle_Jovanovic", "Arhivista", 15000);
		Zaposleni z6 = new Zaposleni("Afan_Smajic", "MS teams manager", 4000000);
		
		List<Zaposleni> listaZaposlenih1 = new ArrayList<Zaposleni>();
		listaZaposlenih1.add(z3);
		listaZaposlenih1.add(z5);
		
		List<Zaposleni> listaZaposlenih2 = new ArrayList<Zaposleni>();
		listaZaposlenih2.add(z1);
		listaZaposlenih2.add(z2);
		listaZaposlenih2.add(z4);
		listaZaposlenih2.add(z6);
		
		Firma f1 = new Firma("Delloite", "Beograd", listaZaposlenih1);
		Firma f2 = new Firma("Nordeus", "Beograd", listaZaposlenih2);
		
		System.out.println(z1.toString());
		System.out.println(f1.toString());
		
		/* Nisam uspeo samo ispisem samo prezimena, ne pada mi napament nikako kako da dodjem do toga iz liste
		System.out.println(f2.getZaposleni());
		*/
	}
}
