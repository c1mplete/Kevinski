package ObjekteUndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MitarbeiterLieferantListe {
	
	private int n = 2;
	private Mitarbeiter[] mitarbeiterListe = new Mitarbeiter[n];
	private Lieferant[] lieferantListe = new Lieferant[n];
	private int ersteNichtInitialisiertePositionM = -1;
	private int ersteNichtInitialisiertePositionL = -1;
	private Scanner sc = new Scanner(System.in);
	private String benutzerEingabe = "";
	
	public void ersteLeerePosition() {
		//erste nicht Initialisierte Position der Mitarbeiterliste finden
		for (int i = 0; i < mitarbeiterListe.length; i++) {
			if(mitarbeiterListe[i] == null) {
				ersteNichtInitialisiertePositionM += 1;
				break;
			}//ende if
		}//ende for-loop
		
		//erste nicht Initialisierte Position der Lieferantliste finden
		for (int i = 0; i < lieferantListe.length; i++) {
			if(lieferantListe[i] == null) {
				ersteNichtInitialisiertePositionL += 1;
				break;
			}//ende if
		}//ende for-loop
	}
	
	//Mitarbeiter hinzufügen
	public void miterarbeiterHinzufugen(Mitarbeiter m) {
		ersteLeerePosition(); 
		uberPrufenM();
		arrayVerlangernM();
		mitarbeiterListe[ersteNichtInitialisiertePositionM] = m;
	}
	
	//Lieferant hinzufügen
	public void lieferantHinzufugen(Lieferant l) {
		ersteLeerePosition();
		uberPrufenL();
		arrayVerlangernL();
		lieferantListe[ersteNichtInitialisiertePositionL] = l;
	}
	
	//Mitarbeiter ausgeben
	public void mitarbeiterAusgeben() {
		for (int i = 0; i < mitarbeiterListe.length; i++) {
			if(mitarbeiterListe[i] != null) {
				System.out.println(mitarbeiterListe[i].toString());
			}//ende if
		}//ende for-loop
	}
	
	//Lieferant ausgeben
	public void lieferantAusgeben() {
		for (int i = 0; i < lieferantListe.length; i++) {
			if(lieferantListe[i] != null) {
				System.out.println(lieferantListe[i].toString());
			}//ende if
		}//ende for-loop
	}
	
	//Mitarbeiter durch eingabe von Vorname suchen
	public void mitarbeiterVornameSuchen(String vorname) {
		for (Mitarbeiter m : mitarbeiterListe) {
			if(m.getVorname().equalsIgnoreCase(vorname)) {
				System.out.println(m.toString());
				break;
			}else {
				System.out.println("Mitarbeiter nicht gefunden!");
				mitarbeiterVornameNachnameSuchen();
				break;
			}//ende if
		}//ende for-loop
	}
	
	//Mitarbeiter durch eingabe von Nachname suchen
	public void mitarbeiterNachnameSuchen(String nachname) {
		for (Mitarbeiter m : mitarbeiterListe) {
			if(m.getNachname().equalsIgnoreCase(nachname)) {
				System.out.println(m.toString());
				break;
			}else {
				System.out.println("Mitarbeiter nicht gefunden!");
				mitarbeiterVornameNachnameSuchen();
				break;
			}//ende if
		}//ende for-loop
	}
	
	//Mitarbeiter durch eingabe von Nachname und Vorname suchen
	public void mitarbeiterVornameNachnameSuchen() {
		String nachname;
		String vorname;
		
		for (Mitarbeiter m : mitarbeiterListe) {
			System.out.println("--------------------------------");
			System.out.println("Wissen Sie den Vornamen und den Nachnamen? ja(1) vorname(2) nachname(3)");
			benutzerEingabe = sc.nextLine();
			switch(benutzerEingabe) {
				case "1":
					System.out.println("--------------------------------");
					System.out.println("Vorname:");
					vorname = sc.nextLine();
					System.out.println("Nachname:");
					nachname = sc.nextLine();
					if(m.getNachname().equalsIgnoreCase(nachname) && m.getVorname().equalsIgnoreCase(vorname)) {
						System.out.println(m.toString());
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Mitarbeiter nicht gefunden!");
						mitarbeiterVornameNachnameSuchen();
						break;
					}
				case "2":
					System.out.println("--------------------------------");
					System.out.println("Vorname:");
					vorname = sc.nextLine();
					if(m.getVorname().equalsIgnoreCase(vorname)) {
						mitarbeiterVornameSuchen(vorname);
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Mitarbeiter nicht gefunden!");
						mitarbeiterVornameNachnameSuchen();
						break;
					}
				case "3":
					System.out.println("--------------------------------");
					System.out.println("Nachname:");
					nachname = sc.nextLine();
					if(m.getNachname().equalsIgnoreCase(nachname)) {
						mitarbeiterNachnameSuchen(nachname);
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Mitarbeiter nicht gefunden!");
						mitarbeiterVornameNachnameSuchen();
						break;
					}
				default:
					System.out.println("--------------------------------");
					System.out.println("Falsche eingabe");
					mitarbeiterVornameNachnameSuchen();
			}//ende switch
			break;
		}//ende for-loop
	}
	
	//Mitarbeiter durch eingabe von Nachname loschen
	public void mitarbeiterNachnameLoschen(String nachname) {
		for (Mitarbeiter m : mitarbeiterListe) {
			if(m.getNachname().equalsIgnoreCase(nachname)) {
				System.out.println(m.toString() + "wurde gelöscht");
				m.setNachname(null);
				m.setVorname(null);
				break;
			}else {
				System.out.println("Mitarbeiter nicht gefunden!");
				mitarbeiterVornameNachnameSuchen();
				break;
			}//ende if
		}//ende for-loop
	}
	
	//Mitarbeiter durch eingabe von Vorname loschen
	public void mitarbeiterVornameLoschen(String vorname) {
		for (Mitarbeiter m : mitarbeiterListe) {
			if(m.getVorname().equalsIgnoreCase(vorname)) {
				System.out.println(m.toString() + "wurde gelöscht");
				m.setNachname(null);
				m.setVorname(null);
				break;
			}else {
				System.out.println("Mitarbeiter nicht gefunden!");
				mitarbeiterVornameNachnameSuchen();
				break;
			}//ende if
		}//ende for-loop
	}
	
	//Mitarbeiter durch eingabe von Nachname und Vorname suchen
	public void mitarbeiterVornameNachnameLoschen() {
		String nachname;
		String vorname;
			
		for (Mitarbeiter m : mitarbeiterListe) {
			System.out.println("--------------------------------");
			System.out.println("Wissen Sie den Vornamen und den Nachnamen von den Mitarbeiter den Sie löschen wollen? ja(1) vorname(2) nachname(3)");
			benutzerEingabe = sc.nextLine();
			switch(benutzerEingabe) {
				case "1":
					System.out.println("--------------------------------");
					System.out.println("Vorname:");
					vorname = sc.nextLine();
					System.out.println("Nachname:");
					nachname = sc.nextLine();
					if(m.getNachname().equalsIgnoreCase(nachname) && m.getVorname().equalsIgnoreCase(vorname)) {
						System.out.println(m.toString() + "wurde gelöscht");
						m.setNachname(null);
						m.setVorname(null);
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Mitarbeiter nicht gefunden!");
						mitarbeiterVornameNachnameSuchen();
						break;
					}
				case "2":
					System.out.println("--------------------------------");
					System.out.println("Vorname:");
					vorname = sc.nextLine();
					if(m.getVorname().equalsIgnoreCase(vorname)) {
						mitarbeiterVornameLoschen(vorname);
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Mitarbeiter nicht gefunden!");
						mitarbeiterVornameNachnameSuchen();
						break;
					}
				case "3":
					System.out.println("--------------------------------");
					System.out.println("Nachname:");
					nachname = sc.nextLine();
					if(m.getNachname().equalsIgnoreCase(nachname)) {
						mitarbeiterNachnameLoschen(nachname);
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Mitarbeiter nicht gefunden!");
						mitarbeiterVornameNachnameSuchen();
						break;
					}
				default:
					System.out.println("--------------------------------");
					System.out.println("Falsche eingabe");
					mitarbeiterVornameNachnameSuchen();
			}//ende switch
			break;
		}//ende for-loop
	}
	
	//Lieferant durch eingabe von Vorname suchen
	public void lieferantVornameSuchen(String vorname) {
		for (Lieferant l : lieferantListe) {
			if(l.getVorname().equalsIgnoreCase(vorname)) {
				System.out.println(l.toString());
				break;
			}else {
				System.out.println("Lieferant nicht gefunden!");
				lieferantVornameNachnameSuchen();
				break;
			}//ende if
		}//ende for-loop
	}
	
	//Lieferant durch eingabe von Nachname suchen
	public void lieferantNachnameSuchen(String nachname) {
		for (Lieferant l : lieferantListe) {
			if(l.getNachname().equalsIgnoreCase(nachname)) {
				System.out.println(l.toString());
				break;
			}else {
				System.out.println("Lieferant nicht gefunden!");
				lieferantVornameNachnameSuchen();
				break;
			}//ende if
		}//ende for-loop
	}
	
	//Lieferant durch eingabe von Nachname und Vorname suchen
	public void lieferantVornameNachnameSuchen() {
		String nachname;
		String vorname;
			
		for (Lieferant l : lieferantListe) {
			System.out.println("Wissen Sie den Vornamen und den Nachnamen? ja(1) vorname(2) nachname(3)");
			benutzerEingabe = sc.nextLine();
			switch(benutzerEingabe) {
				case "1":
					System.out.println("--------------------------------");
					System.out.println("Vorname:");
					vorname = sc.nextLine();
					System.out.println("Nachname:");
					nachname = sc.nextLine();
					if(l.getNachname().equalsIgnoreCase(nachname) && l.getVorname().equalsIgnoreCase(vorname)) {
						System.out.println(l.toString());
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Lieferant nicht gefunden!");
						lieferantVornameNachnameSuchen();
						break;
					}
				case "2":
					System.out.println("--------------------------------");
					System.out.println("Vorname:");
					vorname = sc.nextLine();
					if(l.getVorname().equalsIgnoreCase(vorname)) {
						lieferantVornameSuchen(vorname);
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Lieferant nicht gefunden!");
						lieferantVornameNachnameSuchen();
						break;
					}
				case "3":
					System.out.println("--------------------------------");
					System.out.println("Nachname:");
					nachname = sc.nextLine();
					if(l.getNachname().equalsIgnoreCase(nachname)) {
						lieferantNachnameSuchen(nachname);
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Lieferant nicht gefunden!");
						lieferantVornameNachnameSuchen();
						break;
					}
				default:
					System.out.println("--------------------------------");
					System.out.println("Falsche eingabe");
					lieferantVornameNachnameSuchen();
			}//ende switch
			break;
		}//ende for-loop
	}
		
	//Lieferant durch eingabe von Vorname löschen
	public void lieferantVornameLoschen(String vorname) {
	for (Lieferant l : lieferantListe) {
			if(l.getVorname().equalsIgnoreCase(vorname)) {
				System.out.println(l.toString() + "wurde gelöscht");
				l.setNachname(null);
				l.setVorname(null);
				break;
			}else {
					System.out.println("Lieferant nicht gefunden!");
				lieferantVornameNachnameSuchen();
				break;
			}//ende if
		}//ende for-loop
	}
		
	//Lieferant durch eingabe von Nachname löschen
	public void lieferantNachnameLoschen(String nachname) {
		for (Lieferant l : lieferantListe) {
			if(l.getNachname().equalsIgnoreCase(nachname)) {
				System.out.println(l.toString() + "wrude gelöscht");
				l.setNachname(null);
				l.setVorname(null);
				break;
			}else {
				System.out.println("Lieferant nicht gefunden!");
				lieferantVornameNachnameSuchen();
				break;
			}//ende if
		}//ende for-loop
	}
		
	//Lieferant durch eingabe von Nachname und Vorname löschen
	public void lieferantVornameNachnameLoschen() {
		String nachname;
		String vorname;
				
		for (Lieferant l : lieferantListe) {
			System.out.println("Wissen Sie den Vornamen und den Nachnamen von den Lieferant den Sie löschen wollen? ja(1) vorname(2) nachname(3)");
			benutzerEingabe = sc.nextLine();
			switch(benutzerEingabe) {
				case "1":
					System.out.println("--------------------------------");
					System.out.println("Vorname:");
					vorname = sc.nextLine();
					System.out.println("Nachname:");
					nachname = sc.nextLine();
					if(l.getNachname().equalsIgnoreCase(nachname) && l.getVorname().equalsIgnoreCase(vorname)) {
						System.out.println(l.toString() + "wurde gelöscht");
						l.setNachname(null);
						l.setVorname(null);
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Lieferant nicht gefunden!");
						lieferantVornameNachnameSuchen();
						break;
					}
				case "2":
					System.out.println("--------------------------------");
					System.out.println("Vorname:");
					vorname = sc.nextLine();
					if(l.getVorname().equalsIgnoreCase(vorname)) {
						lieferantVornameLoschen(vorname);
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Lieferant nicht gefunden!");
						lieferantVornameNachnameSuchen();
						break;
					}
				case "3":
					System.out.println("--------------------------------");
					System.out.println("Nachname:");
					nachname = sc.nextLine();
					if(l.getNachname().equalsIgnoreCase(nachname)) {
						lieferantNachnameLoschen(nachname);
						System.out.println("--------------------------------");
						break;
					}else {
						System.out.println("Lieferant nicht gefunden!");
						lieferantVornameNachnameSuchen();
						break;
					}
				default:
					System.out.println("--------------------------------");
					System.out.println("Falsche eingabe");
					lieferantVornameNachnameSuchen();
			}//ende switch
			break;
		}//ende for-loop
	}
			
	public void alleAusgeben() {
		mitarbeiterAusgeben();
		lieferantAusgeben();
	}
	
	//überprüfen ob array voll ist von mitarbeiter
	public boolean uberPrufenM() {
		if(mitarbeiterListe[n-1] != null) {
			return false;
		}else {
			return true;
		}	
	}
	
	//überprüfen ob array voll ist von lieferant
	public boolean uberPrufenL() {
		if(lieferantListe[n-1] != null) {
			return false;
		}else {
			return true;
		}
	}
	
	//array verdoppeln von mitarbeiter
	public void arrayVerlangernM() {
		if(uberPrufenM() == true) {
			n = n * 2;
	        Mitarbeiter[] tempMitarbeiterliste = Arrays.copyOf(mitarbeiterListe, n);
	        mitarbeiterListe = tempMitarbeiterliste;
		}
	}
	
	//array verdoppeln von lieferant
	public void arrayVerlangernL() {
		if(uberPrufenL() == true) {
			n = n * 2;
	        Lieferant[] tempLieferantliste = Arrays.copyOf(lieferantListe, n);
	        lieferantListe = tempLieferantliste;
		}
	}
}
