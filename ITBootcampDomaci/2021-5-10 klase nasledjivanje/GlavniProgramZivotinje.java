package Domaci;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgramZivotinje {

	public static void main(String[] args) {
			
		Ribe r1 = new Ribe("Kicmenjak", "Pastrmka", "Manje ribe", "Slatka", "Peraje1");
		Sisari s1 = new Sisari("Kicmenjak", "Svinja", "Sve zivo", "Bleda", 4);
		Sisari s2 = new Sisari("Kicmenjak", "Konj", "Trava", "Crna", 4);
		
		List<Zivotinja> listaStaniste1 = new ArrayList<Zivotinja>();
		listaStaniste1.add(r1);
		listaStaniste1.add(s1);
		listaStaniste1.add(s2);
		
		Staniste st1 = new Staniste(listaStaniste1, "Novo Selo");
		
		System.out.println(st1.getNaziv());
				
		System.out.println(s2.getNaziv() + " " + s2.getBojaDlake());		
		s2.setBojaDlake("Bela");
		System.out.println(st1.getStaniste1().get(2));
		
	}

}
