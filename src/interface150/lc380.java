package interface150;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class lc380 {

    class RandomizedSet {
        Set<Integer> set = new HashSet<Integer>(); ;

        public RandomizedSet() {
        }

        public boolean insert(int val) {
            return set.add(val);
        }

        public boolean remove(int val) {
            return set.remove(val);
        }

        public int getRandom() {
            Random rand = new Random();
            int randInt = rand.nextInt(set.size());
            int i = 0;
            for (Integer integer : set) {
                if (randInt == i) {
                    return integer;
                }
                i ++;
            }
            return set.iterator().next();
        }
    }
}
