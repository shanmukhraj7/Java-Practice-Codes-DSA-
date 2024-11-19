import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class majorityElement {
    public static List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        int cnt1 = 0, cnt2 = 0, cand1 = 0, cand2 = 0;
        
        for(int num : nums){
            if(num == cand1) cnt1++;
            else if(num == cand2) cnt2++;
            else if(cnt1 == 0){
                cand1 = num;
                cnt1 = 1;
            }
            else if(cnt2 == 0){
                cand2 = num;
                cnt2 = 1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        
        cnt1 = 0;
        cnt2 = 0;
        for(int num : nums){
            if(num == cand1) cnt1++;
            else if(num == cand2) cnt2++;
        }
        
        if(cnt1 > n/3) res.add(cand1);
        if(cnt2 > n/3) res.add(cand2);
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        System.out.println(findMajority(arr));
    }
}
