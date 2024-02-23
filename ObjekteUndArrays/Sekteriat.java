package ObjekteUndArrays;

import java.util.Scanner;

public class Sekteriat {
	
	private Scanner sc = new Scanner(System.in);
	MitarbeiterLieferantListe sekteriatListe = new MitarbeiterLieferantListe();
	private boolean proglauft = true;
	private String benutzerEingabe = "";
	
	public Sekteriat() {}
	
	public void sekteriatAusgabe() {
		
		while (proglauft) {
            System.out.println("1-Mitarbeiterliste \n2-Mitarbeiter hinzufügen \n3-Lieferantliste \n4-Lieferant hinzufügen \n5-Mitarbeiter suchen \n6-Lieferant suchen \n7-Mitarbeiter löschen \n8-Lieferant löschen\n9-Alle ausgeben \n10-Logout");
            System.out.println("--------------------------------");
            benutzerEingabe = sc.nextLine();
			switch(benutzerEingabe) {
				case "1":
					System.out.println("--------------------------------");
					sekteriatListe.mitarbeiterAusgeben();
					System.out.println("--------------------------------");
					break;
				case "2":
					System.out.println("--------------------------------");
					Mitarbeiter m = new Mitarbeiter();
					System.out.println("Vorname: ");
					m.setVorname(sc.nextLine());
					System.out.println("Nachname: ");
					m.setNachname(sc.nextLine());
					sekteriatListe.miterarbeiterHinzufugen(m);
					System.out.println("--------------------------------");
					break;
				case "3":
					System.out.println("--------------------------------");
					sekteriatListe.lieferantAusgeben();
					System.out.println("--------------------------------");
					break;
				case "4":
					System.out.println("--------------------------------");
					Lieferant l = new Lieferant();
					System.out.println("Vorname: ");
					l.setVorname(sc.nextLine());
					System.out.println("Nachname: ");
					l.setNachname(sc.nextLine());
					sekteriatListe.lieferantHinzufugen(l);
					System.out.println("--------------------------------");
					break;
				case "5":
					System.out.println("--------------------------------");
					sekteriatListe.mitarbeiterVornameNachnameSuchen();
					System.out.println("--------------------------------");
					break;
				case "6":
					System.out.println("--------------------------------");
					sekteriatListe.lieferantVornameNachnameSuchen();
					System.out.println("--------------------------------");
					break;
				case "7":
					System.out.println("--------------------------------");
					sekteriatListe.mitarbeiterVornameNachnameLoschen();
					System.out.println("--------------------------------");
					break;
				case "8":
					System.out.println("--------------------------------");
					sekteriatListe.lieferantVornameNachnameLoschen();
					System.out.println("--------------------------------");
					break;
				case "9":
					System.out.println("--------------------------------");
					sekteriatListe.alleAusgeben();
					System.out.println("--------------------------------");
					break;
				case "10":
					proglauft = false;
					break;
				default:
					System.out.println("Flasche Eingabe");
			}
		}
	}
}
