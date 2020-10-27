import java.util.Scanner;

public class T4_2 {
    public static void main(String[] args) {
        int i,max,min;
        int[] a=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("从键盘输入5个整数:");for (i =0; i< 5; i++) {
            a[i]=sc.nextInt();
        }
        max=Integer .MIN_VALUE;min=Integer .MAX_VALUE;for (i =0; i< 5; i++) {
            max=a[i]>max?a[i] : max;min=a[i]<min?a[i]:min;
        }
        System.out.print("最大的数是:"+max);System.out.print("最小的数是:"+min);
    }

}
