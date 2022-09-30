class abc{
    public int kadane(int arr[]){
        int max = arr[0];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }

        return sum;

    }
   public static void main(String[] args) {
         int arr[] = {1,2,3,-2,5};
         abc a = new abc();
         int b = a.kadane(arr);
    System.out.println(b);
    
   }

}
