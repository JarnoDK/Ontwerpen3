package foldersenfiles;

import domein.Directory;
import domein.File;

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
    }

}
