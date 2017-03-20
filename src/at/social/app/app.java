package at.social.app;

import java.util.ArrayList;
import at.social.NewsFeed;
import at.social.einsendung.Einsendung;
import at.social.einsendung.FotoEinsendung;
import at.social.einsendung.NachrichtenEinsendung;
import at.social.menu.MenuController;

public class app {

	public static void main(String[] args) {
		
		
		//Einfache darstellung der Ersetzbarkeit und dynmischen Bindung der Codebasis
		/*
		Einsendung nachricht = new NachrichtenEinsendung("Hannes", 2000, null, (System.currentTimeMillis() % 1000), "Meine Nachricht");
		Einsendung foto = new FotoEinsendung("Phillipp", 0, null, (System.currentTimeMillis() % 1000), "haus.png", "Mein Haus");
		ArrayList<Einsendung> einsendungen = new ArrayList<>();
		einsendungen.add(nachricht);
		einsendungen.add(foto);
		
		for(Einsendung e : einsendungen){
			e.anzeigen();
		}
		*/
		
		
		
		//Code zum Ausführen des Menüs
		NewsFeed newsFeed = new NewsFeed("Ich bin ein Newsfeed");
		MenuController menu = new  MenuController(newsFeed);
		menu.startMenu();
		
	}
	
}
