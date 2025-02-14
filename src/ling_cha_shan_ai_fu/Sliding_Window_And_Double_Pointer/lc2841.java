package ling_cha_shan_ai_fu.Sliding_Window_And_Double_Pointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc2841 {
        public static long maxSum(List<Integer> nums, int m, int k) {
            //  定长滑动窗口
            long sum = 0;
            long maxx = 0;
            int len = nums.size();
            // 需要一个桶，记录 使用Map 来确认不重复的数
            Map<Integer, Integer> map = new HashMap<>();
            int noRepeated = 0;
            for (int i = 0; i < k; i++) {
                sum += nums.get(i);
                map.put(nums.get(i), i);
            }
            for (int i = 1; i <= len - k; i++) {
                if (map.size() >= m && sum > maxx) {
                    maxx = sum;
                }
                sum += nums.get(i + k - 1);
                sum -= nums.get(i - 1);
                Integer remove = map.remove(nums.get(i - 1));

                map.put(nums.get(i + k - 1), i + k - 1);
            }
            if (map.size() >= m && sum > maxx) {
                maxx = sum;
            }
            return maxx;
        }

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(3);
//            list.add(1);
//            list.add(2);
//            list.add(1);
            System.out.println(maxSum(list, 2, 2));
        }


}
