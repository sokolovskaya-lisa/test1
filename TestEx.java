package com.company;

import java.util.Scanner;

public class TestEx {

    public String[] fillSecondArray(String[] firstArray) {

        String[] secondArray = new String[4];

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = firstArray[i * 2];
        }

        return secondArray;
    }

    public String[] fillFirstArray() {

        Scanner input = new Scanner(System.in);
        System.out.println ("Fill the first array: ");
        String[] inputArray = new String [9];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = input.nextLine();
        }
        return inputArray;
    }

    public String start() {
        String[] firstArray = fillFirstArray();
        String[] secondArray = fillSecondArray(firstArray);
        String output = "";


        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    output += "1";
                    break;
                }
                if (j == secondArray.length - 1) {
                    output += "0";
                }
            }
        }
        System.out.println(output);
        return output;
    }
}
