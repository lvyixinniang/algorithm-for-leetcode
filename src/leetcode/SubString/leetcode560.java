package leetcode.SubString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode560 {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1,1,1}, 2));
    }
    public static int subarraySum(int[] nums, int k) {
/*//        这是一个前缀和的 方法
//        不能直接 sort ,因为 这是求得是子串 , 而且 k 的取值 在 [-10^7 , 10^7]
        int  n = nums.length;
        int[] sums = new int[n];
        int count = 0;
        sums[0] = nums[0];
//        这里有点像 dp 保存 有前面的值
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i-1] + nums[i];
        }
//        map 中存储的 key为 前缀和 value 为出现的 次数
        final HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
//       没看懂 为什么 这样可以查询到 所有子串和等于 K的 , 因为sums中是前缀和 ,没有前缀和减前缀和 的情况
        for (int i = 0; i < n; i++) {
            count += map.getOrDefault(sums[i] - k, 0);
            map.put(sums[i], map.getOrDefault(sums[i], 0) + 1);
        }
        return  count;*/

        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];
        int count = 0;
//        前缀和
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i-1] + nums[i];
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
//            sum[i] - sum[j] == k
            count += map.getOrDefault(sum[i] - k, 0);
            map.put(sum[i], map.getOrDefault(sum[i], 0) + 1);
        }

        return count;
    }
}
