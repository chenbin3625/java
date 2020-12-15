import java.io.*;
import java.util.Scanner;

public class MyRandom {
    public static void main(String[] args) {
        File f=new File("RandomFile.txt");
        try {
            f.createNewFile();
        }
        catch (IOException e){
            System.out.println(e);
        }
        String str="abcdefghijklmnopqrsttuvwxyz";
        try {
            FileWriter fw=new FileWriter(f);
            fw.write(str);
            fw.close();
        }catch (IOException e){
            System.out.println(e);
        }
        int a=-1;
        Scanner reader=new Scanner(System.in);
        while (a<0||a>25){
            System.out.println("please enter a int(1-25)");
            a= reader.nextInt();
        }
        try {
            RandomAccessFile inFile=new RandomAccessFile("RandomFile.txt","r");
            inFile.seek(a);
            char c=(char)inFile.read();
            inFile.close();
            System.out.println("txt中第"+a+"个字符是："+c);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
