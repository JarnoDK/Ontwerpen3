package domein;

import java.util.Iterator;

/**
 * Superklasse voor file en directory bevat print (gedefinieerd in subklasse) en enkele gedeelde methoden/variabele (naam + getter/setter)
 * @author  jarno
 */
public abstract class AbstractFile {

	private String name;
	

	public abstract void print(int level);

	
	public AbstractFile(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	// wordt geïnstantieerd in file en directory
	public abstract Iterator<AbstractFile> createIterator();
	
    public int getKBytes() {
        return 0;
    }
    // wordt overschreven indien het een file is
    public boolean isFile() {
    	return false;
    }

}
