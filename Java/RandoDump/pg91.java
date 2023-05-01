package classroom;

public class pg91 {
    public static void main(String[] args) {
        int[] nums = {4,4,2,4,3};
        Solution s = new Solution();
        System.out.println(s.unequalTriplets(nums));
    }
}

class Solution {
    public int unequalTriplets(int[] nums){
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]) continue;
                for(int k=j;k<nums.length;k++){
                    if( nums[i] != nums[k] && nums[j] != nums[k] )
                        c++;
                }
            }
        }
        return c;
    }
}   
