package at.social.menu;

import java.util.ArrayList;
import java.util.Scanner;
import at.social.NewsFeed;
import at.social.einsendung.Einsendung;
import at.social.einsendung.FotoEinsendung;
import at.social.einsendung.NachrichtenEinsendung;

public class MenuController {

	private Scanner scan;
	private NewsFeed newsFeed;

	private Einsendung einsendung = null;

	public MenuController(NewsFeed newsFeed) {
		this.newsFeed = newsFeed;
		scan = new Scanner(System.in);
	}

	public void startMenu() {
		menuAnzeigen();
		getInput();
		einsendung = null;
	}

	private void menuAnzeigen() {
		System.out.println("_________________Menu_________________\n" + " [1] alle Einsendungen anzeigen\n"
				+ " [2] Einsendung von Autor anzeigen\n" + " [3] Einsendung hinzufügen\n" + " [4] Einsendung löschen");
	}

	private void getInput() {
		int eingabe = scan.nextInt();
		switch (eingabe) {
		case 1:
			anzeigen();
			break;
		case 2:
			System.out.println("Geben Sie einen Autor ein");
			scan.nextLine();
			String autor = scan.nextLine();
			vonAnzeigen(autor);
			break;
		case 3:
			einsendungsMenu();
			if (einsendung != null) {
				hinzufügen(einsendung);
			}
			break;
		case 4:
			System.out.println("Geben Sie den Index der zu löschenden Einsendung ein");
			int i = scan.nextInt();
			löschen(--i);
			break;

		default:
			System.out.println("Geben Sie eine gültige Eingabe ein");
			break;
		}
		scan.close();
	}

	private void einsendungsMenu() {
		System.out.println("Einsendungen Auswahl");
		System.out.println("[1] Nachrichteneinsendung");
		System.out.println("[2] Fotoeinsendung");
		System.out.println("[3] abbruch.");
		int auswahl = scan.nextInt();
		if (auswahl == 1) {

			einsendung = new NachrichtenEinsendung();
			einsendungDefault();
			NachrichtenEinsendung n = null;
			if (einsendung instanceof NachrichtenEinsendung) {
				n = (NachrichtenEinsendung) einsendung;
			}
			System.out.println("Geben Sie einen Nachrichtentext ein");
			String text = scan.nextLine();
			n.setNachrichtentext(text);
		} else if (auswahl == 2) {
			einsendung = new FotoEinsendung();
			einsendungDefault();
			FotoEinsendung f = null;
			if (einsendung instanceof FotoEinsendung) {
				f = (FotoEinsendung) einsendung;
			}
			System.out.println("Geben Sie einen Dateinamen an");
			String dateiname = scan.nextLine();
			System.out.println("Geben Sie eine Bildüberschrift ein");
			String überschrift = scan.nextLine();
			f.setDateiname(dateiname);
			f.setÜberschrift(überschrift);

		} else if (auswahl == 0) {
			startMenu();
		} else {
			System.out.println("auswahl nicht gültig");
			einsendungsMenu();
		}
	}

	private void einsendungDefault() {
		System.out.println("Geben Sie einen Autor an");
		scan.nextLine();
		String autor = scan.nextLine();
		einsendung.setAutor(autor);
		einsendung.setGefälltAnzahl(0);
		einsendung.setZeitstempel(System.currentTimeMillis());
		einsendung.setKommentare(new ArrayList<String>());
	}

	private void anzeigen() {
		if (!newsFeed.alleEinsendungenAnzeigen().isEmpty()) {
			for (Einsendung e : newsFeed.alleEinsendungenAnzeigen()) {
				if (e != null) {
					System.out.println(e.anzeigen());
				}
			}
		}
		startMenu();
	}

	private void vonAnzeigen(String a) {
		for (Einsendung e : newsFeed.einsendungVonAnzeigen(a)) {
			if (e != null) {
				System.out.println(e.anzeigen());
			}
		}
		startMenu();
	}

	private void hinzufügen(Einsendung e) {
		if (e != null) {
			newsFeed.einsendungHinzufügen(e);
		}
		startMenu();
	}

	private void löschen(int i) {
		newsFeed.einsendungLöschen(i);
		startMenu();
	}

}
