package domein;

public class ExternalTask extends Task {

    protected final static double VAT = 0.21;

    public ExternalTask(String name, String description, double taskTimeRequired, double rate) {
        super(name, description, taskTimeRequired, rate);
        
    }
    
    // overschijven vatInclusive
    @Override
    protected boolean vatInclusive() {
    	return true;
    }

    // weghalen uit subklasse
//    @Override
//    public double getCostEstimate() {
//        double cost = super.getCostEstimate();
//        return cost * (1 + VAT);
//    }

}
