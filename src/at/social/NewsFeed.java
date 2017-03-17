package at.social;

import java.util.ArrayList;

import at.social.einsendung.Einsendung;

public class NewsFeed {

	private String newsText;
	private ArrayList<Einsendung> einsendungen;

	public NewsFeed(String newsText) {
		setNewsText(newsText);
		einsendungen = new ArrayList<>();
	}

	public void einsendungHinzufügen(Einsendung e) {
		if (e != null) {
			einsendungen.add(e);
			System.out.println("Einsendung erfolgreich hinzugefügt.");
		}
	}

	public void einsendungLöschen(Einsendung e) {
		if (e != null) {
			einsendungen.remove(e);
			System.out.println("Einsendung von" + e.getAutor() + "wurde gelöscht.");
		}
	}

	public void einsendungLöschen(int i) {
		if (i < einsendungen.size()) {
			einsendungen.remove(i);
		}
	}

	public ArrayList<Einsendung> einsendungVonAnzeigen(String Autor) {
		ArrayList<Einsendung> eausgabe = new ArrayList<>();

		for (Einsendung e : einsendungen) {
			if (e.getAutor().equals(Autor)) {
				eausgabe.add(e);
			}
		}
		if (eausgabe.isEmpty()) {
			System.out.println("Keine einsendungen von dem Autor " + Autor + " gefunden.");
		}

		return eausgabe;
	}

	public ArrayList<Einsendung> alleEinsendungenAnzeigen() {
		
		ArrayList<Einsendung> alleEinsendungen = new ArrayList<>(einsendungen);
		if(alleEinsendungen.isEmpty()){
			System.out.println("Noch keine Einsendungen vorhanden.");
		}
		return alleEinsendungen;
	}

	public String getNewsText() {
		return newsText;
	}

	public void setNewsText(String newsText) {
		this.newsText = newsText;
	}

	public void setEinsendungen(ArrayList<Einsendung> einsendungen) {
		this.einsendungen = einsendungen;
	}

}
