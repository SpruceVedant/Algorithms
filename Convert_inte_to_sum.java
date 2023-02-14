class sum{
    public int[] getNoZeroIntegers(int n){
        for(int i=1;i<n;i++){
            int j = n - i;
            if(nozero(i) && nozero(j)){
              return new int[] {i,j};
            }
        }
            return null;
    }
        
        private boolean nozero(int n){
            while(n>0){
                if(n % 10 == 0){
                    return false;
                }
                n /= 10;
            }
            return true;
    }
}
