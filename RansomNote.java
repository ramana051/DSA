import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c: magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:ransomNote .toCharArray()){
            // if(map.containsKey(c)){
            //     int r= map.get(c);
            //     if(r>0) map.put(c,(r-1));
            //     else return false;
            // }else return false;
            if(!map.containsKey(c)||map.get(c)<=0) return false;
            map.put(c,map.get(c)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        RansomNote ransomNoteChecker = new RansomNote();
        String ransomNote = "aa";
        String magazine = "aab";
        boolean result = ransomNoteChecker.canConstruct(ransomNote, magazine);
        System.out.println("Can construct ransom note: " + result);
    }
}
