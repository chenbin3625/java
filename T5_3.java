public class T5_3 {
    public static void main(String[] args) {
        int score[]={37,89,63,60,59,78,91};int sum=0;
        for (int i = 0; i < score.length; i++) {
            if(score[i]<60){
                sum++;
            }
        }
        System.out.println("below 60 sum : "+sum);
    }
}
