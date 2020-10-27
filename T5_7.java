import java.util.Scanner;

public class T5_7 {
    public static void main(String[] args)
    {
        String str1, str2;
        Scanner reader=new Scanner(System.in);
        System.out.print("Please enter string1: ");
        str1=reader.nextLine();
        System.out.print("Please enter string2: ");
        str2=reader.nextLine();
        int cmp;
        cmp=str1.compareTo(str2);
        System.out.println("Result="+cmp);
    }
}
