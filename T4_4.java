import java.util.Scanner;

public class T4_4 {
    public static long factorialSum(int num) {
        long sum = 0;
        long temp = 1;
        for (int i = 1; i <= num; i++) {
            temp *= i;

            sum += temp;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个的整数：");

        try {
            // 取出控制台输入的信息
            int number = scanner.nextInt();
            long sum = factorialSum(number);
            System.out.print("1到" + number + "的阶乘和为" + sum);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print("请输入整数");

        }

    }
}
