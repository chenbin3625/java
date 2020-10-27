public class T4_10 {
    public static void main(String args[]) {
        double length = 3000;
        int day = 0;
        while (length > 5) {
            length = 0.5 * length;
            day++;
        }
        System.out.println("3000米的绳子每天减去一半," + day + "天时间长度短于5米");     //输出结果
    }
}
