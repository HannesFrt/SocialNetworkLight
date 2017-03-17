package at.social.einsendung;

import java.util.ArrayList;

public class NachrichtenEinsendung extends Einsendung {
	
	private String Nachrichtentext;

	public NachrichtenEinsendung(String autor, int gefälltAnzahl, ArrayList<String> kommentare, long zeitstempel, String nachrichtentext) {
		super(autor, gefälltAnzahl, kommentare, zeitstempel);
		setNachrichtentext(nachrichtentext);
	}

	public String getNachrichtentext() {
		return Nachrichtentext;
	}

	public void setNachrichtentext(String nachrichtentext) {
		Nachrichtentext = nachrichtentext;
	}
	
	
	public String anzeigen() {
	    super.anzeigen();
	    return "NachrichtenEinsendung [Nachrichtentext=" + Nachrichtentext + "]";
	}

}
