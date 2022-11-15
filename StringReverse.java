 public class StringReverse {
    public static void main(String[] args) {
        String s = "Hello";
        String rev = "";
        StringBuilder sb = new StringBuilder(s);
        sb.append(s);
        sb.reverse();
        System.out.println(sb);
    }
}



