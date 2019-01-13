import java.util.Set;
import java.util.HashMap;
public class HashMatique{
    public static void hashMap(String keyes){
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Halka Halka", "Yeh jo halka halka");
        userMap.put("Judaiyan", "Akhiyn ne tadap laya");
        userMap.put("Tere Liye", "Dil ki tammanna hai");
        userMap.put("Tune Jo Na Kaha", "Jane kiski hamein lag gae");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        System.out.println("Lyrics for selected Title "+keyes+" is: "+userMap.get(keyes));
        for(String key : keys) {
            System.out.println("Track: "+key);
            System.out.println("Lyrics: "+userMap.get(key));    
        }
    }
    
}