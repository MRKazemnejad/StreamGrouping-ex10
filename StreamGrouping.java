

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

import static java.util.stream.Collectors.groupingBy;

public class StreamGrouping {



        public static void main(String[] args) {
            List<String> list = new ArrayList<>();

            list.add("Amir");
            list.add("Hatef");
            list.add("Mohammad");
            list.add("Reza");
            list.add("Davood");
            list.add("Mohsen");
            list.add("Ali");
            list.add("Mehran");

            Map<Integer, List<String>> result = list.stream()
                    .collect(groupingBy(String::length));

            System.out.println(result);
        }
    }

