package com.example.source_dsa.Patterns.interview_codedecode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Questions {

    public static void main(String[] args) {

        boolean isogram = true;
        String question = "key";
        char[] chars = question.toCharArray();
        //no indexing maintained
        Set<Character> set = new HashSet<>();
        //indexing maintained
        Set<Character> set1 = new LinkedHashSet<>();
        for (Character c : chars) {
        //because set contains only unique elements
            if (set.contains(c)) {
                isogram = false;
            } else {
                set.add(c);
            }
        }

    }

}
