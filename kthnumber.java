package Math;
public class Kth {
    public static void main(String[] args) {
        int x = 956781;
        int k = 3;
        
        int digits = String.valueOf(k).length();

        if(k > x){
            System.out.println(-1);
        }
        
        int pos = digits - k;

        int digit = (int) (x / Math.pow(10, pos)) % 10;

        System.out.println(digit);
    }
    
}
