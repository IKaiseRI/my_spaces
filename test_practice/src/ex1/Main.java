package ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Need 2 scanners in order to avoid a bug
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        //Map where the words will be stored according to the length
        Map<Integer, List<String>> map = new HashMap<>();

        //Initial list
        List<String> list;

        //String builder that will store the initially scanned string
        StringBuilder word = new StringBuilder();

        int variant = 0;
        while (variant != 3) {
            System.out.println("1. Insert a new word");
            System.out.println("2. Show map");
            System.out.println("3. Exit");
            variant = scanner1.nextInt();
            switch (variant) {
                case 1 -> {
                    System.out.println("Insert a word: ");
                    word.append(scanner.nextLine());
                    //If the map already contains some words with same length it will just add the word to the according list
                    if (map.containsKey(word.length())) {
                        list = map.get(word.length());
                        list.add(word.toString());
                        map.put(word.length(), list);
                    }
                    //If the map doesn't contain any word with the according length, a new array list will be created with the according key
                    else {
                        List<String> list1 = new ArrayList<>();
                        list1.add(word.toString());
                        map.put(word.length(), list1);
                    }
                    word.setLength(0);
                }
                //Print the map
                case 2 -> System.out.println(map);
                //Exit
                case 3 -> System.exit(0);
            }
        }
    }

}