package at.social.einsendung;

import java.util.ArrayList;

public class Einsendung {
	
	private String Autor;
	private int Gef�lltAnzahl;
	private ArrayList<String> Kommentare;
	private long Zeitstempel;
	
	public Einsendung(String autor, int gef�lltAnzahl, ArrayList<String> kommentare, long zeitstempel) {
		setAutor(autor);
		setGef�lltAnzahl(gef�lltAnzahl);
		setKommentare(kommentare);
		setZeitstempel(zeitstempel);
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
		return "Einsendung [Autor=" + Autor + ", Gef�lltAnzahl=" + Gef�lltAnzahl + ", Kommentare=" + Kommentare
				+ ", Zeitstempel=" + Zeitstempel + "]";
	}
	
	
	
	
	
	

	

}
