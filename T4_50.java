public class T4_50 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World ! ";String str = str1 + str2;
        System.out.println( "str="+str);
        System.out.println( "str的长度"+str.length());
        System.out.println("str的第8个位置的字符"+str.charAt(7));
        System.out.println("str中字符串'or'第一次出现的位置"+str.indexOf("or"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }

}
