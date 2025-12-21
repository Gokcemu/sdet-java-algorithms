package intermediate;

import java.util.*;

public class RemoveDuplicatesBruteForce {
    public static List<Integer> removeDuplicatesBruteForce(List<Integer> list){

        for(int i=0; i< list.size(); i++){
            for( int j = i +1; j < list.size(); j++){
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,3,4,5,5));
        List<Integer> result = removeDuplicatesBruteForce(arrayList);
        if (result != null) {
            System.out.println(result + ", ");
        }
    }
}
