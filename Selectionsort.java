class selectionsort{
    public int[] SelectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        selectionsort ss = new selectionsort();
        int[] sorted = ss.SelectionSort(arr);
        for(int i = 0; i < sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
    }
}
