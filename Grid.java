import java.util.Scanner;

public class grid {
    public static int getNoOfSquares(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int squares_of_size_i = (n - i + 1) * (n - i + 1);
            count += squares_of_size_i;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int result = getNoOfSquares(n);
        System.out.println("Number of sqrs" + n + " x " + n + "result" + result);
    }
}
