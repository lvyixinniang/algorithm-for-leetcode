package interface150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lc128 {

    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,  1);
        }
        
        return -1;
    }

    public static void main(String[] args) {
        lc128 lc128 = new lc128();
        lc128.longestConsecutive(new int[]{100,4,200,1,3,2});
    }
}
