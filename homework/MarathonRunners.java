class MarathonRunners {

    // method to find the index of the fastest runner
    public static int findFastestRunner(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < values.length; i++)

            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }
        return minIndex;
    }

    // method to find the index of the second-best runner
    public static int findSecondBestRunner(int[] values) {
        int secondIdx = -1;
        int minIdx = findFastestRunner(values);
        for (int i = 0; i < values.length; i++) {
            if (i == minIdx)
                continue;
            if (secondIdx == -1 ||
                    values[i] < values[secondIdx])
                secondIdx = i;

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