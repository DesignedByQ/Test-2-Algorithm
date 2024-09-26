package org.algo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

    public static int sumOfDigits(int number) {

        int currentNumber = 0;

        ArrayList<Integer> digits = new ArrayList<>();

        currentNumber = number % 10;

        int remainder = number / 10;


        //System.out.println(currentNumber);
        //System.out.println(remainder);
        if(!digits.isEmpty())
            System.out.println(digits.get(digits.size()-1));

        while (remainder != 0) {
            digits.add(currentNumber);
            //digits += currentNumber;
            return sumOfDigits(remainder);
        }

        int sum = 0;

        for(int i = 0; i < digits.size(); i++){
            sum += digits.get(i);
        }

//        digits.forEach(integer -> {
//            sum += integer
//        });
        //System.out.println(digits);



//            // Base case: when number reduces to 0, return 0
//            if (number == 0) {
//                return 0;
//            }
//
//            // Get the last digit and make a recursive call with the remaining digits
//            return (number % 10) + sumOfDigits(number / 10);



        return digits.get(0);

    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a single number.");

        int input = s.nextInt();

        sumOfDigits(input);
        //System.out.print(sumOfDigits(1234));

    }


}
