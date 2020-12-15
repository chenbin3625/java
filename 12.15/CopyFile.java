import java.io.*;

public class CopyFile {
        public static void main(String args[]) throws IOException{
            int i;
            FileInputStream fin;
            FileOutputStream fout;
            fin=new FileInputStream("D:\\java\\12.15\\src\\myfile.txt");
            fout=new FileOutputStream("D:\\java\\12.15\\src\\myfile.txt");
            do {
                i=fin.read();
                if (i!=-1)
                    fout.write(i);
            }while (i!=-1);
            fin.close();
            fout.close();
            System.out.println("内容已被复制到txt文件中");
        }
    }
