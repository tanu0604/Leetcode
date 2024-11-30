//https://leetcode.com/problems/contains-duplicate/description/

package Arrays;

import java.util.HashSet;

public class Duplicate
{
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,7,3,56};
        BruteForce(nums);
        System.out.println(ContainsDuplicate(nums));
    }
    public static void BruteForce(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i]==nums[j]) {
                    System.out.println("Duplicate present: " + nums[i]);
                    return;
                }
            }
        }
    }

    public static boolean ContainsDuplicate(int[] nums) {
      HashSet<Integer> seen=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i]))
            {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }

}
