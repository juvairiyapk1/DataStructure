import java.util.HashMap;
import java.util.Map;

public class EqualCharacterCount {
    public static String countString(String str){
        Map<Character,Integer>map=new HashMap<>();
        for (char c:str.toCharArray())
        {
          map.put(c,map.getOrDefault(c,0)+1);
        }

        StringBuilder result=new StringBuilder();
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            result.append(entry.getValue()).append(entry.getKey()).append("");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String str="AAABBC";
        String result=countString(str);
        System.out.println(result);
    }
}
