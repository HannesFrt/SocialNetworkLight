package at.social.einsendung;

import java.util.ArrayList;

public class FotoEinsendung extends Einsendung {
	
	private String dateiname;
	private String �berschrift;
		
	public FotoEinsendung() {
		super("Default", 0, new ArrayList<>(), 0);
		setDateiname("Default");
		set�berschrift("Default");
		
	}
	
	public FotoEinsendung(String autor, int gef�lltAnzahl, ArrayList<String> kommentare, long zeitstempel, String dateiname, String �berschrift) {
		super(autor, gef�lltAnzahl, kommentare, zeitstempel);
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

	@Override
	public String anzeigen() {
		super.anzeigen();
		return "FotoEinsendung [dateiname=" + dateiname + ", �berschrift=" + �berschrift + "]";
	}
	

	
	

}
