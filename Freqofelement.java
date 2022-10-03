// Given a vector of N positive integers and an integer X. The task is to find the frequency of X in vector.

class fre{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2};
        int x = 2;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println(count);
    }
}
