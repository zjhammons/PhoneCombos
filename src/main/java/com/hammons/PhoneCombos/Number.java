package com.hammons.PhoneCombos;

import java.util.*;

public class Number {
    // Map each number to their alpha values
    static Map<Character, String> digitToAlpha = new HashMap<>();
    static {
        digitToAlpha.put('1', "1");
        digitToAlpha.put('2', "2ABC");
        digitToAlpha.put('3', "3DEF");
        digitToAlpha.put('4', "4GHI");
        digitToAlpha.put('5', "5JKL");
        digitToAlpha.put('6', "6MNO");
        digitToAlpha.put('7', "7PQRS");
        digitToAlpha.put('8', "8TUV");
        digitToAlpha.put('9', "9WXYZ");
        digitToAlpha.put('0', "0");
    }
    private String phoneNumber;
    // results stored in a list
    private List<String> results = new ArrayList<>();
    // string to combine combination of chars
    private String s ="";

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void  setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    // Takes the phone number and returns all possible combinations
    public List<String> getCombos(String phoneNumber){

        int[] index = new int[phoneNumber.length()];
        // Infinite loop until return is reached
        while (true) {
            // Add combination to string s
            for (int i = 0; i < phoneNumber.length(); i++) {
                s += (digitToAlpha.get(phoneNumber.charAt(i)).charAt(index[i]));
            }
            // Add combo to results, clear s
            results.add(s);
            s = "";
            // Advance to next combination
            for (int j = phoneNumber.length() - 1; ++index[j] == digitToAlpha.get(phoneNumber.charAt(j)).length();) {
                System.out.println(j);
                index[j] = 0;
                if (--j < 0) {
                    results.remove(0); // remove first result that is just the phone number
                    return results; // return list of combinations
                }
            }
        }
    }
}
