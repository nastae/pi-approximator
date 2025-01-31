package com.pi.approximator;

import com.pi.approximator.algorithms.PiCalculator;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Klaida: Prašome pateikti dešimtainių vietų skaičių per komandinę eilutę");
            return;
        }

        int decimalPlaces = 0;
        try {
            decimalPlaces = Integer.parseInt(args[0]);
            if (decimalPlaces < 1 || decimalPlaces > 10) {
                System.out.println("Klaida: Prašome pateikti dešimtainių vietų skaičių nuo 1 iki 10");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Klaida: Pateikta reikšmė nėra teisingas sveikasis skaičius");
            return;
        }

        try {
            double piApproximation  = PiCalculator.calculatePi(decimalPlaces, 2147483647);
            System.out.println("Apytikslė Pi reikšmė: " + piApproximation);
        } catch (RuntimeException e) {
            System.out.println("Klaida: " + e.getMessage());
        }
    }
}
