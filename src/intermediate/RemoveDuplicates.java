package intermediate;

import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static List<Integer> removeDuplicatesPreserveOrder(List<Integer> list){
        Set<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
     }

     public static List<Integer> removeDuplicatesDefinedList(){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,5));
        Set<Integer> set = new LinkedHashSet<>(arrayList);
        return new ArrayList<>(set);
     }
}
