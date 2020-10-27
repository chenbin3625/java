public class T4_1 {
    public static void main(String[] args) {
        int[] a;
        a=new int[10];
        for (int i = 0; i< a.length; i++) {
            System.out.print("a["+i+"]="+a[i]+"");
        }
        System.out.println("\n");
        for (int i = a.length-1; i >=0 ; i--) {
            a[i]=i;
            System.out.print("a["+i+"]="+a[i]+" ");
        }
    }
}
