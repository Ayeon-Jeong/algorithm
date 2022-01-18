package HashMap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class maptest {

    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop", "oldpop"};
        int[] plays = {500, 600, 150, 800, 2500, 1000};

        Map<String, Integer> genre = new HashMap();
        for(int i = 0; i < genres.length; i++){
            genre.put(genres[i], genre.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<Map.Entry<String, Integer>> entries = genre.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        Stream<Map.Entry<String, Integer>> sorted = genre.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, List<Integer>> list = new HashMap<>();

        for(String s: genre.keySet()){
            list.put(s, new ArrayList<>());
        }

        list.get("pop").add(3);
        list.get("classic").add(5);
        System.out.println(list);

        /

//        System.out.println(sorted.toList().get(0));

    }
}
