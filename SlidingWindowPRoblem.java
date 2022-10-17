// Window Sliding Technique is a computational technique which aims to reduce the use of nested loop and replace it with a single loop, thereby reducing the time complexity.

// Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.

// Input  : arr[] = {100, 200, 300, 400}, k = 2
// Output : 700

// Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
// Output : 39
// We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.

// Input  : arr[] = {2, 3}, k = 3
// Output : Invalid
// There is no subarray of size 3 as size of whole array is 2.



// naive approach
 class slidingwindowproblemone {
    public static void main(String[] args) {
        int arr[] = {100,200,300,400};
        int k = 2;
        int currsum = 0;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - k + 1; i++) {
            currsum = 0;
            for (int j = 0; j < k; j++) {
                currsum = currsum + arr[i+j];

                sum = Math.max(currsum, sum);
            }
        }
        System.out.println(sum);
    }
}
