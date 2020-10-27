import java.util.Scanner;

public class T4_7 {
    public static void main(String[] args) {
        int a=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        a = scanner.nextInt();
        int add=0;
        for(int i=1;i<=a-1;i++)
        {
            if(a%i==0)
                add+=i;
        }
        if(add==a)
            System.out.printf("%d 是完全数", a);
        else System.out.printf("%d 是非完全数", a);

    }
}
