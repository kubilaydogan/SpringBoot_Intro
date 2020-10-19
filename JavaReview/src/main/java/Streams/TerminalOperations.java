package Streams;

import Core.Role;
import Core.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

        System.out.println("*****************COUNT*****************");
        long count = Stream.of(1,2,3,3,6,5,7,9,14).count();
        System.out.println(count);

        long appleCount = Stream.of("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").filter(str -> str.equals("Apple")).count();
        System.out.println(appleCount);

        System.out.println("*****************MIN-MAX*****************");
        int min = Stream.of(1,2,3,3,6,5,7,9,14).min(Integer::compareTo).get();
        int max = Stream.of(1,2,3,3,6,5,7,9,14).max(Integer::compareTo).get();

        System.out.println(min + " | " + max);

        System.out.println("*****************ALLMATCH - ANYMATCH- NONEMATCH*****************");
        List<Integer> list = Arrays.asList(3,4,6,12,20);

        boolean answer1 = list.stream().anyMatch(n -> (n * (n+1)) / 4 == 5);
        boolean answer2 = list.stream().allMatch(n -> (n * (n+1)) / 4 == 5);
        boolean answer3 = list.stream().noneMatch(n -> (n * (n+1)) / 4 == 5);

        System.out.println(answer1 + "|" + answer2 + "|" + answer3);

        System.out.println("*****************FOR EACH*****************");
        Stream.of(3,4,6,12,20).forEach(n -> System.out.println(n*2));

        System.out.println("*****************REDUCE*****************");
        int result = Stream.of(3,4,6,12,20).reduce(5, Integer::sum);
        System.out.println(result);

        List<String> characters = Arrays.asList("C", "Y", "B", "E", "R", "T", "E", "K");
        String word = characters.stream().reduce("",(a,b) -> a + b);

        System.out.println("*****************FIND FIRST - FIND ANY*****************");
        Role r = Utils.createRoleList().stream().filter(role -> role.getDescription().equals("Employee")).findFirst().get();
        System.out.println(r.getId());

        Role r2 = Utils.createRoleList().stream().filter(role -> role.getDescription().equals("Employee")).findAny().get();
        System.out.println(r2.getId());

        System.out.println("*****************COLLECT*****************");
        List<String> appleList = Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango")
                .stream()
                .filter(s -> s.equals("Apple"))
                .collect(Collectors.toList());

        System.out.println(appleList.stream().count());






    }
}
