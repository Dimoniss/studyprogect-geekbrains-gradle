package javaPart2.lessonTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayWords = new ArrayList<>();
        arrayWords.add("Ben1");
        arrayWords.add("Ben2");
        arrayWords.add("Ben3");
        arrayWords.add("Ben4");
        arrayWords.add("Ben5");
        arrayWords.add("Ben6");
        arrayWords.add("Ben7");
        arrayWords.add("Ben1");
        arrayWords.add("Ben8");
        arrayWords.add("Ben9");
        arrayWords.add("Ben10");
        arrayWords.add("Ben11");
        arrayWords.add("Ben12");
        arrayWords.add("Ben10");
        arrayWords.add("Ben13");
        arrayWords.add("Ben14");
        arrayWords.add("Ben10");
        arrayWords.add("Ben15");
        arrayWords.add("Ben16");
        arrayWords.add("Ben1");

        //Find and display a list of unique words that make up an array
        Set<String> setWords = new HashSet<>(arrayWords);
        System.out.println(setWords.toString());

        //Count how many times each word occurs
        HashMap<String, Integer> mapWords = new HashMap<>();
        for (String key : arrayWords) {
            if (mapWords.containsKey(key)) {
                int counter = mapWords.get(key);
                mapWords.put(key, counter+1);
            } else {
                mapWords.put(key, 1);
            }
        }
        System.out.println(mapWords.toString());

        System.out.println(Phonebook.getPhonebookMap().toString());
        Phonebook.add("Ben", "348856699");
        Phonebook.add("Ben", "8995544555");
        Phonebook.add("Alan", "7885544499");
        Phonebook.add("Alesya", "2253334488");
        Phonebook.add("Alan", "5556699922");
        Phonebook.add("Jorg", "355857799");
        Phonebook.add("Kelly", "357756699");
        System.out.println(Phonebook.getPhonebookMap().toString());
        Phonebook.get("Ben");
        Phonebook.get("Kelly");
        Phonebook.get("Alan");
    }


}
