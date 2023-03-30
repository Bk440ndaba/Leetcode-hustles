import java.util.*;

public class TwoSum {
    public static void main(String [] args)
    {
        int [] nums = {2, 7, 9, 15};
        int target = 9;

        ArrayList<Integer> number = new ArrayList<>();
        for(int i = 0; i<nums.length; i++)
        {
            for(int k = i+1; k<nums.length; k++)
            {
                if(nums[i] + nums[k] == target)
                {
                    number.add(i);
                    number.add(k);
                    for(int m = 0; m<number.size(); m++)
                    {
                        System.out.println("Output: " + nums[m]);
                    }  

                    //System.out.println("Output: " + nums);
                    
                }

                else
                {
                    //System.out.println("No target found.");
                }
            }
        }

    }
}
