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

// Sliding Window Technique: The technique can be best understood with the window pane in bus, consider a window of length n and the pane which is fixed in it of length k. Consider, initially the pane is at extreme left i.e., at 0 units from the left. Now, co-relate the window with array arr[] of size n and pane with current_sum of size k elements. Now, if we apply force on the window such that it moves a unit distance ahead. The pane will cover next k consecutive elements. 

// Applying sliding window technique : 

// We compute the sum of first k elements out of n terms using a linear loop and store the sum in variable window_sum.
// Then we will graze linearly over the array till it reaches the end and simultaneously keep track of maximum sum.
// To get the current sum of block of k elements just subtract the first element from the previous block and add the last element of the current block .



 class slidingwindow {
    public static void main(String[] args) {
        int arr[] = {100,200,300,400};
        int k = 2;
        
        if(arr.length < k){
            System.out.println("Invalid");
            return;
        }
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum += arr[i];

            int wsum = max_sum;
            for (int i = k; i < arr.length; i++) {
                wsum += arr[i] - arr[i - k];
                max_sum = Math.max(max_sum, wsum);
            }
        }
        System.out.println(max_sum);
    }
}

