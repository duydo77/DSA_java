package array;

public class _88_ {
    
    public static void insert(int[] nums, int n, int m){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > n){
                for (int j = nums.length; j > i; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[i] = n;
                return;
            }
        }
        nums[m] = n;
        return;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

    }

    public static void main(String[] args) {
        
    }
}
