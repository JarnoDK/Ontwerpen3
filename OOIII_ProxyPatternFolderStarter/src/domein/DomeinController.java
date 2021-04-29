package domein;

public class DomeinController {

    private UserManager userManager;

    // variabele voor folderimplementatie
    private FolderImplementatie folderImpl;

	public DomeinController() {
        initUserManager();
        // instantiëren van folderimplementatie
        folderImpl = new FolderImplementatie();
    }

    public String performFolderOperation(String name, String passwd) {
        String mes=null;
        User user = userManager.getUser(name, passwd);
        if (user!=null){

        	// proxy opstellen
            Folder proxy = new FolderProxy(folderImpl, user, userManager);
            mes = proxy.performOperations();
        }
        else {
            mes = "Invalid user/passwd";
        }
        return mes;
    }

    private void initUserManager() {
        userManager = new UserManager();
        userManager.addUser(new User("Jan", "JanPass"), true);
        userManager.addUser(new User("Piet", "PietPass"), true);
        userManager.addUser(new User("Joris", "JorisPass"), false);
        userManager.addUser(new User("Corneel", "CorneelPass"), false);
    }
}