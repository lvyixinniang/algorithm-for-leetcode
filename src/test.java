import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class test {

    private static  class printKV {
        int tag = 0;
        int speed = 0;
        public printKV() {}
        printKV(int tag, int speed) {}

        public int getTag() {
            return tag;
        }
        public void setTag(int tag) {
            this.tag = tag;
        }

        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printKV  maxSpeed = new test.printKV(0 , -1);
        printKV  minSpeed = new test.printKV(0, 32);


        while (sc.hasNext()) {
            // 当前特定帧
            String s = sc.next(); // 64字节， 64*8
            char[] charArrays = s.toCharArray();
            // 39*8 - 1 ~ 39*8 + 3 标志位
            //40*8 - 1 +3 ~ 41 *8 速度

            String tag = s.substring(39 * 8 - 1, 39 * 8 + 3);
            String speed = s.substring(40 * 8 - 1, 41 * 8);

            int speedInt = DeCode(speed);

            // 先解speed
            if (speedInt > maxSpeed.getSpeed()) {
                int tagInt = DeCode(tag);
                maxSpeed.setTag(tagInt);
                maxSpeed.setSpeed(speedInt);
            }
            if (speedInt < minSpeed.getSpeed()) {
                int tagInt = DeCode(tag);
                minSpeed.setTag(tagInt);
                minSpeed.setSpeed(speedInt);
            }
        }

        System.out.println("tag：" + maxSpeed.getTag() + "  " + "speed：" + maxSpeed.getSpeed());

        // 边界测试 0 ， -1， 32 ， 31 ， 5， 6， Integer.MAX_VALUE, Integer.MIN_VALUE
    }

    private static int DeCode(String s) {
        // 1 1 1 1 1
        int len = s.length();
        int res = 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(16);
        for (int i = len - 1; i >= 0; i--) {
            res += (s.charAt(i) - '0') * list.get(len - i - 1);
        }
        return res;
    }


}
