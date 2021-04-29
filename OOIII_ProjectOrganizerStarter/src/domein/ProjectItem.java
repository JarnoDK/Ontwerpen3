package domein;

public abstract class ProjectItem {

	private final String name;
	private final String description;
	private final double rate;
	private final double requiredTime;
	// vat uit subklasse halen en hier als constante definiëren
	private final double VAT = 0.21;

	public ProjectItem(String newName, String newDescription, double newRate, double requiredTime) {
		name = newName;
		description = newDescription;
		rate = newRate;
		this.requiredTime = requiredTime;
	}

	public double getRequiredTime() {
		return requiredTime;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getRate() {
		return rate;
	}

	// getCostEstimate uit subklassen halen en samen in superklasse stoppen 
	public final double getCostEstimate() {
		//double cost = getRequiredTime() * getRate() * getMaterialCost();
		double cost = getRequiredTime() * getRate() + getMaterialsCost();
		if (vatInclusive())
			cost = cost * (1 + VAT);

		return cost;

	}

	// retourneert 0 tenzij subklasse aanpast
	public double getMaterialsCost() {
		return 0;
	}
	
	// retourneert false, tenzij subklasse aanpast
	protected boolean vatInclusive() {
		return false;
	}

	@Override
	public String toString() {
		return getName();
	}



}
