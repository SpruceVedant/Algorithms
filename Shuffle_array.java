class shuffle{
    public int shufflearray(int nums[],int n){
        int res[] = new int[2*n];
        for(int i=0;i<n;i++){
            res[2*i] = res[i];
            res[2*i+1] = res[n+1];
        }
        return res;
    }
}