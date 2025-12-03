import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e : list) {
            char c = e.getKey();
            int f = e.getValue();
            for (int i = 0; i < f; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        SortCharacterByFrequency sorter = new SortCharacterByFrequency();
        String input = "tree";
        String result = sorter.frequencySort(input);
        System.out.println("Sorted by frequency: " + result);
    }
}
