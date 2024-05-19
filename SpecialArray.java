public class SpecialArrayChecker {
    
    public static boolean isSpecialArray(int[] nums) {
        // Iterate through the array, checking pairs of adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            // Check if nums[i] and nums[i+1] have different parities
            if (nums[i] % 2 == nums[i + 1] % 2) {
                // If they have the same parity, the array is not special
                return false;
            }
        }
        // If no adjacent elements have the same parity, the array is special
        return true;
    }

    public static void main(String[] args) {
        // Example test cases
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {2, 4, 6, 8};
        int[] nums3 = {1, 3, 5, 7};
        int[] nums4 = {1, 2, 2, 3};

        System.out.println(isSpecialArray(nums1)); // Should print true
        System.out.println(isSpecialArray(nums2)); // Should print false
        System.out.println(isSpecialArray(nums3)); // Should print false
        System.out.println(isSpecialArray(nums4)); // Should print false
    }
}
