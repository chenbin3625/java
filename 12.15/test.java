import java.io.File;
import java.io.RandomAccessFile;

public class test {
    public static void main(String[] args) {
        File file = new File("RandomFile.txt");
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            long length = raf.length();
            StringBuffer sb = new StringBuffer();
            while (length > 0) {
                length--;
                raf.seek(length);
                int c = (char) raf.readByte();
                if (c >= 0 && c <= 255) {
                    sb.append((char) c);
                } else {
                    length--;
                    raf.seek(length);
                    byte[] cc = new byte[2];
                    raf.readFully(cc);
                    sb.append(new String(cc));
                }
            }
            System.out.println(sb);
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}