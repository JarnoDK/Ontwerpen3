package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// subklasse van document dat de lijst van pages opstelt
public class ResumeDocument extends Document {

	public List<Page> createPages() {
		return new ArrayList<Page>(Arrays.asList(new SkillsPage(), new EducationPage(),new ExperiencePage()));

	}
}
