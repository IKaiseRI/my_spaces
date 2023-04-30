package ex2;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        //Generating a random list
        List<Short> list = random
                .ints(20,0,30)
                .mapToObj(x -> (short) x)
                .sorted()
                .collect(Collectors.toList());
        //Print list for proofs
        System.out.println(list);

        //Creating a set which will contain the filtered list + 15
        Set<Short> set = Stream
                .of(list.stream()
                                .filter(x -> x > 10)
                                .toList(), List.of((short)15))
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
        //Print set for proofs
        System.out.println(set);
    }
}
