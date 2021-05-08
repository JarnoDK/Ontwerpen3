package foldersenfiles;

import java.util.Iterator;

import domein.AbstractFile;
import domein.CompositeIterator;
import domein.Directory;
import domein.File;

//Composiet + iterator
public class FilesEnFolders {

    public static void main(String[] args) {
        Directory ont = new Directory("OntwerpenII"), strat = new Directory("Strategy"),
                stratoef = new Directory("Oefeningen");
        File a = new File("Inleiding.pdf", 10), b = new File("Strategy.pdf", 5),
                c = new File("Voorbeeld.rar", 7), d = new File("Opgave.pdf", 20),
                e = new File("Oefening1Starter.rar", 40);
        ont.add(a);
        ont.add(strat);
        strat.add(b);
        strat.add(c);
        stratoef.add(d);
        stratoef.add(e);
        strat.add(stratoef);
        ont.print(0);
    
        // creatie van de iterator
        System.out.println("Met iterator expliciet");
        Iterator<AbstractFile> iterator = new CompositeIterator(ont.createIterator());
        
        // loop over de elementen en controleert of aantal kilobytes groter is dan 10 indien het een file is
        while(iterator.hasNext()) {
        	AbstractFile file = iterator.next();
        	
        	if(file.isFile() && file.getKBytes() >= 10) {
        		file.print(0);
        	}
        }
    }
    

}
