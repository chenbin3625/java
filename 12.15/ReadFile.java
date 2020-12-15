import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException{
        char []c=new char[500];
        FileReader fr=new FileReader("D:\\java\\12.15\\src\\myfile.txt");
        int num=fr.read(c);
        String str=new String(c,0,num);
        System.out.println("读取的字符个数为："+num+",内容：");
        System.out.println(str);
    }
}
