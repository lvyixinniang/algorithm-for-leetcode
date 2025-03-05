public class outOfStack {

    public static void main(String[] args) {
        digui(0);
    }

    public static void digui(int i) {
        i ++;
        System.out.println(i);
        digui(i);
    }
}
