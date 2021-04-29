package domein;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Beyonce 
{
	private int aantalKeerGezongen;
	
	private static Beyonce INSTANCE = new Beyonce();
	private static Beyonce IMITATOR = new BeyonceImitator();
	
	// private constructor
	private Beyonce() {
	}
	
	// Beyonce.getInstance()
	// als dag = vrijdag <-- imitator beyonce 
	// anders instance
	public static Beyonce getInstance() {
		return LocalDateTime.now().getDayOfWeek() == DayOfWeek.FRIDAY?IMITATOR:INSTANCE;
	}
	

	// indien instance, roep deze methode aan
	public void zingEenLied() {
		++aantalKeerGezongen;
		System.out.println("Ik zong "+ aantalKeerGezongen + " keer");
	}
	
	private static class BeyonceImitator extends Beyonce {
		
		// indien imitator
		// roep deze methode aan
		@Override
		public void zingEenLied() {
			// TODO Auto-generated method stub
			System.out.println("Imitator van beyonce zingt");
		}
	}
}
