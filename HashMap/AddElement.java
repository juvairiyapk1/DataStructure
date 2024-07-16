package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class AddElement {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("kunal",55);
        map.put("Rahul",88);
        map.putIfAbsent("Ravi",99);
        map.put("Ram",55);
//        System.out.println(map.get("kunal"));
//        System.out.println(map.containsKey("rabi"));
//        System.out.println(map.getOrDefault("rabi",100));
        System.out.println(map);
//        map.remove("kunal");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map);


        HashSet<Integer>set=new HashSet<>();
        set.add(88);
        set.add(22);
        set.add(88);
        System.out.println(set);
    }

}
