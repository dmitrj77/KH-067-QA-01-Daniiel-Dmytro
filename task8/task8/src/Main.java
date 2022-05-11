import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void sortList(List<String> arrays) {

        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        List<String> chars = Arrays.asList(alphabet);
          
            for (int r = 0; r < arrays.size() - 1; r++) {
            getSort(arrays, chars);
        }
    }

    private static void getSort(List<String> arrays, List<String> chars) {
        for (int i = 0; i < arrays.size() - 1; i++) {
            String str = arrays.get(i);
            String str1 = arrays.get(i + 1);

            String[] c = str.toLowerCase().split("");
            String[] c1 = str1.toLowerCase().split("");

            for (int ind = 0; ind < c.length; ) {
                int a = chars.indexOf(c[ind]);
                int b = chars.indexOf(c1[ind]);
                if (a == b) {
                    ind++;
                } else if (a > b) {
                    arrays.add(i, arrays.get(i + 1));
                    arrays.remove(i + 2);
                    break;
                } else break;
            }
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("afc");
        stringList.add("Avc");
        stringList.add("dcaa");
        stringList.add("acd");
        stringList.add("abc");
        stringList.add("zKc");
        stringList.add("mnc");
        stringList.add("jlc");
        stringList.add("xcaa");
        stringList.add("acd");
        stringList.add("abc");
        stringList.add("abc");
        sortList(stringList);
        System.out.printf("");
    }
}
