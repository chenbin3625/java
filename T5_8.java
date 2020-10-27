import java.util.Scanner;

public class T5_8 {
    public static void main(String[] args)
    {
        String str;
        Scanner reader=new Scanner(System.in);
        System.out.print("Please enter string: ");
        str=reader.nextLine();
        int sLocation, length;
        System.out.print("Please enter start location: ");
        sLocation=reader.nextInt();
        System.out.print("Please enter length: ");
        length=reader.nextInt();
        while((sLocation+length-1)>str.length())
        {
            System.out.print("Error!Retry!\n");
            System.out.print("Please enter length: ");
            length=reader.nextInt();
        }
        String sub="";
        int i, n=str.length();
        for(i=0; i<n; i++)
            sub=str.substring(sLocation-1, sLocation+length-1);
        System.out.println("The new string: "+sub);
    }
}
