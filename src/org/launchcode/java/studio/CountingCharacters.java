package org.launchcode.java.studio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountingCharacters {

    static void jSharpMethod(String text){
        char[] chars = text.toCharArray();
        HashMap<Character, Integer> countUp = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            Integer count = 0;
            for (char x : chars) {
                if (x == chars[i]) {
                    count++;
                }
                countUp.put(chars[i], count);
            }
        }

        for (HashMap.Entry<Character, Integer> entry : countUp.entrySet()) {
            System.out.println(entry.getKey().toString() + " :" + entry.getValue());
        }
    }

    static void hashMapMethod(String text){
        HashMap<Character, Integer> counts = new HashMap<>();

        for (char c : text.toCharArray()){
            Integer newCount = counts.getOrDefault(c, 0) + 1;
            counts.put(c, newCount);
        }
    }
    static void listMethod(String text){
        ArrayList<Integer> counts = new ArrayList<>();

        for (int i = 0; i < 128; i++){
            counts.add(0);
        }
        for (char c : text.toCharArray()){
            Integer newCount = counts.get(c) + 1;
            counts.add(c, newCount);
        }
        for (char c = 0; c < 128; c++){
            Integer count = counts.get(c);
            if (count > 0) {
                System.out.println(c + ": " + count);
            }
        }

    }

    public static void main(String[] args) {
        String test = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        jSharpMethod(test);

    }
}



