package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static Streams.StreamUtils.*;

public class MainStream {
    public static void main(String[] args) {

        //print ten random numbers
        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = removeEmptyStrings(strings);
        System.out.println(filtered);

        System.out.println(countEmptyStrings(strings));
        System.out.println(getMergedString(strings,","));
        System.out.println(getMergedStringWithStream(strings, "-"));

        System.out.println("******************* Summary *******************");

        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
        getSummaryStatictics(integers);

        System.out.println("******************* Random *******************");

        createMultipleRandomNumbersWithRange(3, 0,100);

        System.out.println("******************* *******************");

    }
}
