class WageCalculator {

    public static void calculateWage(double hourlyWage, int hours) {
        /*
         * think about the possible cases and write the code to handle them
         * 
         * case 1: hourlyWage < 15.0
         * - give error
         * case 2: hours > 60
         * - give error
         * case 3: hours > 40 and hours <= 60
         * - calculate wage with overtime
         * case 4: hours <= 40
         * - calculate wage
         */
    }

    public static void main(String[] args) {
        calculateWage(9.99, 50);
        calculateWage(15.00, 50);
        calculateWage(25.00, 63);
    }
}