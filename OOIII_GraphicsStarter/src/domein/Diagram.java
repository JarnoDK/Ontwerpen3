package domein;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Diagram extends Graphic  {

	// voegt grafieken to aan diagram
	private List<Graphic> graphList;

	
	public Diagram() {
		graphList = new ArrayList<Graphic>();
	}
	public void add(Graphic graphic) {
		graphList.add(graphic);
	}

	public void remove(Graphic graphic) {
		graphList.remove(graphic);
	}

	public Graphic getChild(int index) {
		return graphList.get(index);
	}

	// roept voor elke graph de draw-methode aan
	public void draw() {
		graphList.forEach(Graphic::draw);
	}

}
