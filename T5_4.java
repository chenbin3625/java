import java.util.Scanner;

public class T5_4 {
    public static void main(String[] args)
    {
        int[][] arr=new int[4][5];
        Scanner reader=new Scanner(System.in);
        int i, j, min, max, minRow=0, minColumn=0, maxRow=0, maxColumn=0;
        System.out.println("Please enter 4*5 array: ");
        for(i=0; i<4; i++)
            for(j=0; j<5; j++)
                arr[i][j]=reader.nextInt();
        for(i=0, min=arr[0][0], max=arr[3][4]; i<4; i++)
            for(j=0; j<5; j++) {
                if(arr[i][j]<=min) {
                    min=arr[i][j];
                    minRow=i;
                    minColumn=j;
                }
                if(arr[i][j]>=max) {
                    max=arr[i][j];
                    maxRow=i;
                    maxColumn=j;
                }
            }

        System.out.println("Max="+max+"   Max Row="+maxRow+"   Max Column="+maxColumn);
        System.out.println("Min="+min+"   Min Row="+minRow+"   Min Column="+minColumn);
    }
}
