package sdl.edi.wf.snippetmenu;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.layout.VBox;

public class snippetmenu {

	
	public ContextMenu getXQUERYSnippetMenu() {
		
		ContextMenu ctxmenu = new ContextMenu();
		
		Menu  mnu1 = new Menu();
		Menu  mnu12 = new Menu();
		Menu  mnu13 = new Menu();
		CustomMenuItem custommenu1 = new CustomMenuItem();
		CustomMenuItem custommenu2 = new CustomMenuItem();
		
		
		
		
		return ctxmenu;
				
		
	}
	
	
	
	
	
	private CustomMenuItem getCodePreviewMenu(String code) {
		CustomMenuItem custommenu = new CustomMenuItem();
		VBox menuvbox = new VBox();
		
		
		return custommenu;
		
	}
	 
}
