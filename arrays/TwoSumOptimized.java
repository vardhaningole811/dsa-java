import java.util.HashMap;
public class TwoSumOptimized {
    static int[] TwoSum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int required=target-nums[i];
            if (map.containsKey(required)){
                return new int[]{map.get(required),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
    public static void main(String[] args){
        int [] nums={1,5,9,3,2,4};
        int target = 7;
        int [] result = TwoSum(nums,target);
        System.out.println("The indices are: "+result[0]+" and "+result[1]);
    }
}
