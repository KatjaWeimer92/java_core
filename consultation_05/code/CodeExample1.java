public class CodeExample1 {
    public static void main(String[] args) {
        String str1 = "Text";
        String str2 = "Text";
        String str3 = new String("Text");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
