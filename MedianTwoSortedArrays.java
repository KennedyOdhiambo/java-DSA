public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge nums1 and nums2 into a single sorted array nums3
        int[] nums3 = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);

        // Determine the length of nums3 and whether it's even or odd
        int nums3Length = nums3.length;
        boolean isEven = nums3Length % 2 == 0;

        // Calculate the median based on whether nums3 has even or odd length
        if (isEven) {
            // If nums3 has even length, average of middle two elements
            int secondMiddleIndex = nums3Length / 2;
            int firstMiddleIndex = secondMiddleIndex - 1;
            return (nums3[firstMiddleIndex] + nums3[secondMiddleIndex]) / 2.0;
        } else {
            // If nums3 has odd length, middle element
            int middleIndex = nums3Length / 2;
            return nums3[middleIndex];
        }
    }
}
