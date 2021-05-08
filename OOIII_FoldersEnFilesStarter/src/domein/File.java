package domein;

import java.util.Iterator;

public class File extends AbstractFile {

    private int kbytes;

    public File(String name, int kbytes) {
        super(name);
        setKBytes(kbytes);
    }
    // print file
    public void print(int level) {
        String indent = "";
        // per level voeg een tab toe
        for (int i = 0; i < level; i++) {
            indent += "\t";
        }
        // print name + grootte
        System.out.println(indent + getName() + " (" + getKBytes() + " kb)");
    }

    @Override
    public int getKBytes() {
    	// TODO Auto-generated method stub
    	return kbytes;
    }

    private void setKBytes(int bytes) {
        this.kbytes = bytes;
    }
    
    // geen lijst met abstract files, dus aanroepen van een null iterator
	public Iterator<AbstractFile> createIterator() {
		return new NullIterator();
	}
	
	// controleert of het bestand van het type file is en overschrijft deze in abstract file
	@Override
	public boolean isFile() {
		// TODO Auto-generated method stub
		return true;
	}
}
