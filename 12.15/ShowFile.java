import java.io.*;

public class ShowFile {
    public static void main(String args[]) throws IOException{
        int i;
        FileInputStream fin;
        fin=new FileInputStream("D:\\java\\12.15\\src\\myfile.txt");
        do {
            i=fin.read();
            if (i!=-1) System.out.println((char)i);
        }while (i!=-1);
        fin.close();
    }
}
