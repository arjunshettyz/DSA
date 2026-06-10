class Solution {
    public int[] twoSum(int[] nums, int target) {
    
    Set<Integer> seen = new HashSet<>();
    for(int num:nums){
        seen.add(num);
    }

    for(int i=0;i<nums.length;i++){
        int complement = target-nums[i];
        if(seen.contains(complement)){
            for(int j =0;j<nums.length;j++){
              if(nums[j] == complement && i!=j){
                return new int[] {i,j};
              }  
            }
        }
    }
    return new int[] {};
    }
}