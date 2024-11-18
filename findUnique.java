public class findUnique {
    public static void main(String[] args) {
        int[] unique = {2,3,3,4,2,6,4};
        System.out.println(ans(unique));
    } 

    public static int ans(int[] nums) {
        int result = 0;
        for(int n : nums)
        {
            result ^= n;
        }
        return result;
    }
}
