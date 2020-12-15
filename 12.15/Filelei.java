import java.io.File;

public class Filelei {
    public static void main(String[] args) {
        listAllFiles("D:\\java\\12.15\\src");
    }
    public static void listAllFiles(String dirName) {
        if (!dirName.endsWith(File.separator)) {
            dirName = dirName + File.separator;
        }
        File dirFile = new File(dirName);
        if (!dirFile.exists() || (!dirFile.isDirectory())) {
            System.out.println("List失败！找不到目录：" + dirName);
        }

        File[] files = dirFile.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                System.out.println(files[i].getAbsolutePath() + " 是文件！");
            } else if (files[i].isDirectory()) {
                System.out.println(files[i].getAbsolutePath() + " 是目录！");
            }
        }
    }
}