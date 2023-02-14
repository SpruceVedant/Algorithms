class matches{
    public int numberOfMatches(int n) {
        if(n % 2 != 0){
            n = n - 1;
            return n;
        }else if(n%1 == 0){
            n--;
            return n;
        }
       return n;
    }
}