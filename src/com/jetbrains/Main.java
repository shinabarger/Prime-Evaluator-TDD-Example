package com.jetbrains;

public class Main {

    public static void main(String[] args) {
        // write your code here

    }

    public static String oddEven(int input) {

        Boolean x = isPrime(input);
        if (input == 1 || input % 2 == 1 & isPrime(input) != true) return "Odd";
        else if (input % 2 != 1) return "Even";
        else if (input < 2 || input % 2 == 0) return "";

            //prime stuff
        else if (x != null) return "Odd & Prime";

        return Integer.toString(input);
    }

    private static Boolean isPrime(int input) {
        for (int i = 3; i * i <= input; i += 2) {
            if (input % i == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

}

