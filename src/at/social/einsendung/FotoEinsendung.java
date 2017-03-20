package at.social.einsendung;

import java.util.ArrayList;

public class FotoEinsendung extends Einsendung {

	private String dateiname;
	private String �berschrift;

	public FotoEinsendung() {
		super("Default", 0, new ArrayList<>());
		setDateiname("Default");
		set�berschrift("Default");
	}

	public FotoEinsendung(String autor, int gef�lltAnzahl, ArrayList<String> kommentare, String dateiname,
			String �berschrift) {
		super(autor, gef�lltAnzahl, kommentare);
		setDateiname(dateiname);
		set�berschrift(�berschrift);

	}

	public String getDateiname() {
		return dateiname;
	}

	public void setDateiname(String dateiname) {
		this.dateiname = dateiname;
	}

	public String get�berschrift() {
		return �berschrift;
	}

	public void set�berschrift(String �berschrift) {
		this.�berschrift = �berschrift;
	}

	public String anzeigen() {
		return super.anzeigen() + "\nDatei: " + dateiname + "\nTitel: " + �berschrift;
	}

}
