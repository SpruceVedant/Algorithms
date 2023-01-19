package Deloitee;
public class deloitee {
    static int noOfids(int n){
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;

    }
    static void leftcal(int no){
        int digits = noOfids(no);
        int pow = (int)Math.pow(10,digits - 1);
        for (int i = 0; i < digits; i++) {
            int first_digit = no/pow;

            int left = ((no*10) + first_digit) -(first_digit * pow * 10);
            System.out.println(left + "");
            no = left;
        }
        
    }
    public static void main(String[] args) {
        int no = 56743;
        leftcal(no);
    }
}
