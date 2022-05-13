
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> arraylist = new ArrayList<>();
        Set<String> setList = new HashSet<>();
        Queue<String> queue = new ArrayDeque<>();
        Map<String, String> map = new HashMap<>();

        arraylist.add("car");
        arraylist.add("bus");
        arraylist.add("truck");
        arraylist.add("bus");
        arraylist.add(1, "sedan");
        System.out.println(arraylist.size());
        System.out.printf(arraylist.toString());
        arraylist.remove(3);
        arraylist.remove("bus");
        System.out.printf(arraylist.toString());
        System.out.println(arraylist.contains("car"));
        System.out.println(arraylist);
        System.out.println(arraylist.isEmpty());
        System.out.printf(arraylist.get(2));
        System.out.println(arraylist.indexOf("bus"));
        System.out.println(arraylist.lastIndexOf("bus"));
        arraylist.set(2, "bike");
        System.out.printf(arraylist.toString());
        System.out.println(arraylist.equals(null));

        setList.add("car");
        setList.add("bus");
        setList.add("sedan");
        setList.add("bus");
        System.out.println(setList.isEmpty());
        // setList = (Set<String>) arraylist;
        System.out.printf(setList.toString());
        System.out.println(setList.size());
        System.out.println(setList.contains("bus"));


        queue.add("WV");
        System.out.println(queue.offer("bmw"));
        System.out.println(queue.offer("bmw"));
        System.out.println(queue.remove("bus"));
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        map.put("model1", "vw");
        map.put("model2", "bmw");
        map.put("model3", "bmw");
        System.out.println(map.get("model1"));
        System.out.println(map.size());
        System.out.println(map.remove("model1"));
        System.out.println(map.remove("model1", "bmw"));
        System.out.println(map.containsKey("model3"));
        System.out.println(map.containsValue("bmw"));
        System.out.println(map.containsValue("saab"));
        System.out.println(map);
        Set<String> string = map.keySet();
        System.out.println(string);
        Collection<String> values = map.values();
        System.out.println(values);
    }
}
