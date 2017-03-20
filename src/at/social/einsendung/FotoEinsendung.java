package at.social.einsendung;

import java.util.ArrayList;

public class FotoEinsendung extends Einsendung {

	private String dateiname;
	private String überschrift;

	public FotoEinsendung() {
		super("Default", 0, new ArrayList<>());
		setDateiname("Default");
		setÜberschrift("Default");
	}

	public FotoEinsendung(String autor, int gefälltAnzahl, ArrayList<String> kommentare, String dateiname,
			String überschrift) {
		super(autor, gefälltAnzahl, kommentare);
		setDateiname(dateiname);
		setÜberschrift(überschrift);

	}

	public String getDateiname() {
		return dateiname;
	}

	public void setDateiname(String dateiname) {
		this.dateiname = dateiname;
	}

	public String getÜberschrift() {
		return überschrift;
	}

	public void setÜberschrift(String überschrift) {
		this.überschrift = überschrift;
	}

	public String anzeigen() {
		return super.anzeigen() + "\nDatei: " + dateiname + "\nTitel: " + überschrift;
	}

}
