 class Bubblesort {
    public int[] bubblesort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
        
    }
    public static void main(String[] args) {
        Bubblesort bs=new Bubblesort();
        int[] arr={1,5,3,2,4};
        int[] sortedarr=bs.bubblesort(arr);
        for(int i=0;i<sortedarr.length;i++){
            System.out.println(sortedarr[i]);
        }
    }
}
