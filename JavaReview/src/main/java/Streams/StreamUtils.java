package Streams;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamUtils {


    public static List<String> removeEmptyStrings(List<String> strings){
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        return filtered;
    }

    public static int countEmptyStrings(List<String> strings){
        long count = strings.parallelStream().filter(String::isEmpty).count();              // new style
    //  long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        return (int) count;
    }

    public static int countStringsWithSpecificLenght(List<String> strings, int length){
        long count = strings.stream().filter(x -> x.length()==3).count();
        return (int) count;
    }

    public static List<String> getStringsStartingWith(List<String> strings, String startingWith){
        List<String> filtered = strings.stream().filter(string -> string.startsWith(startingWith)).collect(Collectors.toList());
        return filtered;
    }

    public static String getMergedStringWithStream(List<String> strings, String separator){
        return strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(separator));
    }

    public static String getMergedUppercaseStringWithStream(List<String> strings, String separator){
        return strings.stream().filter(string ->!string.isEmpty()).map(String::toUpperCase).collect(Collectors.joining(separator));
    }

    public static String getMergedString(List<String> strings, String separator){
        StringBuilder sb = new StringBuilder();
        for(String each:strings){
            if(!each.isEmpty()){
                sb.append(each);
                sb.append(separator+" ");
            }
        }
        String mergedString = sb.toString().trim();
        return mergedString.substring(0,mergedString.length()-1);

    }

    public static List<String> getStringWithSpecificLength(List<String> strings, int lenght){
        List<String> filtered = strings.stream().filter(string -> string.length() == lenght).collect(Collectors.toList());
        return filtered;
    }

    public static int countOfStringsWithSpecificLength(List<String> strings, int lenght){
        long count = strings.stream().filter(string -> string.length() == lenght).count();
        return (int)count;
    }

    public static void getSummaryStatictics(List<Integer> integers){
        IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
        System.out.println("Count : " + stats.getCount());
    }

    public static List<Integer> createRandomNumbers(int count, int min, int max){
        Random random = new Random();
        List list = new ArrayList();
        random.ints().limit(10).sorted().forEach(System.out::println);
        return list;
    }

    public static void createMultipleRandomNumbersWithRange(int count, int min, int max){
        Random random = new Random();
        random.ints(count,min,max+1).sorted().forEach(System.out::println);
    }

    public static void createARandomNumber(int count, int min, int max){
        Random random = new Random();
        random.ints(min+0,max+1).sorted().limit(1).forEach(System.out::println);
    }

    public static List<Integer> createMultipleRandomNumbersWithoutRange(int count){
        IntStream is = new Random().ints().limit(count);                //random numbers without range

        List list = new Random().ints().limit(count).boxed().collect(Collectors.toList());
        return list;
    }

    // NOTE
    // new Random().ints(5, 0, 11)
    // new Random().doubles(5, 0, 11)
    // new Random().longs(5, 0, 11)

}

