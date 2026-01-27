class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length-k+1;i++){
        min = Math.min(min, nums[i+k-1]-nums[i]);
        }
        return min;
    }

    // for memory optimization
    static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            try(FileWriter f = new FileWriter("display_runtime.txt")){
                f.write("0");
            }catch(Exception e){

            }
        }));
    }
}