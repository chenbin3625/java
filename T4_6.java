public class T4_6 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=100;i<=10000;i++){
            int b = i/100;
            int s = (i-100*b)/10;
            int g = (i-s*10-b*100);

            if(i==g*g*g+s*s*s+b*b*b){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();    //换行
        System.out.println("水仙花数总共有"+count+"个");
    }
}
