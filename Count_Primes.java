class Solution {
    public int countPrimes(int n) {
        int count = 0;
    boolean[] isPrime = new boolean[n];
    Arrays.fill(isPrime, true);

    for(int i=2;i<n;i++){
        if(isPrime[i]){
          count++;
          for(int j =i*2;j<n;j += i){
               isPrime[j] = false;
          }
        }
       
    }
     return count;
}}
