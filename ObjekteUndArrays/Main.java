package ObjekteUndArrays;

public class Main {

	public static void main(String[] args) {
		MitarbeiterObjectList mitarbeiterListe = new MitarbeiterObjectList();

		Mitarbeiter m1 = new Mitarbeiter("Roland", "Marini");
		Mitarbeiter m2 = new Mitarbeiter("Alex", "Raffl");
		Mitarbeiter m3 = new Mitarbeiter("Max", "Mustermann");

		mitarbeiterListe.addMitarbeiter(m1);
		mitarbeiterListe.addMitarbeiter(m3);
		mitarbeiterListe.mitarbeiterAnBestimmterPositionEingeben(0,m2);
		mitarbeiterListe.mitarbeiterAnBestimmterPositionUpdaten(1,m3);
		mitarbeiterListe.printMitarbeiter();


		//mitarbeiterListe.mitarbeiterEingebenAlsGesamtString();
		mitarbeiterListe.mitarbeiterSuchen("Raffl");
		mitarbeiterListe.mitarbeiterLoeschen("Raffl");
		mitarbeiterListe.printMitarbeiter();
		//mitarbeiterListe.printMitarbeiter();
	}

}
