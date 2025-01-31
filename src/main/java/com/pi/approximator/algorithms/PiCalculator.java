package com.pi.approximator.algorithms;

public class PiCalculator {

    public static double calculatePi(int decimalPlaces, long maxIterations) {
        double currentPi = 0.0;
        double previousPi = 0.0;
        long N = 1;

        while (true) {
            if (N >= maxIterations) {
                throw new RuntimeException("Klaida: Iteracijų limitas buvo viršytas");
            }

            double totalSumOfCords = 0.0;

            for (long i = 0 ; i < N; i++) {
                double x1 = (double) i / N;
                double y1 = Math.sqrt(1 - x1 * x1);

                double x2 = (double) (i + 1) / N;
                double y2 = Math.sqrt(1 - x2 * x2);

                double lengthOfCord = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
                totalSumOfCords += lengthOfCord;
            }
            currentPi = 2 * totalSumOfCords;

            if (Math.abs(currentPi - previousPi) < Math.pow(10, -decimalPlaces)) {
                break;
            }

            previousPi = currentPi;
            N *= 2;
        }
        return Math.floor(currentPi * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
    }
}
