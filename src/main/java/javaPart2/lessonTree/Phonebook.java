package javaPart2.lessonTree;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private static Map<String, String> phonebookMap = new HashMap<>();


    public static Map<String, String> getPhonebookMap() {
        return phonebookMap;
    }

    public static void setPhonebookMap(Map<String, String> phonebookMap) {
        Phonebook.phonebookMap = phonebookMap;
    }

    public static void add(String lastName, String phoneNumber) {
        if (!Phonebook.phonebookMap.containsKey(lastName)) {
            Phonebook.phonebookMap.put(lastName, phoneNumber);
        } else {
            String numbers = Phonebook.phonebookMap.get(lastName) + "/" + phoneNumber;
            Phonebook.phonebookMap.put(lastName, numbers);
        }
    }

    public static void get(String lastName) {
        if (Phonebook.phonebookMap.get(lastName).contains("/")) {
            String[] numberSplits = Phonebook.phonebookMap.get(lastName).split("/");
            System.out.println("name : " + lastName);
            for (int i = 0; i < numberSplits.length; i++) {
                System.out.println("phone #" + (i+1) + ": " + numberSplits[i]);
            }
        } else {
            System.out.println("name : " + lastName);
            System.out.println("phone #1: " + Phonebook.phonebookMap.get(lastName));
        }
    }
}
