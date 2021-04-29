package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// subklasse van document dat de lijst met ages opstelt
public class ReportDocument extends Document {

	public List<Page> createPages() {
		return new ArrayList<Page>(Arrays.asList(new  IntroductionPage(), new SummaryPage(), new ConclusionPage(), new BibliographyPage()));
	}
}
