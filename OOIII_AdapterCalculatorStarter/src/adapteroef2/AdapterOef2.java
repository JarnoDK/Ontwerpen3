package adapteroef2;

import domein.Calculator;

public class AdapterOef2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator(2, 3);
        long res = calculator.add();
        System.out.println(res);
    }

}
