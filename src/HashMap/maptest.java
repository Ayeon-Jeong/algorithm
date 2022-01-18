package HashMap;

import java.util.*;
import java.util.stream.Collectors;

public class maptest {

    int index;
    int count;

    public maptest(int index, int count) {
        this.index = index;
        this.count = count;
    }

    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop", "oldpop"};
        int[] plays = {500, 600, 150, 800, 2500, 1000};

        Map<String, Integer> genre = new HashMap();
        for(int i = 0; i < genres.length; i++){
            genre.put(genres[i], genre.getOrDefault(genres[i], 0) + plays[i]);
        }
//        System.out.println(genre);

        List<Map.Entry<String, Integer>> entries = genre.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        Map<String, List<maptest>> list = new HashMap<>();

        for(String s: genre.keySet()){
            list.put(s, new ArrayList<maptest>());
        }

        for(int i = 0; i < genres.length; i++){
            list.get(genres[i]).add(new maptest(i, plays[i]));
        }

//        list.get("pop").add(new maptest(0, 500));


        System.out.println(list.get("pop").stream().count());

        List<Integer> answer = new ArrayList<>();

        for(Map.Entry<String, Integer> g: entries){
            int cnt = 0;
            while(cnt < 2){
                //answer.add(노래번호)
                //노래번호 = list.get("장르").get(0).index
                answer.add(list.get())
            }
        }

    }
}
