package org.algo;

import java.util.ArrayList;

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

        ///do i need a scanner
        sumOfDigits(1234);
        //System.out.print(sumOfDigits(1234));

    }


}
