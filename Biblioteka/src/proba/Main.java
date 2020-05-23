package proba;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Biblioteka;
import biblioteka.Knjiga;

public class Main {

	public static void main(String[] args) {
		Autor a1 = new Autor();
		a1.setIme("Autor 1");
		a1.setPrezime("Autor 1 Prezime");
		
		Autor a2 = new Autor();
		a2.setIme("Autor 2");
		a2.setPrezime("Autor 2 Prezime");
		
		Autor a3 = new Autor();
		a3.setIme("Autor 3");
		a3.setPrezime("Autor 3 Prezime");
		Knjiga k1 = new Knjiga();
		LinkedList<Autor> autori = new LinkedList<Autor>();
		autori.add(a1);
		autori.add(a2);
		k1.setAutori(autori);
		k1.setIsbn("12345678");
		k1.setIzdanje(2);
		k1.setIzdavac("Vulkan");
		k1.setNaslov("Knjiga 1");
		
		Knjiga k2 = new Knjiga();
		LinkedList<Autor> autori2 = new LinkedList<Autor>();
		autori2.add(a3);
		k2.setAutori(autori2);
		k2.setIsbn("12345478");
		k2.setIzdanje(4);
		k2.setIzdavac("Vulkan");
		k2.setNaslov("Knjiga 2");
		
		Biblioteka bibl = new Biblioteka();
		bibl.dodajKnjigu(k1);
		bibl.dodajKnjigu(k2);
		System.out.println("Uspesno");
		System.out.println(bibl.vratiSveKnjige().size());
		
		bibl.sacuvajUFile("biblioteka.json");
		System.out.println("Uspesno sacuvano");
		
		bibl.ucitajIzFile("biblioteka.json");
		for (Knjiga knjiga : bibl.vratiSveKnjige()) {			
			System.out.println(knjiga.toString());
		}
		
		
	}

}
