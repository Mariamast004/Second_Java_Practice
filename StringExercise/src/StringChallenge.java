public class StringChallenge {
    public static void main(String[] args) {
       String str = "   Mariama Mansaray";
       String str2 = " Mariama Kanu";
       String result = str.replace(str, str2);
        System.out.println(str.contains("Kanu"));
        System.out.println(result.toUpperCase());
    }
}
