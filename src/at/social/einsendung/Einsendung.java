package at.social.einsendung;

import java.util.ArrayList;

public class Einsendung {

	private String Autor;
	private int Gef�lltAnzahl;
	private ArrayList<String> Kommentare;
	private long Zeitstempel;

	public Einsendung(String autor, int gef�lltAnzahl, ArrayList<String> kommentare) {
		setAutor(autor);
		setGef�lltAnzahl(gef�lltAnzahl);
		setKommentare(kommentare);
		setZeitstempel(System.currentTimeMillis());
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getGef�lltAnzahl() {
		return Gef�lltAnzahl;
	}

	public void setGef�lltAnzahl(int gef�lltAnzahl) {
		Gef�lltAnzahl = gef�lltAnzahl;
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
		builder.append(Gef�lltAnzahl + " Gef�llt mir\n");
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
