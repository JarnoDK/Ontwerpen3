package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Class1 {

    private List<String> itemLijst;

    public Class1() {
        String[] itemArray = {"item1", "item2", "item3", "item4"};
        itemLijst = new ArrayList<>(Arrays.asList(itemArray));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Iterator<String> it = itemLijst.iterator();

        //TODO Instantieer adaptor
        
        //Enumeration<String> enumeration = new IteratorEnumeration<String>(it);
        Enumeration<String> enumeration = Collections.enumeration(itemLijst);
        //while (it.hasNext())
        while ( enumeration.hasMoreElements()   ) //TODO gebruik adaptor
        {
            //builder.append(it.next()).append(" ");
            builder.append(enumeration.nextElement()).append(" ");   //TODO gebruik adaptor
        }

        return builder.toString();
    }
}
