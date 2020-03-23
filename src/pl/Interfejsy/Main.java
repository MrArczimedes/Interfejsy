package pl.Interfejsy;

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Co chcesz robić? (multi or add)");
        Scanner myScanner = new Scanner(System.in);
        if (myScanner.hasNext("multiply")){
            return true;
        }
        return false;
    }

    private double getArgument() {
        Scanner myScanner = new Scanner(System.in);
        return myScanner.nextInt();
    }
}