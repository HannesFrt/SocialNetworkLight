package at.social.einsendung;

import java.util.ArrayList;

public class NachrichtenEinsendung extends Einsendung {

	private String Nachrichtentext;

	public NachrichtenEinsendung() {
		super("Default", 0, new ArrayList<>());
		setNachrichtentext("Default");

	}

	public NachrichtenEinsendung(String autor, int gefälltAnzahl, ArrayList<String> kommentare,
			String nachrichtentext) {
		super(autor, gefälltAnzahl, kommentare);
		setNachrichtentext(nachrichtentext);
	}

	public String getNachrichtentext() {
		return Nachrichtentext;
	}

	public void setNachrichtentext(String nachrichtentext) {
		Nachrichtentext = nachrichtentext;
	}

	public String anzeigen() {

		return super.anzeigen() + "\nNachricht:" + Nachrichtentext;
	}

}
