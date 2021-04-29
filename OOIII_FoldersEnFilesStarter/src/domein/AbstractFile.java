package domein;

/**
 * Superklasse voor file en directory
 * bevat print (gedefinieerd in subklasse) en enkele gedeelde methoden/variabele (naam + getter/setter)
 * @author jarno
 *
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
}
