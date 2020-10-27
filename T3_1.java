import java.util.Scanner;

public class T3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("从键盘输入第一个整数：");

        int a = sc.nextInt();
        System.out.println("从键盘输入第二个整数：");

        int b = sc.nextInt();
        System.out.println("从键盘输入第三个整数：");

        int c = sc.nextInt();

        int max;
        if(a>b){
            if(a>c){
                max = a;
            }else {
                max = c;
            }
        }else{
            if(b>c){
                max = b;
            }else{
                max = c;
            }
        }
        System.out.println("最大值为："+max);
    }
}
