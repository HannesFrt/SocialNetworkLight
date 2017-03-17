package at.social.app;

import at.social.NewsFeed;
import at.social.menu.MenuController;

public class app {

	public static void main(String[] args) {
		NewsFeed newsFeed = new NewsFeed("Ich bin ein Newsfeed");
		MenuController menu = new  MenuController(newsFeed);
		menu.startMenu();
	}
	
}
