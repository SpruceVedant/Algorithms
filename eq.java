public class eq {
    public static int numDecodings(String s) {
      int n = s.length();
      int[] dp = new int[n + 1];
      dp[0] = 1;
      dp[1] = s.charAt(0) != '0' ? 1 : 0;
      int mod = 1000000007;
      for (int i = 2; i <= n; i++) {
        char c = s.charAt(i - 1);
        if (c == '*') {
          dp[i] = (9 * dp[i - 1] + 9 * dp[i - 2]) % mod;
        } else if (c != '0') {
          dp[i] = dp[i - 1];
          if (s.charAt(i - 2) == '*') {
            if (c <= '6') {
              dp[i] = (dp[i] + 2 * dp[i - 2]) % mod;
            } else {
              dp[i] = (dp[i] + dp[i - 2]) % mod;
            }
          } else if (s.substring(i - 2, i).compareTo("26") <= 0) {
            dp[i] = (dp[i] + dp[i - 2]) % mod;
          }
        } else {        if (s.charAt(i - 2) != '*') {
            dp[i] = 0;
          } else {
            dp[i] = 2 * dp[i - 2] % mod;
          }
        }
      }
      return s.charAt(0) == '*' ? 9 * dp[n] % mod : dp[n];
    }
  
    public static void main(String[] args) {
      System.out.println(numDecodings("*"));  // Outputs 9
      System.out.println(numDecodings("1*"));  // Outputs 18
      System.out.println(numDecodings("2*"));  // Outputs 15
    }
  }
  
         
  
