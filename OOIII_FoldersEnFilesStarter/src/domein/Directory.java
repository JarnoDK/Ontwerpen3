package domein;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Directory extends AbstractFile{
	/**
	 * lijst met enkele files en folders in de folder
	 */
    private List<AbstractFile> files;
    
    // constructor met naam
    public Directory(String name){
        super(name);
        files = new ArrayList<>();
    }
    
    // toevoegen abstract file 
    public void add(AbstractFile obj)
    {
        files.add(obj);
    }
    
    // print voor abstract file
    public  void print(int level)
    {
        String indent = "";
        // per level een tab erbij
        for (int i = 0; i < level; i ++) {
            indent += "\t";
        }
        // verhoog aantal tabs
        level++;
        // print map naam
        System.out.println(indent + "Directory: " + this.getName() + ":");

        // voor elk bestand, print de volgende abstracte files (directory of file)
        for (AbstractFile obj : files)
        {
        	obj.print(level); // print directory of file
        }
        	
    }

    // methode create iterator om over de elementen te gaan
	public Iterator<AbstractFile> createIterator() {
		return files.iterator();
	}
	

    
}

