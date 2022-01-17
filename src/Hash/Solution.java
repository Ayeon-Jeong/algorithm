package Hash;

import java.util.*;

public class Solution {

    public String solution(String[] participant, String[] completion){
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for(String player : completion){
            map.put(player, map.get(player) - 1);
        }

        return answer;
    }



    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(new Solution().solution(participant, completion));

//        System.out.println("Hello");
    }
}
