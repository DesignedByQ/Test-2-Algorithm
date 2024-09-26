package org.algo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

    public static ArrayList<Integer> sumOfDigits(int number) {

        int currentNumber = 0;

        ArrayList<Integer> digits = new ArrayList<>();

        currentNumber = number % 10;

        int remainder = number / 10;

        digits.add(currentNumber);
        System.out.println(currentNumber);
        System.out.println(remainder);
        System.out.println(digits);

        while (remainder != 0) {

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
        System.out.println(digits);
        return digits;

    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a single number.");

        int input = s.nextInt();

        sumOfDigits(input);
        //System.out.print(sumOfDigits(1234));

    }


}
