package at.social.einsendung;

import java.util.ArrayList;

public class Einsendung {
	
	private String Autor;
	private int GefälltAnzahl;
	private ArrayList<String> Kommentare;
	private long Zeitstempel;
	
	public Einsendung(String autor, int gefälltAnzahl, ArrayList<String> kommentare, long zeitstempel) {
		setAutor(autor);
		setGefälltAnzahl(gefälltAnzahl);
		setKommentare(kommentare);
		setZeitstempel(zeitstempel);
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
		return "Einsendung [Autor=" + Autor + ", GefälltAnzahl=" + GefälltAnzahl + ", Kommentare=" + Kommentare
				+ ", Zeitstempel=" + Zeitstempel + "]";
	}
	
	
	
	
	
	

	

}
