import java.util.Arrays;
class minmaxarr{
  public static void main(String[] args){
    int arr[] = {1,2,3,4,5,6};
    int n = 6;
    int res  = new int[arr.length];
    int max = arr[n - 1];
    int min = arr[0];
    
    for(int i=0;i<arr.length;i++){
      if(i%2 == 0){
        res[i] = max;
        max--;
    }
      else{
        res[i] = min;
        min++;
      }
      System.out.println(Arrays.toString(res));
  }
}
