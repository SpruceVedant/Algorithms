 class Insertionsort {
    public int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        Insertionsort is = new Insertionsort();
        int[] arr = {5, 4, 3, 2, 1};
        int[] sorted = is.insertionSort(arr);
        for(int i = 0; i < sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
    }
    
}
