package array;

public class _1295_Find_Number {
    public static int countNumberOfDigits(int num){
        
        if (num == 0){
            return 1;
        }
        
        int numOfDigits = 0;
        int r = num; // devidsion remainder
        while (r != 0){
            numOfDigits += 1;
            r = r / 10;
        }
        
        return numOfDigits;
    }
    
    public static int findNumbers(int[] nums) {
        int res = 0;
        for (int i:nums){
            if (countNumberOfDigits(i) % 2 == 0){
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 44};
        System.out.println(findNumbers(a));
    }
}