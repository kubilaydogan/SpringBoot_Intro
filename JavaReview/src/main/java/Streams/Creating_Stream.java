package Streams;

import Core.Role;
import Core.Utils;

import java.util.Arrays;
import java.util.stream.Stream;

public class Creating_Stream {
    public static void main(String[] args) {

        //Creating a Stream from an Array
        String[] courses = {"Java","Selenium","API","SQL"};
        Stream<String> courseStream = Arrays.stream(courses);

        //Creating a Stream from a Collection
        Stream<Role> roleStream = Utils.createRoleList().stream();

        //Creating a Stream from Specified Values
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);


    }
}
