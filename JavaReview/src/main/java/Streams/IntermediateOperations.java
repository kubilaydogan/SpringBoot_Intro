package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,3,6,5,7,9};
        Stream<Integer> numberStream = Stream.of(arr);
        Stream<Integer> numberStream2 = Stream.of(1,2,3,3,6,5,7,9);
        Stream<Integer> numberStream3 = Arrays.stream(arr);
        Stream<Integer> numberStream4 = Arrays.asList(arr).stream();

        Stream<String> strStream = Stream.of("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango");
        Stream<String> stringStream = Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream();


        System.out.println("***************** FILTER *****************");

        System.out.println( numberStream.filter(n -> n%2 !=0).count() );
        System.out.println( strStream.filter(str -> str.length() == 5).count() );
        System.out.println( stringStream.filter(str -> str.startsWith("A")).count());   //strStream kullanilsa ERROR, cunku onceki satirda kullanildi
        Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream().filter(str -> str.equals("Apple")).forEach(System.out::println);

        System.out.println("*****************MAP*****************");

        Stream.of("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").map(String::toUpperCase).forEach(System.out::println);
        Stream.of(1,2,3,3,6,5,7,9,14).map(number -> number*2).forEach(System.out::println);

        System.out.println("*****************DISTINCT*****************");
        Stream.of("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").distinct().forEach(System.out::println);

        System.out.println("*****************SORTED-ORDER*****************");
        Stream.of(1,2,3,3,6,5,7,9,14).sorted().forEach(System.out::println);

        System.out.println("*****************SORTED-REVERSEORDER*****************");
        Stream.of(1,2,3,3,6,5,7,9,14).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //peek


    }
}
