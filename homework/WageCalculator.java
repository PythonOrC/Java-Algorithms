class WageCalculator {

    public static void calculateWage(double hourlyWage, int hours) {
        if (hourlyWage < 15.0) {
            System.out.println("You must be paid at least $15.00/hour.");
        } else if (hours > 60) {
            System.out.println("You cannot work more than 60 hours in a week.");
        } else {
            double wage = 0.0;
            if (hours > 40) {
                wage = 40 * hourlyWage + (hours - 40) * hourlyWage * 1.5;
            } else {
                wage = hours * hourlyWage;
            }
            System.out.println("You earned $" + wage + " this week.");
        }
    }

    public static void main(String[] args) {
        calculateWage(9.99, 50);
        calculateWage(15.00, 50);
        calculateWage(25.00, 63);
    }
}