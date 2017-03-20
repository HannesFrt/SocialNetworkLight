package at.social.einsendung;

import java.util.ArrayList;

public class Einsendung {

	private String Autor;
	private int GefälltAnzahl;
	private ArrayList<String> Kommentare;
	private long Zeitstempel;

	public Einsendung(String autor, int gefälltAnzahl, ArrayList<String> kommentare) {
		setAutor(autor);
		setGefälltAnzahl(gefälltAnzahl);
		setKommentare(kommentare);
		setZeitstempel(System.currentTimeMillis());
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getGefälltAnzahl() {
		return GefälltAnzahl;
	}

	public void setGefälltAnzahl(int gefälltAnzahl) {
		GefälltAnzahl = gefälltAnzahl;
	}

	public ArrayList<String> getKommentare() {
		return Kommentare;
	}

	public void setKommentare(ArrayList<String> kommentare) {
		Kommentare = kommentare;
	}

	public long getZeitstempel() {
		return Zeitstempel;
	}

	public void setZeitstempel(long zeitstempel) {
		Zeitstempel = zeitstempel;
	}

	public String anzeigen() {
		StringBuilder builder = new StringBuilder();
		builder.append("_________________EINSENDUNG_________________\n");
		builder.append("Erstellt von " + Autor + "\n");
		builder.append(GefälltAnzahl + " Gefällt mir\n");
		builder.append("Kommentare: \n");
		for (String s : Kommentare) {
			builder.append(s + "\n");
		}
		long time = (System.currentTimeMillis() - Zeitstempel) / 1000;
		if (time <= 5) {
			builder.append("Gerade eben erstellt.");
		} else {
			builder.append("Vor " + ((System.currentTimeMillis() - Zeitstempel) / 1000) + " Sekunden erstellt");
		}
		return builder.toString();
	}

}
