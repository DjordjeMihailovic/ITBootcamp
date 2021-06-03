package Domaci;

import java.util.ArrayList;
import java.util.List;

import KoronaZadatak.ClanStaba;

public class GlavniProgramPutovanja {

	public static void main(String[] args) {
		
		Putnici p1 = new Putnici ("Boban", "Mihailovic", 123456);
		Putnici p2 = new Putnici ("Bobina", "Obradovic", 1234567);
		Putnici p3 = new Putnici ("Bob", "Milovanovic", 12345678);
		
		List<Putnici> listaPutnika1 = new ArrayList<Putnici>();
		listaPutnika1.add(p1);
		listaPutnika1.add(p2);
		listaPutnika1.add(p3);
	
		Putovanje put1 = new Putovanje("Zlatibor", 350, listaPutnika1);
		
		List<Putnici> listaPutnika2 = new ArrayList<Putnici>();
		listaPutnika2.add(p1);
		listaPutnika2.add(p2);
		
		Putovanje put2 = new Putovanje("Vinca", 100, listaPutnika2);
		
		List<Putnici> listaPutnika3 = new ArrayList<Putnici>();
		listaPutnika2.add(p3);
		
		Putovanje put3 = new Putovanje("Maldivi", 3000, listaPutnika3);
		
		List<Putovanje> Ponuda = new ArrayList<Putovanje>();
		Ponuda.add(put1);
		Ponuda.add(put2);
		Ponuda.add(put3);
		
		Ponuda.remove(put2);
		
		System.out.println(put3.getCenaAranzmana());
		
		
		
				
	}

}
