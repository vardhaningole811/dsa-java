public class ReverseArray {

    static void reverse(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50, 60};

        reverse(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}