package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class NonRepeatingChar {
    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];
    static void getCharCountArray(String str)
    {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }
    static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int index = -1, i;
        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        int index = firstNonRepeating(str);

        System.out.println(
                index == -1
                        ? "Either all characters are repeating or string "
                        + "is empty"
                        : "First non-repeating character is "
                        + str.charAt(index));
        char firstNonRepeatingChar = firstNonRepeatingChar(str);
        System.out.println(firstNonRepeatingChar);
    }
    public static char firstNonRepeatingChar(String word) {
        List<Character> repeating = new ArrayList<>();
        List<Character> nonRepeating = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        return nonRepeating.get(0);
    }
}

