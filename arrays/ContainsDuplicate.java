import java.util.HashSet;
public class ContainsDuplicate{
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (seen.contains(nums[i])){
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums={4,7,2,9,7,5};
        System.out.println(containsDuplicate(nums));
    }
}
