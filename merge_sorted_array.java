class merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0){ // While we have elements remaining to be compared.

                if (i >= 0 && nums1[i] > nums2[j]) // If the element in nums1 is greater than the element in nums2 we assign it to nums2 position
                {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }

        }
    }

}
