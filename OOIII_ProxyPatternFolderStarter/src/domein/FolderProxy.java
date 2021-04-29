package domein;

public class FolderProxy implements Folder {

	private Folder folder;
	private User user;
	private UserManager userManager;
	
	// controleert met behulp van de usermanager of de gebruiker toegang heeft tot de folder
	// indien toegang, roep folder:performOperations aan
	public String performOperations() {
		String mes;
		if(userManager.hasFolderAccess(user)) {
			mes = folder.performOperations();
		}else {
			mes="You don't have access to this folder";
		}
		return mes;
	}

	// definiëren van variabelen
	public FolderProxy(Folder folder,User user, UserManager um) {
		this.folder = folder;
		this.user = user;
		this.userManager = um;
		
		
	}


}
