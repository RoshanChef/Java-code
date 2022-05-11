import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        // Map<String, Integer> number = new HashMap<String, Integer>();
        
        // //Treeset is as same as Hash set but see the order
        Map<String, Integer> number = new TreeMap<String, Integer>();
        number.put("One", 1);
        number.put("Two", 2);
        number.put("Three", 3);
        number.put("Three", 4); // value is updated
        number.put("Four", 4);

        System.out.println(number);
        // System.out.println(number.containsKey("Four"));
        // System.out.println(number.containsValue(5));

        // number.putIfAbsent("Four", 2);
        // System.out.println(number);

        // number.putIfAbsent("Five", 2);
        // System.out.println(number);

        // number.putIfAbsent("five", 89);
        // System.out.println(number);

        // for(Map.Entry<String , Integer> e: number.entrySet()){
        // System.out.println(e);
        // }

        // for(String key: number.keySet()){
        // System.out.println(key);
        // }

        // for(Integer values: number.values()){
        // System.out.println(values);
        // }

        // System.out.println(number.entrySet());
        // System.out.println(number.keySet());
        // System.out.println(number.values());

        // System.out.println(number.get("Four"));
        // System.out.println(number.get("Five"));
        // System.out.println(number.get("five"));

        // number.remove("Two");
        // number.clear();
        // System.out.println(number);


        System.out.println("\n\n code is finished");
    }
}
