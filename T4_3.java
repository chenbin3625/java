import java.util.Scanner;

public class T4_3 {
    public static void main(String[] args) {
        int x;
        Scanner reader=new Scanner(System.in);
        System.out.println("从键盘上输入一个1~100的整数");
        x=reader.nextInt();
        boolean y;
        if(x%7==0&&x%3==0)y=true;
        else y=false;
        System.out.println("该数是否可以被3和7整除:");
        if(y) System.out.println("是");
        else System.out.println("否");
    }
}
