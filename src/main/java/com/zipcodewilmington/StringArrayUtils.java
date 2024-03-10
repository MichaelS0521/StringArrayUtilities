package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String num = "";
        for (int i = 0; i < array.length; i++){
            num = array[i];
        }

        return num;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String num = "";
        for (int i = 0; i < array.length-1; i++){
            num = array[i];
        }

        return num;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (int i = 0; i < array.length; i++){
            if(array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length];      //creates a new array the same size as original array.

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length -1 -i];   //reads the original array in reverse = new array.
        }

        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length; i++){
                if(array[i] != array[array.length-1-i]){
                    return false;
                }
            }

        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String combined = String.join("",array).toLowerCase();

        for (char letter : alphabet.toCharArray()) {
            if(combined.indexOf(letter) == -1){
                return false;
            }
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numOccurrences = 0;
        for (String num : array){
            if (num.contains(value)){
                numOccurrences++;
            }
        }
        return numOccurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> returnValues = new ArrayList<>();

        for (String num : array){
            if (!num.equals(valueToRemove)){
                returnValues.add(num);
            }
        }
        return returnValues.toArray(new String[returnValues.size()]);
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> result = new ArrayList<>();

        for (String str : array){
            if (result.isEmpty() || !str.equals(result.get(result.size() -1))) {
                result.add(str);
            }
        }


        return result.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String[] result = new String[array.length];     // create new string array, with length of original array.
        int index = 0;

        StringBuilder currentString = new StringBuilder();
        currentString.append(array[0]);

        for (int i = 1; i < array.length; i++){
            if (array[i] == array[i - 1]) {
                currentString.append(array[i]);
            }else {
                result[index] = currentString.toString();
                index++;
                currentString = new StringBuilder();
                currentString.append(array[i]);
            }
        }

        result[index] = currentString.toString();

        String[] finalResult = new String[index + 1];   // new array with the size of the result.
        System.arraycopy(result, 0, finalResult, 0, index +1);

        System.out.print(Arrays.toString(finalResult));

        return finalResult;
    }

}
