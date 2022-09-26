// Given two numbers A and B. The task is to find out their LCM and GCD.
class lacmandgcd{
    public static void main(String[] args) {
        int a = 14;
        int b = 8;
        int lcm = (a > b) ? a : b;
        while(true){
            if(lcm % a == 0 && lcm % b == 0){
                System.out.println("LCM = " + lcm);
                break;
            }
            lcm++;
        }
        int gcd = (a < b) ? a : b;
        while(true){
            if(a % gcd == 0 && b % gcd == 0){
                System.out.println("GCD = " + gcd);
                break;
            }
            gcd--;
        }
    }
}
