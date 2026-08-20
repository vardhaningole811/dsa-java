import java.util.HashMap;
public class FrequencyCounting{
    public static void CountFrequency(int[] nums){
        HashMap <Integer,Integer> frequency = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(frequency.containsKey(nums[i])){
                int a = frequency.get(nums[i]);
                a++;
                frequency.put(nums[i],a);
            }
            else{
                frequency.put(nums[i],1);
            }
        }
        System.out.println(frequency);

    }

    public static void main(String[] args){
        int[] nums={4,2,4,3,2,4};
        FrequencyCounting.CountFrequency(nums);
    }
    
    
}