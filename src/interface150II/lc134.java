package interface150II;

public class lc134 {

        // todo 待重做 2025/7/4 2025/7/19(重做不会） 9/6日重做 10/10 重做
   public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0; // 记录整个环路的净收益
        int current = 0; // 从当前起点开始的累计净收益
        int start = 0; // 起点索引

       for (int i = 0; i < gas.length; i++) {
           int net = gas[i] - cost[i];
           total += net;
           current += net;

//           关键逻辑： 累计收益为负时重置索引
           if (current < 0) {
               start = i + 1;
               current = 0;
           }
       }

       return total >=0 ? start : -1;
   }


    public static void main(String[] args) {
        lc134 lc134 = new lc134();
        System.out.println(lc134.canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
    }
}
