// Here is a hint if you are stuck

class MarathonRunners {

    // method to find the index of the fastest runner
    public static int findFastestRunner(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < values.length; i++)
            // add if statement to check if the current value is less than the current
            // minimum value
            // if so, update the minimum value and the index of the minimum value
            return minIndex;
    }

    // method to find the index of the second-best runner
    public static int findSecondBestRunner(int[] values) {
        int secondIdx = -1;
        int minIdx = findFastestRunner(values);
        for (int i = 0; i < values.length; i++) {
            // add if statement to check if the current index is the same as the index of
            // the fastest runner
            // if so, continue to the next iteration of the loop

            // add if statement to check if the secondIdx is -1 or if the current value is
            // less than the value at the secondIdx index
            // if so, update the secondIdx to the current index
        }

        return secondIdx;

    }

    public static void main(String[] args) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        // call method to find the index of the fastest runner
        // print out the name and time of the fastest runner
        int fastestIndex = findFastestRunner(times);
        System.out.println("Fastest runner: " + names[fastestIndex] + " (" + times[fastestIndex] + " minutes)");

        // call method to find the index of the second-best runner
        // print out the name and time of the second-best runner
        int secondBestIndex = findSecondBestRunner(times);
        System.out
                .println("Second-best runner: " + names[secondBestIndex] + " (" + times[secondBestIndex] + " minutes)");
    }
}