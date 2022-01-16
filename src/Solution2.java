import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution2 {


    public static void main(String[] args) {


        String[] phone = { "119", "97674223", "1195524421", "1" };


        Map map = new HashMap();

        int i = 0;
        for(String p: phone){
            map.put(p, i++);

        }


        System.out.println(map.size());

        System.out.println("119".hashCode());
        System.out.println("97674223".hashCode());
        System.out.println("1195524421".hashCode());
        System.out.println("1".hashCode());



        Iterator<String> keys = map.keySet().iterator();

        while( keys.hasNext() ){
            String key = keys.next();
            System.out.println( String.format("키 : %s, 값 : %d", key, map.get(key)) );
        }


//        for(String p: phone){
//
//            for(int i = 1; i < p.length(); i++){
//
//            }
//        }

    }
}
